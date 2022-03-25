package com.java8learn.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractPerson {
	private String lname;
	private int age;
	
	public abstract void sayHello();
	public abstract void setPersonType(String type);

}
