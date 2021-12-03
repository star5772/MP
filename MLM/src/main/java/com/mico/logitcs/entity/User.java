package com.mico.logitcs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain=true)

public class User {
	
	@Getter
	private String userName;
	@Getter
	private int uno;
	public String getUno() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
