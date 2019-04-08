package it.my.mfdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eaio.uuid.UUID;

import it.my.mfdemo.model.Country;

public interface CountryRepository extends JpaRepository<Country, UUID>{}
