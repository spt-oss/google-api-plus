
package com.google.api.services.analyticsreporting.v4.model;

/**
 * Constants for filters
 */
public class XFilters {
	
	/**
	 * Constructor
	 */
	protected XFilters() {
		
		/* NOP */
	}
	
	/**
	 * OR
	 */
	public static final String OR = ",";
	
	/**
	 * AND
	 */
	public static final String AND = ";";
	
	/**
	 * Not equal
	 */
	public static final String NOT_EQUAL = "!=";
	
	/**
	 * Regular expression match
	 */
	public static final String REGEX_MATCH = "=~";
}
