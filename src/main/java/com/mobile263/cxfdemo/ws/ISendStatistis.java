package com.mobile263.cxfdemo.ws;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.mobile263.cxfdemo.entity.SendResult;
import com.mobile263.cxfdemo.vo.StatistisData;



@WebService
public interface ISendStatistis {

	@WebMethod
	public SendResult sendStatistis(@WebParam(name = "StatistisData")StatistisData stData);
}
