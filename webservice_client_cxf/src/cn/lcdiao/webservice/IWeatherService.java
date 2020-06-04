package cn.lcdiao.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-03T11:07:23.307+08:00
 * Generated source version: 3.3.6
 *
 */
@WebService(targetNamespace = "http://webservice.lcdiao.cn/", name = "IWeatherService")
@XmlSeeAlso({ObjectFactory.class})
public interface IWeatherService {

    @WebMethod
    @RequestWrapper(localName = "query", targetNamespace = "http://webservice.lcdiao.cn/", className = "cn.lcdiao.webservice.Query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://webservice.lcdiao.cn/", className = "cn.lcdiao.webservice.QueryResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String query(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}