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
