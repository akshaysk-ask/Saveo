package com.saveo.med.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.saveo.med.entity.CampaignDetails;
import com.saveo.med.entity.FeedbackCampaign;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@PostMapping("/createCampaignFeedback")
	public ResponseEntity<?> createCampaignFeedback(@RequestParam Long retailerCode, @RequestBody FeedbackCampaign feedbackCampaign)
	{
		
		return null;
	}
	
	@GetMapping("/questions")
	public ResponseEntity<?> getQuestions(@RequestParam Long retailerCode)
	{
		
		return null;
	}
	
	@PostMapping("/answers")
	public ResponseEntity<?> getAnswers(@RequestParam Long id, @RequestBody CampaignDetails campaignDetails)//questionId, answerId, retailerCode
	{
		return null;
	}
}
