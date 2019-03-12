package com.crif.cff.appraisal.resource.prova.service;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.crif.cff.appraisal.resource.prova.data.ProvaEntityRepository;
import com.crif.cff.appraisal.resource.prova.entity.ProvaEntity;
import com.crif.cff.appraisal.resource.prova.model.Prova;
import com.crif.cff.appraisal.resource.prova.model.ProvaInput;
import com.crif.cff.shared.commons.model.CFFKey;
import com.crif.cff.shared.resource.CFFResourceRepository;
import com.eaio.uuid.UUID;

@Service("provaResourceRepository")
public class ProvaResourceRepository implements CFFResourceRepository<Prova, ProvaInput, CFFKey<UUID>> {
	
	@Autowired
	private ProvaEntityRepository repository;
	
	private Mapper mapper = new DozerBeanMapper();

	@Override
	public Prova get(CFFKey<UUID> id) {
		CFFKey<UUID> cffKey = new CFFKey<UUID>();
		ProvaEntity entity = repository.getOne(id.getKey());
		cffKey.setKey(entity.getProvaId());
		

		Prova copied = mapper.map(entity, Prova.class);

		return copied;
	}

	@Override
	public Page<Prova> search(Pageable pageable, ProvaInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prova insert(Prova resource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prova update(Prova resource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(CFFKey<UUID> id) {
		// TODO Auto-generated method stub
		return false;
	}

}
