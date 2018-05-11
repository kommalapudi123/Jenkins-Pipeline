package io.pivotal.workshop.dto;

public class Person {

	private int sNo;
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public Person(int sNo, String name, int age, String address) {
		super();
		this.sNo = sNo;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int parametersListSNoparametersWay) {
		sNo = parametersListSNoparametersWay;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int parametersListAgeparametersWay) {
		age = parametersListAgeparametersWay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String parametersListAddressparametersWay) {
		address = parametersListAddressparametersWay;
	}

	public void setName(String parametersListNameparametersWay) {
		name = parametersListNameparametersWay;
	}

	@Override
	public String toString() {
		return "Person [sNo=" + sNo + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
