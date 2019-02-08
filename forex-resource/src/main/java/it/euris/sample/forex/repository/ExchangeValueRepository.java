package it.euris.sample.forex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.euris.sample.forex.entity.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String form, String to);
}