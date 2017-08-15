package com.tddinaction.template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Template {

	
	private String variableValue;
	
	public Template(String templateText) {
	}
	
	public void set(String variable, String value) {
		this.variableValue = value;
	}
	
	public String evaluate() {
	//1. return null; TEST: FAIL
		
	//2. Find the quickest and easiest way to make the test pass.
	//return "Hello, Reader";//Hard-coding TEST: PASS
	
    //3.
		return "Hello, " + this.variableValue;
	}
	
	/*
    private Map<String, String> variables;

    private String templateText;

    public Template(String templateText) {
        this.variables = new HashMap<String, String>();
        this.templateText = templateText;
    }

    public void set(String name, String value) {
        this.variables.put(name, value);
    }

    public String evaluate() {
        TemplateParse p = new TemplateParse();
        List<Segment> segments = p.parseSegments(templateText);
        return concatenate(segments);
    }

    private String concatenate(List<Segment> segments) {
        StringBuffer result = new StringBuffer();
        for (Segment segment : segments) {
            result.append(segment.evaluate(variables));
        }
        return result.toString();
    }
    */

}
