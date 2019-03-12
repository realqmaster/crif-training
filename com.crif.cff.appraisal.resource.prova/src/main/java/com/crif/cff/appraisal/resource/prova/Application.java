package com.crif.cff.appraisal.resource.prova;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.crif.cff.appraisal.resource.prova.data.ProvaEntityRepository;
import com.crif.cff.appraisal.resource.prova.entity.ProvaEntity;
import com.crif.cff.appraisal.resource.prova.entity.SubProvaEntity;
import com.crif.cff.shared.commons.service.CFService;
import com.crif.cff.shared.commons.util.CFFTypesRepository;
import com.eaio.uuid.UUID;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.crif.cff")
public class Application implements ApplicationRunner {

	@Autowired
	private ProvaEntityRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CFService cfService() {
		return new CFService();
	}

	@Bean
	public CFFTypesRepository cffTypesRepository() {
		return new CFFTypesRepository();
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		ProvaEntity test = new ProvaEntity();
		test.setProvaId(new UUID("adbf7bac-3c39-11e9-b210-d663bd873d93"));
		test.setFoo("aaa");
		test.setBar("bbb");
		
		SubProvaEntity sub = new SubProvaEntity();
		sub.setId("123abc");
		sub.setDescr("We all live in a yellow subentity");
		sub.setParent(test);
		
		test.setChildren(Collections.singletonList(sub));

		repository.save(test);

	}
}
