package io.pivotal.workshop.controller;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.pivotal.workshop.dto.Person;
import io.pivotal.workshop.service.FirstServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class FirstControllerTest {

	@InjectMocks
	FirstController firstController;

	@Mock
	FirstServiceImpl firstServiceImpl;

	@Test
	public void testHome() {
		Person person = new Person(1, "Rajamohan", 25, "Kadapa");
		int id = 1;
		when(firstServiceImpl.getPersonDetails(id)).thenReturn(person);
		Person result = firstController.home(id);
		Assert.assertEquals(person.getName(), result.getName());
	}
	
	@Test
	public void testHomeStatus() {
		
	}

}
