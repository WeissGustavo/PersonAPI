package br.com.personapi.PersonAPI.service;

import br.com.personapi.PersonAPI.dto.MessageResponseDTO;
import br.com.personapi.PersonAPI.entity.Person;
import br.com.personapi.PersonAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson =  personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created Person With ID"+savedPerson.getId())
                .build();
    }
}
