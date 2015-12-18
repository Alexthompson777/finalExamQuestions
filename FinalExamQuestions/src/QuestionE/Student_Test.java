package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Bob", "bobby", "Bobbison", dBirthDate, "212 Bob Street", "555-555-5555", "bob@bob.edu","bobstudies");
		Student stu3 = new Student("John", "Johnny", "Johnson", dBirthDate, "214 John Lane", "555-555-5555", "john@udel.edu","math");
		Student stu4 = new Student("Harry", "Harrison", "Wells", dBirthDate, "214 Harrison Lane", "555-555-5555", "harry@udel.edu","chem");
		Student stu5 = new Student("Will", "Willy", "Williamss", dBirthDate, "221 Will Lane", "555-555-5555", "will@udel.edu","english");
	
		Map<UUID, Student> map = new HashMap<UUID, Student>();
		
		map.put(stu1.getPersonID(), stu1);
		map.put(stu2.getPersonID(), stu2);
		map.put(stu3.getPersonID(), stu3);
		map.put(stu4.getPersonID(), stu4);
		map.put(stu5.getPersonID(), stu5);
		
		assertTrue(map.size()==5);
		
		
	}

}
