
package com.google.api.client.googleapis.auth.oauth2;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Collection;

import com.google.api.client.auth.oauth2.Credential; // TODO @checkstyle:ignore
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential.Builder; // TODO @checkstyle:ignore
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport; // TODO @checkstyle:ignore
import com.google.api.client.http.HttpRequestInitializer; // TODO @checkstyle:ignore
import com.google.api.client.http.HttpTransport; // TODO @checkstyle:ignore
import com.google.api.client.json.JsonFactory; // TODO @checkstyle:ignore

/**
 * Custom {@link GoogleCredential}
 */
public class XGoogleCredential {
	
	/**
	 * Constructor
	 */
	protected XGoogleCredential() {
		
		/* NOP */
	}
	
	/**
	 * {@link GoogleNetHttpTransport#newTrustedTransport()}
	 * 
	 * @param credentialStream credential {@link InputStream}
	 * @param transport {@link HttpTransport}
	 * @param jsonFactory {@link JsonFactory}
	 * @return {@link GoogleCredential}
	 * @throws IllegalStateException if failed to instantiate
	 */
	public static GoogleCredential fromStream(InputStream credentialStream, HttpTransport transport,
		JsonFactory jsonFactory) throws IllegalStateException {
		
		try {
			
			return GoogleCredential.fromStream(credentialStream, transport, jsonFactory);
		}
		catch (IOException e) {
			
			throw new IllegalStateException("Failed to instantiate", e);
		}
	}
	
	/**
	 * {@link Builder#setRequestInitializer(HttpRequestInitializer)} for {@link GoogleCredential}
	 * 
	 * @param credential {@link GoogleCredential}
	 * @param requestInitializer {@link HttpRequestInitializer}
	 * @throws IllegalStateException if failed to set
	 */
	public static void setRequestInitializer(GoogleCredential credential, HttpRequestInitializer requestInitializer)
		throws IllegalStateException {
		
		try {
			
			Field xfield = Credential.class.getDeclaredField("requestInitializer");
			xfield.setAccessible(true);
			xfield.set(credential, requestInitializer);
		}
		catch (ReflectiveOperationException | SecurityException e) {
			
			throw new IllegalStateException("Could not set value to 'requestInitializer' field", e);
		}
	}
	
	/**
	 * {@link Builder#setServiceAccountScopes(Collection)} for {@link GoogleCredential}
	 * 
	 * @param credential {@link GoogleCredential}
	 * @param scopes scopes
	 * @throws IllegalStateException if failed to set
	 */
	public static void setServiceAccountScopes(GoogleCredential credential, Collection<String> scopes)
		throws IllegalStateException {
		
		try {
			
			Field xfield = Credential.class.getDeclaredField("serviceAccountScopes");
			xfield.setAccessible(true);
			xfield.set(credential, scopes);
		}
		catch (ReflectiveOperationException | SecurityException e) {
			
			throw new IllegalStateException("Could not set value to 'serviceAccountScopes' field", e);
		}
	}
}
