package com.ims.domain.school.mgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ims.domain.school.mgmt.repository.EducationBoardRepository;
import com.ims.domain.school.mgmt.representation.EducationBoardRepresentation;
import com.ims.domain.school.mgmt.service.EducationBoardService;
import com.ims.domain.school.mgmt.transformers.EducationBoardTransformer;

@Component
public class DefaultEducationBoardService implements EducationBoardService {

	@Autowired
	private EducationBoardRepository educationBoardRepository;
	
	@Autowired
	private EducationBoardTransformer educationBoardTransformer;
	
	@Override
	public void createEducationBoard(
			EducationBoardRepresentation educationBoardRepresentation) {
		educationBoardRepository.save(educationBoardTransformer.fromRepresentation(educationBoardRepresentation));
	}

	@Override
	public List<EducationBoardRepresentation> retrieveEducationBoards() {
		// TODO Auto-generated method stub
		return null;
	}

}
