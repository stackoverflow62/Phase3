package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entity.University;

public class UniversityTest {
	University u, nu;
	@Before
	public void setUp() {
     u = new University("CSB","MN","Small-city", "Private", 10000, 0.0,0.0,0.0, 32239.0,80.0,0,0.0,0.0,0,2,0);
	 nu = null;
	}
    @Test
    public void testUniversity() {
        assertTrue("University is created", u != null);
    }


    @Test
    public void testSetUniversityName() {
        u.setUniversityName("SJU");
        assertTrue("Name is now SJU", u.getUniversityName().equals("SJU"));
    }

    @Test
    public void testSetUniversityState() {
        u.setUniversityState("WI");
        assertTrue("State is now WI", u.getUniversityState().equals("WI"));
    }

    @Test
    public void testSetLocationType() {
        u.setLocationType("Woods");
        assertTrue("Type is now Woods", u.getLocationType().equals("Woods"));
    }

    @Test
    public void testSetControl() {
        u.setControl("pRiVaTe");
        assertTrue("Control is now pRiVaTe", u.getControl().equals("pRiVaTe"));
    }

    @Test
    public void testSetNumOfStudents() {
        u.setNumOfStudents(101);
        assertTrue("Number of students is now SJU", u.getNumOfStudents()==101);
    }

    @Test
    public void testSetFemalePercent() {
        u.setFemalePercent(0);
        assertTrue("Females is now 0", u.getFemalePercentage() == 0);
    }

    @Test
    public void testSetSATVerbal() {
        u.setSATVerbal(501);
        assertTrue("SAT Verball is now 501", u.getSATVerbal() == 501);
    }

    @Test
    public void testSetSATMath() {
        u.setSATMath(501);
        assertTrue("SAT Math is now 501", u.getSATMath() == 501);
    }

    @Test
    public void testSetExpenses() {
        u.setExpenses(50000);
        assertTrue("Expenses is now 50000", u.getExpenses() == 50000);
    }

    @Test
    public void testSetFinancialAid() {
        u.setFinancialAid(80);
        assertTrue("Financial aid is now 80", u.getFinancialAid() == 80);
    }

    @Test
    public void testSetNumApplicants() {
        u.setNumApplicants(400);
        assertTrue("Num students is 400", u.getNumApplicants() == 400);
    }

    @Test
    public void testSetNumAdmitted() {
        u.setNumAdmitted(300);
        assertTrue("Num admitted is now 300", u.getNumAdmitted() == 300);
    }

    @Test
    public void testSetNumEnrolled() {
        u.setNumEnrolled(2000);
        assertTrue("Num enrolled is now 2000", u.getNumEnrolled() == 2000);
    }

    @Test
    public void testSetAcademicScale() {
        u.setAcademicScale(5);
        assertTrue("Scale is 5", u.getAcademicScale() == 5);
    }

    @Test
    public void testSetSocialScale() {
        u.setSocialScale(5);
        assertTrue("Scale is 5", u.getSocialScale() == 5);    
    }

    @Test
    public void testSetQualityOfLife() {
        u.setQualityOfLife(5);
        assertTrue("Scale is 5", u.getQualityOfLife() == 5);    
    }
    
    @Test
    public void testGetUniversityName() {
    	assertTrue("Name is now SJU", u.getUniversityName().equals("CSB"));
    }

    @Test
    public void testGetUniversityState() {
    	assertTrue("State is now WI", u.getUniversityState().equals("MN"));
    }

    @Test
    public void testGetLocationType() {
    	assertTrue("Type is now Woods", u.getLocationType().equals("Small-city"));
    }

    @Test
    public void testGetControl() {
    	assertTrue("Control is now pRiVaTe", u.getControl().equals("Private"));
    }

    @Test
    public void testGetNumOfStudents() {
    	 assertTrue("Number of students is now SJU", u.getNumOfStudents()==10000);
    }

    @Test
    public void testGetFemalePercentage() {
        assertTrue("Females is now 0", u.getFemalePercentage() == 0.0);
    }

    @Test
    public void testGetSATVerbal() {
    	 assertTrue("SAT Verball is now 501", u.getSATVerbal() == 0.0);
    }

    @Test
    public void testGetSATMath() {
        assertTrue("SAT Math is now 501", u.getSATMath() == 0.0);
    }

    @Test
    public void testGetExpenses() {
        assertTrue("Expenses is now 50000", u.getExpenses() == 32239.0);
    }

    @Test
    public void testGetFinancialAid() {
    	 assertTrue("Financial aid is now 80", u.getFinancialAid() == 80.0);
    }

    @Test
    public void testGetNumApplicants() {
        assertTrue("Num students is 400", u.getNumApplicants() == 0.0);
    }

    @Test
    public void testGetNumAdmitted() {
    	 assertTrue("Num admitted is now 300", u.getNumAdmitted() == 0.0);
    }

    @Test
    public void testGetNumEnrolled() {
    	 assertTrue("Num enrolled is now 2000", u.getNumEnrolled() == 0.0);
    }

    @Test
    public void testGetAcademicScale() {
    	assertTrue("Scale is 5", u.getAcademicScale() == 0);
    }

    @Test
    public void testGetSocialScale() {
    	 assertTrue("Scale is 5", u.getSocialScale() == 2);    
    }

    @Test
    public void testGetQualityOfLife() {
    	assertTrue("Scale is 5", u.getQualityOfLife() == 0);   
    }



}


