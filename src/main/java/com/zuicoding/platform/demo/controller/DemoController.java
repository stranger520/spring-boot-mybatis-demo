package com.zuicoding.platform.demo.controller;

import com.zuicoding.platform.demo.domain.Posts;
import com.zuicoding.platform.demo.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Stephen on 2017/5/24.<br/>
 * Description : <p></p>
 **/
@Controller
@RequestMapping("/demo")
public class DemoController {


    @Autowired
    IBlogService blogService;

    @RequestMapping("/{id}/get.json")
    @ResponseBody
    public Posts getPosts(@PathVariable("id") Integer id){


        return blogService.findOne(id);
    }

}
