package com.mico.logitcs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Materials {

	// 자재목록

	private int matNo;
	private String matCls;
	private String matNm;
}
