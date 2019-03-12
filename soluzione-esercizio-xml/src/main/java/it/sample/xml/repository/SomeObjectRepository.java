package it.sample.xml.repository;

import org.springframework.data.repository.CrudRepository;

import it.sample.xml.entity.SomeObject;

public interface SomeObjectRepository extends CrudRepository<SomeObject, String>{

}
