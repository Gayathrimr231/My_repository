package com.edubridge.springboot.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edubridge.springboot.placementmanagement.entities.Assessment;

public interface AssessmentRepository extends JpaRepository<Assessment, Integer> {

	
}
