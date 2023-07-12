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
@Table(name = "campaign_details")
public class CampaignDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ID, nullable = false)
	
	private Long id;
	private Long campaignId;
	private String questionDesc;
	private String questionType;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
//	private int isDeleted;
//	createdBy;
//	createdTimestamp;
//	updatedBy;
//	updatedTimestamp;
}
