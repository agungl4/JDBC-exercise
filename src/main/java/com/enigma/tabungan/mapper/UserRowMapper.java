package com.enigma.tabungan.mapper;

import com.enigma.tabungan.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User>{
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setTelephone(resultSet.getString("telephone"));
        user.setAddress(resultSet.getString("address"));
        return user;
    }
}
