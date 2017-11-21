
package com.google.api.client.googleapis.javanet;

import java.io.IOException;
import java.security.GeneralSecurityException;

import com.google.api.client.http.javanet.NetHttpTransport; // TODO @checkstyle:ignore

/**
 * Custom {@link GoogleNetHttpTransport}
 */
public class XGoogleNetHttpTransport {
	
	/**
	 * Constructor
	 */
	protected XGoogleNetHttpTransport() {
		
		/* NOP */
	}
	
	/**
	 * {@link GoogleNetHttpTransport#newTrustedTransport()}
	 * 
	 * @return {@link NetHttpTransport}
	 * @throws IllegalStateException if failed to instantiate
	 */
	public static NetHttpTransport newTrustedTransport() throws IllegalStateException {
		
		try {
			
			return GoogleNetHttpTransport.newTrustedTransport();
		}
		catch (GeneralSecurityException | IOException e) {
			
			throw new IllegalStateException("Failed to instantiate", e);
		}
	}
}
