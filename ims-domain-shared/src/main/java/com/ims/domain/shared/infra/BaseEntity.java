package com.ims.domain.shared.infra;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Hitesh
 *
 */
public class BaseEntity {

	@Id
	private String _Id;

	@Getter
	@Setter
	private String entityId = UUID.randomUUID().toString();

	@Getter
	@Setter
	private String userId;

	@Getter
	@Setter
	@CreatedDate
	private Date createdOn;
}
