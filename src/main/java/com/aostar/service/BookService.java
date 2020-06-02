package com.aostar.service;

import com.aostar.pojo.BookPojo;

import java.util.List;

/**
 * @描述：
 * @创建人： 2020-6-1 14:24 企业平台事业部/jzhao1
 */
public interface BookService {

    /**
      * @Description: 查询所有书籍
      * @params: []
      * @return: java.util.List<com.aostar.pojo.BookPojo>
      * @author: 2020-6-1 21:57 jzhao
      * @reviser and other massage:
      */
    List<BookPojo> selectBookList();
}
