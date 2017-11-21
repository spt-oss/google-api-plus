
package com.google.api.client.http;

import java.io.IOException;

import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Simple {@link HttpRequestInitializer}
 */
public class XSimpleHttpRequestInitializer implements HttpRequestInitializer {
	
	/**
	 * {@link HttpRequestInitializer}
	 */
	private HttpRequestInitializer parent;
	
	/**
	 * {@link HttpRequest#getConnectTimeout()}
	 */
	@Setter
	@Accessors(chain = true)
	private int connectTimeout = 20 * 1000;
	
	/**
	 * {@link HttpRequest#getReadTimeout()}
	 */
	@Setter
	@Accessors(chain = true)
	private int readTimeout = 20 * 1000;
	
	/**
	 * {@link HttpRequest#getNumberOfRetries()}
	 */
	@Setter
	@Accessors(chain = true)
	private int numberOfRetries = HttpRequest.DEFAULT_NUMBER_OF_RETRIES;
	
	/**
	 * Constructor
	 */
	public XSimpleHttpRequestInitializer() {
		
		this(null);
	}
	
	/**
	 * Constructor
	 * 
	 * @param parent {@link HttpRequestInitializer}
	 */
	public XSimpleHttpRequestInitializer(HttpRequestInitializer parent) {
		
		this.parent = parent;
	}
	
	@Override
	public void initialize(HttpRequest request) throws IOException {
		
		if (this.parent != null) {
			
			this.parent.initialize(request);
		}
		
		request.setConnectTimeout(this.connectTimeout);
		request.setReadTimeout(this.readTimeout);
		request.setNumberOfRetries(this.numberOfRetries);
	}
}
