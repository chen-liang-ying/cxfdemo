package com.mobile263.cxfdemo.ws;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mobile263.cxfdemo.dao.StatistisDao;
import com.mobile263.cxfdemo.entity.SendResult;
import com.mobile263.cxfdemo.vo.StatistisData;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebService(targetNamespace="http://ws.cxfdemo.mobile263.com/",endpointInterface = "com.mobile263.cxfdemo.ws.ISendStatistis"
, serviceName = "ISendStatistis")
@Component
public class ISendStatistisImpl implements ISendStatistis {

	@Autowired
	private StatistisDao statistisDao;

	@Override
	public SendResult sendStatistis(StatistisData stData) {
		log.info("enter sendStatistis");
		return statistisDao.getStatistis(stData.getMcc(),stData.getMnc(),stData.getStartTime(),stData.getEndTime());
	
	}
}
