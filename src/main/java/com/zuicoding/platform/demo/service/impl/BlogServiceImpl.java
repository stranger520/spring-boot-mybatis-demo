package com.zuicoding.platform.demo.service.impl;

import com.zuicoding.platform.demo.dao.PostsMapper;
import com.zuicoding.platform.demo.domain.Posts;
import com.zuicoding.platform.demo.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Stephen on 2017/5/24.<br/>
 * Description : <p></p>
 **/
@Service
public class BlogServiceImpl implements IBlogService{

    @Autowired
    private PostsMapper postsMapper;


    public Posts findOne(Integer id){


      return   postsMapper.selectByPrimaryKey(id);
    }

}
