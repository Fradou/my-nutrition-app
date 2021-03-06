package com.fradou.nutrition.mvc.controller.api;

import com.fradou.nutrition.mvc.controller.api.generic.GenericApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fradou.nutrition.mvc.entity.work.Meal;

/**
 * Controller in charge of Meal calls (nutrition entity)
 * 
 * @author AF
 */
@RequestMapping("/api/meal")
@RestController
public class MealApiController extends GenericApiController<Meal> {
	
	protected String setDefaultEntityGraph() {
		return "graph.MealMealDetail";
	}
	
	@Override
	protected boolean setUserDependance() {
		return true;
	}
}
