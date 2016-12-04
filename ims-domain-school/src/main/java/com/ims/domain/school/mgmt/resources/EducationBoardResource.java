package com.ims.domain.school.mgmt.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ims.domain.school.mgmt.representation.EducationBoardRepresentation;
import com.ims.domain.school.mgmt.service.EducationBoardService;

@RestController
@RequestMapping(value = {"/education-boards"})
public class EducationBoardResource {

	@Autowired
	private EducationBoardService educationBoardService;

	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void createEducationBoard(
			@RequestBody EducationBoardRepresentation educationBoardRepresentation) {
		educationBoardService
				.createEducationBoard(educationBoardRepresentation);
	}

}
