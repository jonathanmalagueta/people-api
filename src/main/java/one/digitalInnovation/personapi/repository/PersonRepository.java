package one.digitalInnovation.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalInnovation.personapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
