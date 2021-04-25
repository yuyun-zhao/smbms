package com.zhao.dao.user;

import com.zhao.pojo.User;
import java.sql.Connection;
import java.sql.SQLException;

public interface UserDao {

    // 得到要登录的用户
    User getLoginUser(Connection connection, String userCode) throws SQLException;

    // 修改用户密码
    int updatePsw(Connection connection, int id, String password) throws SQLException;
}
