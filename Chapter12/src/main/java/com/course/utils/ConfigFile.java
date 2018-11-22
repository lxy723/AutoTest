package com.course.utils;

import com.course.model.interfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {
    private static ResourceBundle bundle = ResourceBundle.getBundle("application",Locale.CHINA);
    public static String getUrl(interfaceName name){
        String address = bundle.getString("test.url");
        String uri="";
        //最终测试地址
        String testUrl;

        if (name == interfaceName.ADDUSERINFO){
            uri = bundle.getString("addUser.uri");
        }
        if (name == interfaceName.GETUSERINFO){
            uri = bundle.getString("getUserInfo.uri");
        }
        if (name == interfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");
        }
        if (name == interfaceName.LOGIN){
            uri = bundle.getString("login.uri");
        }
        if (name == interfaceName.UPDATEUSERINFO){
            uri = bundle.getString("updateUserInfo.uri");
        }
        testUrl = address + uri;
        return testUrl;
    }
}
