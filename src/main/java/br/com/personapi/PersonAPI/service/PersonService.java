package br.com.personapi.PersonAPI.service;

import br.com.personapi.PersonAPI.dto.response.MessageResponseDTO;
import br.com.personapi.PersonAPI.dto.request.PersonDTO;
import br.com.personapi.PersonAPI.entity.Person;
import br.com.personapi.PersonAPI.exception.PersonNotFoundException;
import br.com.personapi.PersonAPI.mapper.PersonMapper;
import br.com.personapi.PersonAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson =  personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created Person With ID"+savedPerson.getId())
                .build();
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople =  personRepository.findAll();
        return allPeople.stream().map(personMapper::toDTO).collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = VerifyPerson(id);
        return personMapper.toDTO(person);
    }

    private Person VerifyPerson(Long id) throws PersonNotFoundException {
        return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
    }

    public void delete(Long id) throws PersonNotFoundException {
        VerifyPerson(id);

        personRepository.deleteById(id);
    }
}
