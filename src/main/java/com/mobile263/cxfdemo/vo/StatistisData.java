package com.mobile263.cxfdemo.vo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class StatistisData {

	private String mcc;
	private String mnc;
	private String startTime;
	private String endTime;
}
