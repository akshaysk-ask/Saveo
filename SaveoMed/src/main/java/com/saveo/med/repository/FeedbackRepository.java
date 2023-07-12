package com.saveo.med.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saveo.med.entity.FeedbackCampaign;

public interface FeedbackRepository extends JpaRepository<FeedbackCampaign, Long>{

}
