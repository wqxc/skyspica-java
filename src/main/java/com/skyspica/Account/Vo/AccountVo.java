package com.skyspica.Account.Vo;
import java.io.Serializable;
/**
 * Created by xiaolei on 17/8/8.
 */
public class AccountVo {
//    private static final long serialVersionUID = 2120869894112984147L;
    public String name;
    public String pwd;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }
    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
