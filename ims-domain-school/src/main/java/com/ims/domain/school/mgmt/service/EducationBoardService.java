package com.ims.domain.school.mgmt.service;

import java.util.List;

import com.ims.domain.school.mgmt.representation.EducationBoardRepresentation;

public interface EducationBoardService {

	public void createEducationBoard(EducationBoardRepresentation educationBoardRepresentation);
	
	public List<EducationBoardRepresentation> retrieveEducationBoards();
	
}
