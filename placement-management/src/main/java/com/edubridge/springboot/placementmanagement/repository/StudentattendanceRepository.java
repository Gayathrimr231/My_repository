package com.edubridge.springboot.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.springboot.placementmanagement.entities.Studentattendance;

@Repository
public interface StudentattendanceRepository extends JpaRepository<Studentattendance, Integer>{

}
