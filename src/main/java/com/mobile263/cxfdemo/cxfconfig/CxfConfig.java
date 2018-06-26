package com.mobile263.cxfdemo.cxfconfig;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mobile263.cxfdemo.ws.CommonService;
import com.mobile263.cxfdemo.ws.ISendStatistis;


@Configuration
public class CxfConfig {
	
    @Autowired
    CommonService commonService;

	@Autowired
	private ISendStatistis iSendStatistis;
	
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    
    /**
     * JAX-WS
     * 这里相当于把Commonservice接口发布在了路径/services/CommonService下,wsdl文档路径为http://localhost:8080/services/common?wsdl
     **/
    @Bean
    public EndpointImpl commonEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), commonService);
        endpoint.publish("/common");
        return endpoint;
    }
    
    
    @Bean
    public EndpointImpl productEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(),iSendStatistis);
        endpoint.publish("/Wscxfdemo");
        return endpoint;
    }

	
}
