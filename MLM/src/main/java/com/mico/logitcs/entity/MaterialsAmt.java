package com.mico.logitcs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MaterialsAmt {
	
	private int matNo;
	private int matTotAmt;
	private String lndCls;
	private String facNo;
	private String matLoc;
}
