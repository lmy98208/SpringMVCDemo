package com.njnu.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("hello")
public class HelloWorld {

    @RequestMapping("findbyid/{id}/{name}")
    public String findById(@PathVariable("id")Integer id,
                           @PathVariable("name")String name,
                           HttpServletRequest request){
        request.setAttribute("id",id);
        request.setAttribute("name",name);
        return "HelloWorld";
    }

    @RequestMapping("test")
    public String  test(String id,String name,String date,HttpServletRequest request){
        //地址访问/hello/test 跳到此处执行
        System.out.println("test");

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date _date=null;
        try {
            _date=sdf.parse(date);
            System.out.println("转换后的时间_date:"+_date.getTime());
        }catch (Exception e){
            _date=new Date();//当前日期
            e.printStackTrace();
        }
        System.out.println(id+name+_date);
        request.setAttribute("id",id);
        request.setAttribute("name",name);
        request.setAttribute("date",_date);
        return "HelloWorld";//转发跳转，自动匹配前缀和后缀
    }

    @RequestMapping("world")
    public void world(){
        //地址访问/hello/world 跳到此处执行
        System.out.println("world");
    }
}
