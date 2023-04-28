package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.models.User;
@Component
public class Userdb {
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int save(User user) {
		Integer i = (Integer) this.hibernateTemplate.save(user);
		return i;
	}
	public List<User> getAll(){
		List<User> list = this.hibernateTemplate.loadAll(User.class);
		return list;
	}

}
