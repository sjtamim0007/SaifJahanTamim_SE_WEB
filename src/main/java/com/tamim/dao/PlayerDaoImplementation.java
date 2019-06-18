package com.tamim.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tamim.entity.Player;

@Repository
public class PlayerDaoImplementation implements PlayerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void savePlayer(Player thePlayer) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/upate the customer
		currentSession.saveOrUpdate(thePlayer);
	}

}
