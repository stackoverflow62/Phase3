package edu.csbsju.ntc;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

import controller.StudentFunctionalityController;

public class StudentFunctionalityControllerTest {

	StudentFunctionalityController sfc = new StudentFunctionalityController();
	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void testManageDetails() {
		assertTrue("The user name bill does not exist", !sfc.manageDetails("bill", "bob", "bob", "billy"));
		assertTrue("The username kent now has their first name as superman", sfc.manageDetails("kent", "superman", "clark", "password"));
		assertTrue("The user did not enter a username", !sfc.manageDetails(null, "superman", "clark", "password"));
		assertFalse("The username is incorrect", sfc.manageDetails("agsasg", "superman", "clark", "password"));
	}

	@Test
	public void testConfirm() {
		
	}

	@Test
	public void testViewSavedUniversities() {
		assertTrue("juser has CSB saved in their universities", sfc.viewSavedUniversities("juser").contains("CSB"));
		assertTrue("juser does not have BROWN saved in their universities", sfc.viewSavedUniversities("juser").contains("BROWN"));
		
	}

	@Test
	public void testSaveUniversity() {
		sfc.saveUniversity("juser", "BROWN");
		assertTrue("juser now has BROWN saved", sfc.viewSavedUniversities("juser").contains("BROWN"));
		assertFalse("juser does not have CCNY saved", sfc.viewSavedUniversities("juser").contains("CCNY"));
	}

	@Test
	public void testRemoveUniversity() {
		sfc.removeUniversity("Batman", "CSB");
		assertTrue("juser now doesn't have BROWN saved", !sfc.viewSavedUniversities("Batman").contains("CSB"));
		assertFalse("The university to delete is null", sfc.removeUniversity("juser", null));
		assertFalse("Username is incorrect", sfc.removeUniversity("asdg", "BROWN"));
	}
/*
	@Test
	public void testGetAccount() {
		sfc.getAccount()
	}
*/
	
}
