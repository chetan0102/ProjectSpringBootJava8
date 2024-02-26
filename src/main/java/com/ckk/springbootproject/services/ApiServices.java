package com.ckk.springbootproject.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ckk.springbootproject.models.Student;
import com.ckk.springbootproject.models.Subject;

@Service
public class ApiServices {

	public List<Student> AllStudents() {

		List lsS = Arrays.asList(new Student("Chetan", Subject.Java),
				new Student( "Pooja", Subject.Dot_net), new Student("Raj", Subject.RestAPI),
				new Student("Ketan", Subject.Java_8), new Student( "Priya", Subject.MySQL),
				new Student( "Darshana",Subject.Java), new Student( "Manoj",Subject.RestAPI),
				new Student("Prasad",Subject.Java));

		return lsS;

	}

}
