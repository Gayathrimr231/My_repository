package com.edubridge.springboot.placementmanagement;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.edubridge.springboot.placementmanagement.entities.Studentattendance;
import com.edubridge.springboot.placementmanagement.repository.StudentattendanceRepository;

@SpringBootTest
class PlacementManagementApplicationTests {

	@Test
	void contextLoads() {
	}
	// connectivity
		@Autowired
		StudentattendanceRepository studentattendancerepo;

	// save create operation 
		@Test
		public void testCreate() {
			Studentattendance studentattendance = new Studentattendance();
			studentattendance.setStudId(16);
			studentattendance.setStudName("swarna");
			studentattendance.setCourseName("python");
			studentattendance.setTotalDays(100);
			studentattendance.setNoOfDaysPresent(99);
			studentattendance.setNoOfDaysAbsent(1);
			studentattendance.setTotalPerc(99);
			studentattendancerepo.save(studentattendance);

		}

	// read operation testcase
		@Test
		public void testReadAll() {
			List<Studentattendance> list = studentattendancerepo.findAll();
			assertThat(list).size().isGreaterThan(0);
		}

	// update operation in using testcase
		@Test
		public void testUpdate() {
			Studentattendance studentattendance = studentattendancerepo.findById(3).get();
			studentattendance.setCourseName("python");
			studentattendancerepo.save(studentattendance);

		}

	// using test case delete operation
		@Test
		public void testDelete() {
			studentattendancerepo.deleteById(1);
		}

	}






