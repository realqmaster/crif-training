package it.sample.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.sample.xml.entity.OtherObject;
import it.sample.xml.entity.SomeObject;
import it.sample.xml.repository.OtherObjectRepository;
import it.sample.xml.repository.SomeObjectRepository;

@Service
public class ObjectSavingService {
	
	@Autowired
	private SomeObjectRepository someRepo;
	
	@Autowired
	private OtherObjectRepository otherRepo;
	
	public void saveAll(List<SomeObject> someList, List<OtherObject> otherList) {
		someRepo.saveAll(someList);
		otherRepo.saveAll(otherList);
	}

}
