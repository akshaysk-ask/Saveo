package com.saveo.med.entity;

import static com.saveo.med.util.ColumnConstants.ID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "feedback_answers")
public class FeedbackAnswers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ID, nullable = false)
	
	private Long id;
	private Long retailerCode;
	private Long campaignId;
	private Long campaignDetailId;
	private String userChoice;
	private String source;
//	private int isDeleted;
//	createdBy;
//	createdTimestamp;
//	updatedBy;
//	updatedTimestamp;
}
