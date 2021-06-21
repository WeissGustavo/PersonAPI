package br.com.personapi.PersonAPI.repository;

import br.com.personapi.PersonAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
