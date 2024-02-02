package com;

//mvn clean package && java -jar target/adapter-1.0-SNAPSHOT.jar
//univesrity student going to another school, 

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		var subjectMath = new UniversityCourse(new SubjectChooser(SubjectList.Subject.MATH));

		subjectMath.startSubject();

		var subjectHistory = new UniversityCourse(new SubjectChooser(SubjectList.Subject.HISTORY));

		subjectHistory.startSubject();

	}

}