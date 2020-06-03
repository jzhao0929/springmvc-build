package com.aostar.UtilTools;

import java.util.UUID;

/**
 * @Description 获取UUID
 * @Author jzhao
 * @Date 2020-6-3 10:49
 **/
public class UUIDTool {
    /**
      * @Description: 获取32位字符
      * @params: []
      * @return: java.lang.String
      * @author: 2020-6-3 10:54 jzhao
      * @reviser and other massage:
      */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
