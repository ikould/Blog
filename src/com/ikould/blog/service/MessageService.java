package com.ikould.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikould.blog.dao.MessageDao;

@Service
public class MessageService {
	@Autowired
	MessageDao messageDao;
	
	
}
