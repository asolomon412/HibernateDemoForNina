package co.grandcircus.HibernateDemo109.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.HibernateDemo109.model.Person;

// JPA Repository documentation
// https://docs.spring.io/spring-data/jpa/docs/1.5.0.RC1/reference/html/jpa.repositories.html

// all you need to do to take advantage of the built in CRUD methods is create an interface
// that extends the JpaRepository -- the generics represent the class (first param) and the
// primary key type as the second param

public interface PersonRepo extends JpaRepository<Person, Integer>{
	
	
	// if you expect the query to return multiple results assign it as a List
	List<Person> findByName(String name);
	// if you are only expecting a single matching result assign it to the associated type
}
