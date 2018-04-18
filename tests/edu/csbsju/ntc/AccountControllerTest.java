package edu.csbsju.ntc;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import controller.AccountController;
import entity.Account;

public class AccountControllerTest {

	private Account a1, a2;
	private AccountController ac, ac1;
	
	@Before
	public void init() {
		a1 = new Account("John", "User","juser", "password", 'u', 'Y');
		a2 = new Account("Noreen", "Admin", "nadmin", "admin", 'a', 'Y');
		ac = new AccountController("juser", "password");
		ac1 = new AccountController("nadmin","admin");
	}
	
	@Test
	public void testAccountControllerString() {
		assertTrue("Username invalid", a1.getUsername().equals("juser"));
	}

	@Test
	public void testAccountControllerStringString() {
		assertTrue("Username incorrect", a1.getUsername().equals("juser"));
		assertTrue("Password incorrect", a1.getPassword().equals("password"));
	}

	@Test
	public void testLogin_BBT_Valid() {
		assertTrue("Invalid login", ac.login("juser","password"));
	}
	
	@Test
	public void testLogin_BBT_InvalidPassword() {
		assertFalse("Valid password", ac.login("juser","pass"));
	}
	
	@Test
	public void testLogin_BBT_InvalidUser() {
		assertFalse("Valid password", ac.login("juer","password"));
	}
	
	@Test
	public void testLogin_BBT_InvalidUserAndPassword() {
		assertFalse("Valid password", ac.login("juer","passord"));
	}
	
	@Test (expected=SecurityException.class) 
	public void testLogin_Double_Login()
	{
		ac.login("juser", "password");
		ac.login("juser", "password");
	}
	
	@Test
	public void testCheckType() {
		assertFalse("Invalid Type", ac.checkType("juser"));
	}
	
	@Test
	public void testCheckType_WBT_ValidUsername() {
		assertFalse("Invalid Username", ac.checkType("juser"));
		assertTrue("Invalid Username", a1.getUsername().equals("juser"));
	}
	
	@Test
	public void testCheckType_WBT_InvalidUser() {
		assertFalse("Valid User", ac.checkType("juer"));
	}
	
	@Test
	public void testCheckType_WBT_ValidAdmin() {
		assertFalse("Invalid Admin", ac1.checkType("nadmin"));
		assertTrue("Invalid Admin", a2.getType()=='a');
	}
	
	@Test
	public void testCheckType_WBT_ValidUser() {
		assertFalse("Invalid User", ac.checkType("juser"));
		assertTrue("Invalid User", a1.getType()== 'u');
	}

	@Test
	public void testActiveUser() {
		assertTrue("Not active user", ac.activeUser("juser"));
	}
	
	@Test
	public void testActiveUser_WBT_ValidUsername() {
		assertTrue("Not valid username", ac.activeUser("juser"));
		assertTrue("Not Valid Username", a1.getUsername().equals("juser"));
	}

	@Test
	public void testLogout() {
		assertTrue("Invalid Logout", ac.logout());
	}

}
