package com.aostar.service.impl;

import com.aostar.dao.BookMapper;
import com.aostar.pojo.BookPojo;
import com.aostar.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Description 书籍业务接口实现
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

    @Override
    public int saveBook(BookPojo book) {
        return bookMapper.saveBook(book);
    }

    @Override
    public int deleteBookById(String id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(BookPojo book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public BookPojo selectBookById(String id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public List<BookPojo> selectBookListByBookName(String bookName) {
        return bookMapper.selectBookListByBookName(bookName);
    }
}
