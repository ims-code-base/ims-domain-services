package com.ims.domain.shared.model;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.DateTime;

/**
 * 
 * @author Hitesh
 *
 */
public abstract class Person {

	@Getter
	@Setter
	private String firstName;
	
	@Getter
	@Setter
	private String middleName;
	
	@Getter
	@Setter
	private String lastName;
	
	@Getter
	@Setter
	private DateTime dateOfBirth;
	
	@Getter
	private String guid = UUID.randomUUID().toString();	
}
