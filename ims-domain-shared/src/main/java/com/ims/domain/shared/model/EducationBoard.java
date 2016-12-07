package com.ims.domain.shared.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ims.domain.shared.infra.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "educationboard")
public class EducationBoard extends BaseEntity{
	
	@Getter
	@Setter
	private String qualifiedName;
	
	@Getter
	@Setter
	private String knownAsName;
}
