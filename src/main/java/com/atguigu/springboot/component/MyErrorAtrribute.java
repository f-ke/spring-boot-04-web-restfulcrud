package com.atguigu.springboot.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class MyErrorAtrribute extends DefaultErrorAttributes {
    //
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        map.put("company","651congcongcong");
        //异常处理器要携带的数据
        Map<String,Object>  ext = (Map<String, Object>) webRequest.getAttribute("ext",0);
        return map;
    }
   //调用父类构造器，使默认值为true，否则无法在网页上显示exception
    public MyErrorAtrribute() {
        super(true);
    }
}


