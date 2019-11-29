package com.jw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.jw.pojo.User;

public interface UserMapper {
	public void createUser(User user);

	public User getUserByName(String userName);

	@Select("select * from tb_user")
	public List<User> getUserList();
	

}
