package com.ckk.springbootproject.models;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
	
	
	private String name;
	private Subject subjects;

}
