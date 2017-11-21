/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.api.services.analyticsreporting.v4.model;

/**
 * Utilities for {@link DateRange}
 */
public class XDateRange {
	
	/**
	 * Constructor
	 */
	protected XDateRange() {
		
		/* NOP */
	}
	
	/**
	 * Minimum
	 * 
	 * @see <a href=
	 * "https://developers.google.com/analytics/devguides/reporting/core/v3/reference#startDate">start-date</a>
	 */
	public static final String MINIMUM = "2005-01-01";
	
	/**
	 * Today
	 */
	public static final String TODAY = "today";
	
	/**
	 * Yesterday
	 */
	public static final String YESTERDAY = "yesterday";
	
	/**
	 * N days ago
	 * 
	 * @param number number
	 * @return N days ago
	 */
	public static String ago(int number) {
		
		return number + "daysAgo";
	}
}
