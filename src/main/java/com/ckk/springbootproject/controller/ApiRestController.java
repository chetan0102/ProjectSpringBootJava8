package com.ckk.springbootproject.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ckk.springbootproject.models.Subject;
import com.ckk.springbootproject.services.ApiServices;

@RestController
public class ApiRestController {

	@Autowired
	private ApiServices apiServices;

	@GetMapping("/get-student/")
	public HashMap<String	, List<Subject>> findStudent() {
		
		HashMap<String	, List<Subject>> map= new HashMap();

	apiServices.AllStudents().stream().forEach(stu -> { map.computeIfAbsent(stu.getName(), x -> new ArrayList<Subject>()).add(stu.getSubjects());
		  });
	return map;
		

	}

}
