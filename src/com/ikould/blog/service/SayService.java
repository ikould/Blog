package com.ikould.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikould.blog.dao.SayDao;

@Service
public class SayService {
	@Autowired
	SayDao sayDao;

}
