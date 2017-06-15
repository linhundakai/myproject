package cn.demo.service0.controller;

import java.util.Date;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/1/19 12:13
 * @Description:
 */
@RestController
@RequestMapping(value="/cluster_test")
public class Service0Controller {

  @Value("${test.value}")
  String test;


  @GetMapping("test")
  String test() {
    System.err.println(test);
    return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss").format(new Date());
  }

}
