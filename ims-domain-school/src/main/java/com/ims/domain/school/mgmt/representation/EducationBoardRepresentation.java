package com.ims.domain.school.mgmt.representation;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EducationBoardRepresentation {

	@Getter
	@Setter
	private String id;
	
	@Getter
	@Setter
	private String qualifiedName;
	
	@Getter
	@Setter
	private String knownAsName;
	
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
