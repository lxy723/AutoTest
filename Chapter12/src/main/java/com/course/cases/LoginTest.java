package com.course.cases;

import com.course.config.TestConfig;
import com.course.model.LoginCase;
import com.course.model.interfaceName;
import com.course.utils.ConfigFile;
import com.course.utils.DatabaseUtil;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest {
    @BeforeTest(groups = "logintrue",description = "测试准备工作")
    public void beforeTest(){
        TestConfig.getUserInfoUrl = ConfigFile.getUrl(interfaceName.GETUSERINFO);
        TestConfig.addUserUrl = ConfigFile.getUrl(interfaceName.ADDUSERINFO);
        TestConfig.getUserListUrl = ConfigFile.getUrl(interfaceName.GETUSERLIST);
        TestConfig.loginUrl = ConfigFile.getUrl(interfaceName.LOGIN);
        TestConfig.updateUserInfoUrl = ConfigFile.getUrl(interfaceName.UPDATEUSERINFO);

        TestConfig.defaultHttpClient = new DefaultHttpClient();
    }

    @Test(groups = "loginTrue",description = "用户登录成功接口")
    public void  loginTrue() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSeesion();
        LoginCase loginCase = session.selectOne("loginCase",1);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);
    }

    @Test(groups = "loginFalse",description = "用户登录失败接口")
    public void  loginFalse() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSeesion();
        LoginCase loginCase = session.selectOne("loginCase",2);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);
    }
}
