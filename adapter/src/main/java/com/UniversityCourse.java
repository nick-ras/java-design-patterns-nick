package com;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UniversityCourse implements UniversitySubject {

	private UniversitySubject subject;

	public void startSubject() {
		subject.startSubject();
	}

}