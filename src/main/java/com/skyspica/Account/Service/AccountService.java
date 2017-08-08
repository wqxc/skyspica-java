package com.skyspica.Account.Service;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import com.skyspica.Account.Vo.AccountVo;





/**
 * Created by xiaolei on 17/8/8.
 */
@Service
public class AccountService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<AccountVo> getList(){

        String sql = " SELECT NAME,PWD   FROM user";

        List<AccountVo> AccountInfoList = jdbcTemplate.query(sql, new RowMapper<AccountVo>() {
            @Override
            public AccountVo mapRow(ResultSet resultSet, int i) throws SQLException {
                AccountVo av = new AccountVo();
                av.setName(resultSet.getString("NAME"));
                av.setPwd(resultSet.getString("PWD"));
                return av;
            }
        });

        return AccountInfoList;
    }
}
