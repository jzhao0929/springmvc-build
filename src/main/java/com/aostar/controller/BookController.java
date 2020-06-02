package com.aostar.controller;

import com.aostar.pojo.BookPojo;
import com.aostar.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * @Description :书籍前端接口
 * @Author jzhao
 * @Date 2020-6-1 21:50
 **/
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    /**
      * @Description:
      * @params: []
      * @return: java.lang.String
      * @author: 2020-6-1 21:53 jzhao
      * @reviser and other massage:
      */
    @RequestMapping("/bookList")
    public String selectBookList(Model model){
        List<BookPojo> books = bookService.selectBookList();
        model.addAttribute("list",books);
        return "bookList";
    }
}
