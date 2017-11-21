
package com.google.api.services.analyticsreporting.v4.model;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Objects; // TODO @checkstyle:ignore

import lombok.NonNull;

/**
 * Utilities for {@link Report}
 */
public class XReport {
	
	/**
	 * Constructor
	 */
	protected XReport() {
		
		/* NOP */
	}
	
	/**
	 * Get {@link XReportRow}
	 * 
	 * @param report {@link Report}
	 * @return {@link XReportRow}
	 */
	public static List<XReportRow> getRows(@NonNull Report report) {
		
		List<XReportRow> rows = new ArrayList<>();
		
		for (ReportRow row : Objects.firstNonNull(report.getData().getRows(), new ArrayList<ReportRow>())) {
			
			rows.add(new XReportRow(report.getColumnHeader(), row));
		}
		
		return rows;
	}
}
