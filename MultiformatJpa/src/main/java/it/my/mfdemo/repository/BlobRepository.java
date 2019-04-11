package it.my.mfdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.my.mfdemo.model.BlobStorage;

public interface BlobRepository extends JpaRepository<BlobStorage, Integer> {

}
