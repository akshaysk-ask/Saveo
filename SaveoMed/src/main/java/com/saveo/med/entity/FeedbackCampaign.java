package com.saveo.med.entity;

import javax.persistence.*;
import static com.saveo.med.util.ColumnConstants.ID;
import lombok.Data;

@Data
@Entity
@Table(name = "feedback_campaign")
public class FeedbackCampaign {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ID, nullable = false)
	
	private Long id;
	private String campaignName;
	private String durationType;
	private Long campaignStartTime;
	private Long campaignEndTime;
	private int isStopped;
	private int isDeleted;
//	createdBy;
//	createdTimestamp;
//	updatedBy;
//	updatedTimestamp;
}
