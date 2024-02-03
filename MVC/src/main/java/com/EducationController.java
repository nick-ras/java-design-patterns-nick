package com;

public class EducationController {

	public final EducationModel model;
	public final EducationView view;

	public EducationController(EducationModel model, EducationView view) {
		this.model = model;
		this.view = view;
	}

	public void setQuarter(Quarter quarter) {
		this.model.setQuarter(quarter);


}