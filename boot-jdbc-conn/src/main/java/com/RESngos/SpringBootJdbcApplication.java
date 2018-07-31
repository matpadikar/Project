package com.RESngos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.RESngos.model.Restaurant;
import com.RESngos.service.RestaurantService;
//import com.RESngos.service.imp1.RestaurantServiceImp1;

@SpringBootApplication
public class SpringBootJdbcApplication {
	
	
	@Autowired
	RestaurantService restaurantService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		RestaurantService restaurantService = context.getBean(RestaurantService.class);
		
		
		Restaurant res= new Restaurant();
		res.setResId("res");
		res.setResName("res");
		
		Restaurant res1= new Restaurant();
		res1.setResId("res1");
		res1.setResName("res1");
		
		Restaurant res2= new Restaurant();
		res2.setResId("Res2");
		res2.setResName("Res2");

		
		restaurantService.insertRestaurant(res);

		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurants.add(res1);
		restaurants.add(res2);
		restaurantService.insertRestaurants(restaurants);

		restaurantService.getAllRestaurants();
		
		restaurantService.getRestaurantById(res1.getResId());

	}
}