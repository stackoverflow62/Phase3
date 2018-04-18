package edu.csbsju.ntc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccountControllerTest.class, AdminFunctionalityControllerTest.class, DatabaseControllerTest.class, searchControllerTest.class,
		StudentFunctionalityControllerTest.class, UniversityControllerTest.class, UniversityTest.class, StudentTest.class})
public class AllTests {

}
