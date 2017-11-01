package com.gyh.provider;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.gyh.api.UserService;
import com.gyh.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<UserDto> getUsers() {
		UserDto u1=new UserDto();
		u1.setAge(11);
		u1.setName("郭艳红");
		UserDto u2=new UserDto();
		u2.setAge(12);
		u2.setName("yfs");
		
		List<UserDto> list=new ArrayList<>();
		list.add(u1);
		list.add(u2);
		System.out.println("========================");
		return list;
	}

	
	@Override
	public UserDto registUser(UserDto user) {
		user.setId(1001L);
		return user;
	}


	@Override
	public UserDto getUserById(Long id,HttpServletRequest request) {
		UserDto user = new UserDto();
		user.setId(1000L);
		user.setName(request.getRemoteAddr());
		user.setAge(100);
		
		return user;
	}

}
