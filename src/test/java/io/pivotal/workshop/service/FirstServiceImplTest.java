package io.pivotal.workshop.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.pivotal.workshop.dto.Person;

@RunWith(SpringJUnit4ClassRunner.class)
public class FirstServiceImplTest {
	
	//Calling exact method, so no need of Mock
	FirstServiceImpl firstServiceImpl = new FirstServiceImpl();
	
	@Test
	public void testGetPersonDetails() {
		Person person = new Person(1, "Rajamohan", 25, "Kadapa");
		int id = 1;
		Person result = firstServiceImpl.getPersonDetails(id);
		Assert.assertEquals(person.getName(), result.getName());
	}

}
