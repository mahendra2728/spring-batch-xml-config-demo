package com.pm.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pm.model.User;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet resultSet, int i) throws SQLException {
		User user = new User();
		user.setId(resultSet.getInt("id"));
		user.setAddress(resultSet.getString("address"));
		user.setUsername(resultSet.getString("username"));
		return user;
	}
}