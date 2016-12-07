package com.ims.domain.school.mgmt.transformers;

import org.springframework.stereotype.Component;

import com.ims.domain.school.mgmt.representation.EducationBoardRepresentation;
import com.ims.domain.shared.model.EducationBoard;

@Component
public class EducationBoardTransformer {

	public EducationBoard fromRepresentation(EducationBoardRepresentation educationBoardRepresentation, String userId) {
		EducationBoard educationBoard = new EducationBoard();
		educationBoard.setQualifiedName(educationBoardRepresentation.getQualifiedName());
		educationBoard.setKnownAsName(educationBoardRepresentation.getKnownAsName());
		educationBoard.setUserId(userId);
		return educationBoard;
	}

}
