package com.pfms.test.db.repo;

import org.springframework.data.repository.CrudRepository;

import com.pfms.test.db.entity.Person;

public interface PersonRepository extends CrudRepository<Person, String> {

	Person findByName(String name);

	Iterable<Person> findByTeammatesName(String name);
}
