package com.tddinaction.template;

import org.junit.*;

import com.tddinaction.template.MissingValueException;
import com.tddinaction.template.Template;
import static org.junit.Assert.*;

public class TestTemplate {


	@Test
	public void oneVariable() throws Exception {
		Template template = new Template("Hello, ${name}");
		template.set("name", "Reader");
		assertEquals("Hello, Reader", template.evaluate());
	}

	//Start triangulation
	@Test public void differentValue() throws Exception {
		Template template = new Template("Hello, ${name}");
		template.set("name", "someone else");
		assertEquals("Hello, someone else", template.evaluate());
	}


	//Continue with triangulation to squeeze our more hard coding
	@Test public void differentTemplate() throws Exception {
		Template template = new Template("Hi, ${name}");
		template.set("name", "someone else");
		assertEquals("Hi, someone else", template.evaluate());
	}


	/*
    private Template template;

    @Before
    public void setUp() {
        template = new Template("${one}, ${two}, ${three}");
        template.set("one", "1");
        template.set("two", "2");
        template.set("three", "3");
    }

    @Test
    public void multiplePlaceholders() {
        assertTemplateEvaluatesTo("1, 2, 3");
    }

  
    @Test
    public void unknownVariablesAreIgnored() {
        template.set("doesnotexist", "Hi");
        assertTemplateEvaluatesTo("1, 2, 3");
    }

    @Test
    public void settingValueMultipleTimes() {
        template.set("three", "4");
        assertTemplateEvaluatesTo("1, 2, 4");
    }

    @Test
    public void missingValueRaisesException() {
        try {
            new Template("${foo}").evaluate();
            fail("evaluate() should throw an exception if "
                    + "a placeholder was left without a value!");
        } catch (MissingValueException expected) {
            assertEquals("No value for ${foo}", expected.getMessage());
        }
    }

    @Test(expected = MissingValueException.class)
    public void missingValueRaisesException_withAnnotation() {
        new Template("${foo}").evaluate();
    }

    @Test
    public void placeholdersGetProcessedJustOnce() {
        template.set("one", "${one}");
        template.set("two", "${three}");
        template.set("three", "${two}");
        assertEquals("${one}, ${three}, ${two}", template.evaluate());
    }

 
    private void assertTemplateEvaluatesTo(String expected) {
        assertEquals(expected, template.evaluate());
    }
    */
}
