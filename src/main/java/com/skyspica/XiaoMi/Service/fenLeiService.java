package com.skyspica.XiaoMi.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.skyspica.XiaoMi.Vo.FenLeiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.skyspica.XiaoMi.Vo.FenLeiOtherVo;

/**
 * Created by xiaolei on 17/9/7.
 */
@Service
public class fenLeiService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<FenLeiVo> getFenLeiList(){

        String sql = " SELECT id,text,isNav from fenlei";

        List<FenLeiVo> FenLeiList = jdbcTemplate.query(sql, new RowMapper<FenLeiVo>() {
            @Override
            public FenLeiVo mapRow(ResultSet resultSet, int i) throws SQLException {
                FenLeiVo fv = new FenLeiVo();
                fv.setId(resultSet.getInt("id"));
                fv.setText(resultSet.getString("text"));
                fv.setIsNav(resultSet.getInt("isNav"));
                return fv;
            }
        });

        return FenLeiList;
    }
    public List<FenLeiOtherVo> getFenLeiOtherList(){

        String sql = " SELECT id,text from fenleiheshe";

        List<FenLeiOtherVo> FenLeiOtherList = jdbcTemplate.query(sql, new RowMapper<FenLeiOtherVo>() {
            @Override
            public FenLeiOtherVo mapRow(ResultSet resultSet, int i) throws SQLException {
                FenLeiOtherVo fov = new FenLeiOtherVo();
                fov.setId(resultSet.getInt("id"));
                fov.setText(resultSet.getString("text"));
                return fov;
            }
        });

        return FenLeiOtherList;
    }

}


