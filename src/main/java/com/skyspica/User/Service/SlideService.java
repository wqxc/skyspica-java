package com.skyspica.User.Service;

import com.skyspica.Account.Vo.AccountVo;
import com.skyspica.User.Vo.SlideVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by xiaolei on 17/8/8.
 */
@Service
public class SlideService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<SlideVo> getSlide(){

        String sql = " SELECT id,url,description,titles  FROM slide";

        List<SlideVo> SlideList = jdbcTemplate.query(sql, new RowMapper<SlideVo>() {
            @Override
            public SlideVo mapRow(ResultSet resultSet, int i) throws SQLException {
                SlideVo sv = new SlideVo();
                sv.setDescription(resultSet.getString("description"));
                sv.setUrl(resultSet.getString("URL"));
                sv.setTitles(resultSet.getString("titles"));
                sv.setId(resultSet.getInt("id"));
                return sv;
            }
        });

        return SlideList;
    }
}
