package it.my.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SharedKeyDemoApplicationTests {
	
	@Autowired
	private SubjectRepo repo;

	@Test
	public void sharedKeyWorksAsIntended() {
		
		for (int i = 0; i < 11; i++) {
			
			Subject s = new Subject();
			PrivateIndividual p = new PrivateIndividual();		
			s.setPrivateIndividual(p);		
			repo.save(s);			
		}

		
		List<Subject> test = repo.findAll();
		for (Subject subject : test) {			
			assertNotNull(subject.getPrivateIndividual());
			assertEquals(subject.getUidSubject(), subject.getPrivateIndividual().getId());

		}
	}

}
