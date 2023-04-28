package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.dao.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.models.User;

@Controller
public class RegisterController {
	@Autowired
	Userdb userdb;
	
	@RequestMapping(path="/registerUser", method=RequestMethod.POST)
	public String registerUser(@RequestParam("email") String email, 
            @RequestParam("password") String password,
            @RequestParam("name") String name, Model model) {
		System.out.println(name + " " + email + " " + password);
		
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		
		User user = new User(name,email,password);
		this.userdb.save(user);
		
		return "";
	}
	
	public void saveUser(User user) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        SessionFactory sFactory = cfg.buildSessionFactory(reg);
        Session session = null;
        Transaction transaction = null;
        try {
            session = sFactory.openSession();
            transaction = session.beginTransaction();
            System.out.println(user.toString());
                session.merge(user);
            transaction.commit();
        } catch (Exception e) {
        	System.out.println("Imp Msssg : " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (session != null)
                session.close();
        }
    }

}
