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
public class Release {
	
	private int hstPk;
	private int matNo;
	private int relAmt;
	private LocalDateTime relDtm;
	private String relCls;
	private String facNo;
	private String relHst;
	
	
}
