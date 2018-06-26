package com.mobile263.cxfdemo.ws;


import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * com.mobile263.ntrtool.soap
 *
 * @author huangfeng[huangfeng@kyofeng.com]
 * @version 1.0 on 2018-05-29
 */
@WebService(serviceName = "CommonService", // 与接口中指定的name一致
        targetNamespace = "http://ws.cxfdemo.mobile263.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.mobile263.cxfdemo.ws.CommonService"// 接口地址
)
@Component
public class CommonServiceImp implements CommonService {

    @Override
    public String sayHello(String name) {

        return "Hello ," + name;
    }

}
