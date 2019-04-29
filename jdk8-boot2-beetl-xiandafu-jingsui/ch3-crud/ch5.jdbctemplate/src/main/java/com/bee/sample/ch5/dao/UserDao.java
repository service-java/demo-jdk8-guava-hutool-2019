package com.bee.sample.ch5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.bee.sample.ch5.entity.User;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTempalte;
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Integer totalUserInDepartment(Long departmentId) {
        String sql = "select count(1) from user where department_id=?";
        Integer count = jdbcTempalte.queryForObject(sql, Integer.class, departmentId);
        return count;
    }

    public Integer totalUserInDepartment2(Long departmentId) {
        String sql = "select count(1) from user where department_id=:deptId";
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("deptId", departmentId);
        Integer count = namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
        return count;
    }

    public User findUserById(Long userId) {
        String sql = "select * from user where id=?";
        User user = jdbcTempalte.queryForObject(
            sql,
            new RowMapper<User>() {
                public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setDepartmentId(rs.getInt("department_id"));

                    return user;
                }
            },
            userId
        );
        return user;
    }

    public List<User> getUserByDepartmentId(Long departmenetId) {
        String sql = "select * from user where department_id=? ";
        List<User> user = jdbcTempalte.query(sql, new UserRowMapper(), 1);
        return user;
    }

    public Map findUserById2(Integer userId) {
        String sql = "select * from user where id=?";
        Map map = jdbcTempalte.queryForMap(sql, userId);
        return map;
    }

    public void updateInfo(User user) {
        String sql = "update user set name=? and departmet_id=? where id = ?";
        jdbcTempalte.update(sql, user.getName(), user.getDepartmentId(), user.getId());
    }

    public void updateInfoByNamedJdbc(User user) {
        String sql = "update user set name=:name and departmet_id=:departmentId where id = :id";
        SqlParameterSource source = new BeanPropertySqlParameterSource(user);
        namedParameterJdbcTemplate.update(sql, source);

    }

    public Integer insertUser(final User user) {
        final String sql = "insert into user (name, departmet_id ) values (?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTempalte.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, new String[]{"id"});
                ps.setString(1, user.getName());
                ps.setInt(2, user.getDepartmentId());
                return ps;
            }
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }

    static class UserRowMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setDepartmentId(rs.getInt("department_id"));
            return user;
        }

    }
}