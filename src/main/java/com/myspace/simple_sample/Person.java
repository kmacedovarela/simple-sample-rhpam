package com.myspace.simple_sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.util.Date birthDate;

	public Person() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.util.Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}

	public Person(java.lang.String name, java.util.Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

}