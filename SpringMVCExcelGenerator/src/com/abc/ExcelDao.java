package com.abc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ExcelDao {

	public List<User> getUserList() {
		
		List<User>userList= new ArrayList<User>();
		
		userList.add(new User(111, "Ammy", "Amit", "Nautiyal"));
		userList.add(new User(123, "Mohan", "Mohan", "Bhatnagar"));
		userList.add(new User(131, "Manu", "Manprit", "Kaur"));
		userList.add(new User(141, "Simmy", "Simran", "KaurSingh"));
		userList.add(new User(171, "Amande", "Amandeep", "Nauty"));
		return userList;
	}

}
