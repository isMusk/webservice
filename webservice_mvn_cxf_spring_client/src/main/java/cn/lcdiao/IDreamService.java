package cn.lcdiao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-04T15:58:29.064+08:00
 * Generated source version: 3.3.6
 *
 */
@WebService(targetNamespace = "http://lcdiao.cn/", name = "IDreamService")
@XmlSeeAlso({ObjectFactory.class})
public interface IDreamService {

    @WebMethod
    @RequestWrapper(localName = "query", targetNamespace = "http://lcdiao.cn/", className = "cn.lcdiao.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://lcdiao.cn/", className = "cn.lcdiao.QueryResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String query(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
