package com.edubridge.springboot.placementmanagement.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="assessment")
public class Assessment {

	@Id
	
	
	@Column(name="asmnt_date")
	private int asmntDate;
	
	
	@Column(name="asmnt_name")
	private String asmntName;
	
	@Column(name="status")
	private String status;
	
	@Column(name="score")
	private int score;
	
	@OneToOne
	@JoinColumn(name="stud_id")
	private Studentattendance studentattendance;
	
	public  Assessment() {}

	public int getAsmntDate() {
		return asmntDate;
	}

	public void setAsmntDate(int asmntDate) {
		this.asmntDate = asmntDate;
	}

	public String getAsmntName() {
		return asmntName;
	}

	public void setAsmntName(String asmntName) {
		this.asmntName = asmntName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Studentattendance getStudentattendance() {
		return studentattendance;
	}

	public void setStudentattendance(Studentattendance studentattendance) {
		this.studentattendance = studentattendance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asmntDate, asmntName, score, status, studentattendance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assessment other = (Assessment) obj;
		return asmntDate == other.asmntDate && Objects.equals(asmntName, other.asmntName) && score == other.score
				&& Objects.equals(status, other.status) && Objects.equals(studentattendance, other.studentattendance);
	}

	@Override
	public String toString() {
		return "Assessment [asmntDate=" + asmntDate + ", asmntName=" + asmntName + ", status=" + status + ", score="
				+ score + ", studentattendance=" + studentattendance + "]";
	}
	
	
	
	
	
}
