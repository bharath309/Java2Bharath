package com.bellinfo.spring.service;

import com.bellinfo.spring.model.Links;
import com.bellinfo.spring.model.Register;

public interface StudentService {
	public void processStudentData(Register s1);

	public boolean processStudentvalidation(Register s2);

	public Links fetchlinks(String cat);
}
