package com.ims.domain.school.mgmt.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ims.domain.school.mgmt.representation.EducationBoardRepresentation;
import com.ims.domain.school.mgmt.service.EducationBoardService;

@RestController
@RequestMapping(value = { "/education-boards" })
public class EducationBoardResource {

	private final static Logger LOGGER = LoggerFactory.getLogger(EducationBoardResource.class);

	@Autowired
	private EducationBoardService educationBoardService;

	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void createEducationBoard(@RequestBody EducationBoardRepresentation educationBoardRepresentation,
			@RequestHeader(name = "UserId") String userId) {
		educationBoardService.createEducationBoard(educationBoardRepresentation, userId);
		LOGGER.debug(educationBoardRepresentation.toString());
	}

}
