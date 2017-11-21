
package com.google.api.services.analyticsreporting.v4.model;

/**
 * Constants for {@link DateRange}
 */
public class XDateRange {
	
	/**
	 * Constructor
	 */
	protected XDateRange() {
		
		/* NOP */
	}
	
	/**
	 * today
	 */
	public static final String TODAY = "today";
	
	/**
	 * yesterday
	 */
	public static final String YESTERDAY = "yesterday";
	
	/**
	 * N days ago
	 * 
	 * @param number number
	 * @return days ago
	 */
	public static String daysAgo(int number) {
		
		return number + "daysAgo";
	}
}
