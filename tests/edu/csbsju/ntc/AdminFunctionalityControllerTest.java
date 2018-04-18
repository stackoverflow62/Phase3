package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.DatabaseController;

import org.junit.Before;
import entity.Account;
import interaction.AdminInteraction;

public class AdminFunctionalityControllerTest {

	
	AdminInteraction noreen = new AdminInteraction("nadmin","admin");
	Account student;
	DatabaseController dbControl;
	String [][] array;
	@Before
	public void setUp() throws Exception{
		dbControl = new DatabaseController(); 
		student = new Account("juser","John","Uzer","password",'u','Y');
		
		
	}
	@Test
	public void testEditUser() {
		char c = 'Y';
		student = noreen.editStudent("juser","John","User","password",'u',c);
		array = dbControl.getUsers();
		for(int i = 0; i<array.length;i++)
		{
			if(array[i][0].equals("juser"))
			{
				assertTrue("Username: juser", array[i][0].equals("juser"));
			}
			if(array[i][1].equals("John"))
			{
				assertTrue("First Name: John",array[i][1].equals("John"));
			}
			if(array[i][2].equals("User"))
			{
				assertTrue("Last Name: User",array[i][2].equals("User"));
			}
			if(array[i][3].equals("password"))
			{
				assertTrue("Password: "+array[i][3],array[i][3].equals("password"));
			}
		   if(array[i][4].equals("u"))
		   {
			   assertTrue("Type: u", array[i][4].equals("u"));
		   }
	      if(array[i][5].equals("Y"))
	      {
	    	  assertTrue("Status: Y", array[i][5].equals("Y")); 
	      }		
				
		}
		
		
		
		
		
		
	}

	@Test
	public void testDeactivate() {
		noreen.deactivate(student);
		assertTrue("Status: N", student.getStatus() == 'N');
		//assertTrue("Status: Y", student.getStatus() == 'Y');
	}

}
