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
public class WareHist {
	
	private int hstPk;
	private int matNo;
	private String whCls;
	private int whAmt;
	private LocalDateTime whDtm;
	private String whHst;
}
