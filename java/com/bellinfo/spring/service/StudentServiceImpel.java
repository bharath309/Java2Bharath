package com.bellinfo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bellinfo.spring.model.Links;
import com.bellinfo.spring.model.Register;
import com.bellinfo.spring.repository.StudentRepository;

@Component
public class StudentServiceImpel implements StudentService {

	@Autowired
	StudentRepository repository;

	public void processStudentData(Register s1) {
		System.out.println("this is data at service and sending to database");
		repository.persistStudentData(s1);

	}

	public boolean processStudentvalidation(Register s2) {
		return repository.persistStudentvalidation(s2);

	}

	public Links fetchlinks(String cat) {

		return repository.fetchRelatedLinks(cat);
	}

}
