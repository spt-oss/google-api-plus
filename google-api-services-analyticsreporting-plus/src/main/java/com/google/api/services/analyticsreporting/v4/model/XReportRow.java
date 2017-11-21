
package com.google.api.services.analyticsreporting.v4.model;

import java.util.List;

import lombok.NonNull;

/**
 * Custom {@link ReportRow}
 */
public class XReportRow {
	
	/**
	 * {@link ColumnHeader}
	 */
	private ColumnHeader header;
	
	/**
	 * {@link ReportRow}
	 */
	private ReportRow row;
	
	/**
	 * Constructor
	 * 
	 * @param header {@link ColumnHeader}
	 * @param row {@link ReportRow}
	 */
	public XReportRow(@NonNull ColumnHeader header, @NonNull ReportRow row) {
		
		this.header = header;
		this.row = row;
	}
	
	/**
	 * Extract dimension
	 * 
	 * @param name name
	 * @return value
	 * @throws IllegalArgumentException if not found
	 */
	public String getDimension(String name) throws IllegalArgumentException {
		
		List<String> headers = this.header.getDimensions();
		List<String> dimensions = this.row.getDimensions();
		
		for (int i = 0; i < headers.size() && i < dimensions.size(); i++) {
			
			if (headers.get(i).equals(name)) {
				
				return dimensions.get(i);
			}
		}
		
		throw new IllegalArgumentException("Dimension not found: " + name);
	}
	
	/**
	 * Get metric
	 * 
	 * @param name name
	 * @return value
	 * @throws IllegalArgumentException if not found
	 */
	public String getMetric(String name) throws IllegalArgumentException {
		
		List<MetricHeaderEntry> headers = this.header.getMetricHeader().getMetricHeaderEntries();
		List<DateRangeValues> metrics = this.row.getMetrics();
		
		for (int i = 0; i < metrics.size(); i++) {
			
			DateRangeValues values = metrics.get(i);
			
			for (int j = 0; j < values.getValues().size() && j < headers.size(); j++) {
				
				if (headers.get(j).getName().equals(name)) {
					
					return values.getValues().get(j);
				}
			}
		}
		
		throw new IllegalArgumentException("Metric not found: " + name);
	}
}
