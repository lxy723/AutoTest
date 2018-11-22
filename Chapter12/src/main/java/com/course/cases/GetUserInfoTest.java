package com.course.cases;

import com.course.config.TestConfig;
import com.course.model.GetUserCase;
import com.course.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserInfoTest {

    @Test(dependsOnGroups = "loginTrue",description = "获取userId为1的用户信息")
    public void getUserInfo() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSeesion();
        GetUserCase getUserCase = session.selectOne("getUserInfoCase",1);
        System.out.println(getUserCase.toString());
        System.out.println(TestConfig.getUserInfoUrl);
    }
}
