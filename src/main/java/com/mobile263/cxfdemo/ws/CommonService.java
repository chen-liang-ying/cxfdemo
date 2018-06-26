package com.mobile263.cxfdemo.ws;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * com.mobile263.ntrtool.soap
 *
 * @author huangfeng[huangfeng@kyofeng.com]
 * @version 1.0 on 2018-05-29
 */

@WebService(name = "CommonService", // 暴露服务名称
        targetNamespace = "http://ws.cxfdemo.mobile263.com/"// 命名空间,一般是接口的包名倒序
)
public interface CommonService {
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    public String sayHello(@WebParam(name = "userName") String name);

}
