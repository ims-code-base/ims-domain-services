package com.ims.domain.shared.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Student extends Person{
	
	@Getter
	@Setter
	private int studentId;
	
	@Getter
	@Setter
 	private List<String> absentOn;
	
}
