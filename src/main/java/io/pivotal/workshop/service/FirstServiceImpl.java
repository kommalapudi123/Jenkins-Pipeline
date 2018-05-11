package io.pivotal.workshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import io.pivotal.workshop.dto.Person;

@Service
public class FirstServiceImpl {

	public Person getPersonDetails(int id) {
		List<Person> persons = this.mockStudents();
		return persons.stream().filter(p -> p.getsNo() == id).collect(Collectors.toList()).get(0);
	}

	public List<Person> mockStudents() {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Rajamohan", 25, "Kadapa"));
		persons.add(new Person(2, "Krishna", 25, "Palamaner"));
		persons.add(new Person(3, "Prasad Raju", 43, "Chittoor"));
		return persons;
	}

}
