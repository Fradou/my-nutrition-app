package com.fradou.nutrition.mvc.entity.work;

import java.time.LocalDate;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fradou.nutrition.mvc.entity.generic.GenericEntity;
import com.fradou.nutrition.mvc.entity.security.CustomUser;
import com.fradou.nutrition.mvc.utils.work.MealType;

/**
 * Entity for daily intake.
 * 
 * @author AF
 */
@Entity
@Component
@Table(name="intake")
public class Intake extends GenericEntity {
	
	@NotNull
	private LocalDate intakeDate; 
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private CustomUser user;
	
	@OneToMany(mappedBy="intake")
	@MapKeyEnumerated(EnumType.ORDINAL)
	private Map<MealType, Meal> meals;
	
	@Override
	protected String initializeEntityPath() {
		return "/intake";
	}

	public CustomUser getUser() {
		return user;
	}

	public void setUser(CustomUser user) {
		this.user = user;
	}

	public LocalDate getIntakeDate() {
		return intakeDate;
	}

	public void setIntakeDate(LocalDate intakeDate) {
		this.intakeDate = intakeDate;
	}

	public Map<MealType, Meal> getMeals() {
		return meals;
	}

	public void setMeals(Map<MealType, Meal> meals) {
		this.meals = meals;
	}
}
