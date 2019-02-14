package it.euris.sample.forex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.euris.sample.forex.entity.Trader;


public interface TraderRepository extends JpaRepository<Trader, Long> {
	

}
