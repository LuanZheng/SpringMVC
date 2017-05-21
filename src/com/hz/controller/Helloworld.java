package com.hz.controller;

import java.io.IOException;
import java.util.ArrayList;

//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hz.model.UserInfo;

@Controller
public class Helloworld {
    @RequestMapping("/helloworld")  //此处控制浏览器里访问路径 具体为：/AccorETTAPI/helloworld
    public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String param1 = request.getParameter("param1");
        //输出字符串
        response.getWriter().append("hello world" + param1);

    }
    
    @RequestMapping(value="/testJson", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody ArrayList<UserInfo> testJsonObj(@RequestBody UserInfo userInfo){
    	//List<UserInfo> a2 = new List<UserInfo>();
    	ArrayList<UserInfo> a1 = new ArrayList<UserInfo>();
    	UserInfo userInfo1 = new UserInfo();
    	userInfo1.userName = "LJH";
    	userInfo1.password = "123";
    	
    	UserInfo userInfo2 = new UserInfo();
    	userInfo2.userName = "LJY";
    	userInfo2.password = "456";
    	a1.add(userInfo1);
    	a1.add(userInfo2);
    	//String userName = userInfo.userName;
    	//String password = userInfo.password;
    	//String result = userName + password;
    	return a1;
    }
}
