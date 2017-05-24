package com.zuicoding.platform.demo.service;

import com.zuicoding.platform.demo.domain.Posts;

/**
 * Created by Stephen on 2017/5/24.<br/>
 * Description : <span>blog service</span>
 **/
public interface IBlogService {

    Posts findOne(Integer id);
}
