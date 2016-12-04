package com.ims.domain.shared.model;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "educationboard")
public class EducationBoard {
	
	@Getter
	private String guid = UUID.randomUUID().toString();
	
	@Getter
	@Setter
	private String qualifiedName;
	
	@Getter
	@Setter
	private String knownAsName;
}
