package com.scg.training.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class Audit {

	@Column(name = "created_by", updatable = false)
	private String createdBy;

	@Column(name = "created_timestamp", updatable = false)
	private LocalDateTime createdTimestamp;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	@Column(name = "last_updated_timestamp")
	private LocalDateTime lastUpdatedTimestamp;

}
