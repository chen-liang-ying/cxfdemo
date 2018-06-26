package com.mobile263.cxfdemo.entity;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class SendResult {
	
	private String mcc;
	private String mnc;
	private String responseStatus;
	private String responseDesc;
	private String averRegDuration;
	private String redirectRegSubs;
	private String nonRedirectRegSubs;
	private String operSubPercentage;
	private String manualRegAttempts;
	
	private String successfulManReg;
	private String successfulManRegRatio;
	private String totalRegAttempts;
	private String firstRegAttempts;
	
	private String firstSuccRegAttempts;
	private String firstRegSuccRatio;
	private String regFailReasonCount;
	private String nonPreferredFailReason;
}
