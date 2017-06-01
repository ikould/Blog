package com.ikould.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikould.blog.dao.ArticleCategroyDao;

@Service
public class ArticleCategroyService {
	
	@Autowired
	ArticleCategroyDao articleCategroyDao;

}
