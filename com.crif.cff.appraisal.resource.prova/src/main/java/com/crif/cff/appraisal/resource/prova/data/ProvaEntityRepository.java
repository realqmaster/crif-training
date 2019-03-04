package com.crif.cff.appraisal.resource.prova.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crif.cff.appraisal.resource.prova.entity.ProvaEntity;
import com.eaio.uuid.UUID;

public interface ProvaEntityRepository extends JpaRepository<ProvaEntity, UUID> {

}
