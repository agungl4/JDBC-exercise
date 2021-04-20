package com.enigma.tabungan.dao;


import com.enigma.tabungan.entity.User;
import com.enigma.tabungan.mapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public String addNewUser(User user) {
//        Integer id = user.getId();
        String name = user.getName();
        String telephone = user.getTelephone();
        String address = user.getAddress();
        String sql = "INSERT INTO mst_user(name, telephone, address) " +
                "VALUES (?,?,?)";
        String res = (jdbcTemplate.update(sql, name,telephone,address)==1) ? "Inserted" : "Error";
        return res;
    }

    @Override
    public User findUserById(Integer id) {
        String sql = "SELECT * FROM mst_user WHERE id=?";
        User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
        return user;
    }
}
