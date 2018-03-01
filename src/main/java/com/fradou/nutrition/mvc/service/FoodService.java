package com.fradou.nutrition.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fradou.nutrition.mvc.dao.interfaces.FoodDAO;
import com.fradou.nutrition.mvc.entity.Food;

@Service
@Transactional(rollbackFor = Exception.class)
public class FoodService {

	@Autowired
	private FoodDAO fDao;
	
	public Food get(int id) {
		return fDao.find(id);
	}
}
