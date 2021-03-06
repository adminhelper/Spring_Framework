package com.springstudy.biz.user.impl;

import com.springstudy.biz.user.UserDAO;
import com.springstudy.biz.user.UserService;
import com.springstudy.biz.user.UserVO;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO;	

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	
}
