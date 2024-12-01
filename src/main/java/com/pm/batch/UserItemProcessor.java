package com.pm.batch;

import com.pm.model.User;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {

	public User process(User user) throws Exception {
		System.out.println(" In Processor User is >>> "+user.toString());
		return returnUpperCaseUserObjects(user);
	}

	private static User returnUpperCaseUserObjects(User user) {
		User newUser = new User();
		newUser.setId(user.getId());
		newUser.setUsername(user.getUsername().toUpperCase());
		newUser.setAddress(user.getAddress().toUpperCase());
		return newUser;
	}

}