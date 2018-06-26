package com.mobile263.cxfdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mobile263.cxfdemo.entity.SendResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Component
public class StatistisDao {
	
	public SendResult getStatistis(String mcc, String mnc,String startTime, String endTime) {
		log.info("enter getStatistis");
		return null;
	}
}
