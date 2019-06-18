package com.tamim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tamim.dao.PlayerDao;
import com.tamim.entity.Player;

@Service
public class PlayerServiceImplementation implements PlayerService{
	
	@Autowired
	private PlayerDao playerDao;
	
	@Override
	@Transactional
	public void savePlayer(Player thePlayer) {
		playerDao.savePlayer(thePlayer);
	}

}
