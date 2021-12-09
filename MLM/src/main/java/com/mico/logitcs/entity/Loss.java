package com.mico.logitcs.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Loss {
	
	private int matNo;
	private String lndCls;
	private int lndAmt;
	private String procYm;
	private LocalDateTime lndDtm;
}
