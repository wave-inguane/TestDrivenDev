package com.tddinaction.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tddinaction.template.TestTemplate;

import junit.framework.JUnit4TestAdapter;
// This section declares all of the test classes in the program.
@RunWith(Suite.class)
@Suite.SuiteClasses({TestTemplate.class})// Add test classes here.
public class RunAllTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// The suite() method helpful when using JUnit3 Test Runners or Ant.
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(RunAllTests.class);
	}

}
