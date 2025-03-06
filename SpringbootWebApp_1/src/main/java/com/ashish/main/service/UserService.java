package com.ashish.main.service;

import com.ashish.main.entities.User;

public interface UserService {  //To interact with service layer this interface we created and to implements, we have to create class
		
		public boolean registerUser(User user);
		public User loginUser (String email, String password);

}
