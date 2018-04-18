package edu.csbsju.ntc;

import static org.junit.Assert.*;
import org.junit.*;
//import org.junit.jupiter.api.Test;
import controller.SearchController;
import interaction.StudentInteraction;
import java.util.*;

public class searchControllerTest {
	SearchController sc;
	
	@Before
	  public void setUp() throws Exception {
		sc = new SearchController();
		
	  }
	
	@Test
	public void testSearchNullSchoolName() {
		assertTrue(sc.search("BROWN"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		
	}
	@Test
	public void testSearch() {
		/**result assertTrue(sc.search("", "", "", "", "", "", "", "", "","", "", "", "", "", "", "") instanceof ArrayList<?>);*/
		
	    
		//temp1 assertTrue(sc.search(null, "", "", "", "", "", "", "", "","", "", "", "", "", "", "") instanceof ArrayList<?>);
		assertTrue(sc.search(""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		
		 assertTrue(sc.search("BROWN"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search("BROWN"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search("BROWN"	,"RHODEISLAND "	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search("BROWN"	,"RHODEISLAND "	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE",	""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0",	""	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,null	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,""	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,null	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,""	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,null	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0",""	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,""	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,null	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,""	,"",	""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,null	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,""	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,null	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,""	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,null	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,""	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,null	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,""	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,"4"	,"") instanceof ArrayList<?>);
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,"4"	,null) instanceof ArrayList<?>);
		
		 assertTrue(sc.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,"4",	"") instanceof ArrayList<?>);
		
		 assertTrue(sc.search(	"BROWN","RHODEISLAND ","URBAN","PRIVATE","10000","50.0","625.0","650.0","36450.0","40.0","11500","20.0","50.0","5","4","5") instanceof ArrayList<?>);

}
}
