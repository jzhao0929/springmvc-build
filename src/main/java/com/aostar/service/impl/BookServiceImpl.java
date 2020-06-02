package com.aostar.service.impl;

import com.aostar.dao.BookMapper;
import com.aostar.pojo.BookPojo;
import com.aostar.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Description 书籍业务接口
 * @Author jzhao
 * @Date 2020-6-1 18:41
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<BookPojo> selectBookList() {
        return bookMapper.selectBookList();
    }
}
