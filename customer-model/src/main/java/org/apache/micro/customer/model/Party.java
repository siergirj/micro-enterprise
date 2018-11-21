package org.apache.micro.customer.model;

import java.util.List;

import org.apache.micro.common.model.BaseModel;
import org.apache.micro.common.model.Characteristic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.collect.Lists;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Party extends BaseModel {

	private String secondName;

	private Gender gender;

	private List<Characteristic> characteristics = Lists.newArrayList();

	public enum Gender {
		MALE, FEMALE
	}
}
