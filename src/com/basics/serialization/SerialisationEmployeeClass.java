package com.basics.serialization;

import java.io.Serializable;

// object class that will be serialized to the new .ser file
public class SerialisationEmployeeClass implements Serializable {

	int Id;
	String name;
	double salary;
//	transient is used when we do not want the field/class to be serialized.
	 transient int ssn;

	public SerialisationEmployeeClass(int Id, String name, double salary, int ssn) 
	{
		this.Id = Id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}

}
