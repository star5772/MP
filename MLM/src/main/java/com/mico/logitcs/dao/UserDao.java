package com.mico.logitcs.dao;

import java.util.List;
import java.util.HashMap;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.mico.logitcs.entity.User;

@Repository
public class UserDao {

	@Inject
	private SqlSessionTemplate tpl;
	
	public String selectUser(int uno) {
		return tpl.selectOne("userMapper.findById", uno);
	}
	
	public List<User> findAll() {
		return tpl.selectList("userMapper.findAll");
	}
	
	public int insert(User user) {
		return tpl.insert("userMapper.insert", user);
	}
}
