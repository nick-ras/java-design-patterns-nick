package com;

public class SubjectChooser implements UniversitySubject {

	private UniversitySubject subject;

	public SubjectChooser(SubjectList.Subject subjectIncoming) {
		switch (subjectIncoming) {
			case MATH:
				this.subject = new Math();
				break;
			case HISTORY:
				this.subject = new History();
				break;
		}

	}

	public void startSubject() {
		subject.startSubject();
	}
}
