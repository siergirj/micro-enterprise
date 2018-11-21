package org.apache.micro.customer.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactMedium {

	private String value;

	private Type type;

	private Boolean prefered;
	
	public enum Type {
		PHONE, EMAIL
	}
}
