package com.aostar.controller;

import com.aostar.pojo.BookPojo;
import com.aostar.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/bookListByBookName")
    public String selectBookListByBookName(String bookName,Model model){
        if("".equals(bookName)){
            bookName=null;
        }
        List<BookPojo> books = bookService.selectBookListByBookName(bookName);
        model.addAttribute("list",books);
        return "bookList";
    }

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

    /**
      * @Description: 跳转到添加书籍页面
      * @params: []
      * @return: java.lang.String
      * @author: 2020-6-2 21:57 jzhao
      * @reviser and other massage: 
      */
    @RequestMapping("/addBookPage")
    public String toAddBook(){
        return "addBook";
    }

    /**
      * @Description: 新增书籍
      * @params: [bookPojo]
      * @return: java.lang.String
      * @author: 2020-6-2 22:19 jzhao
      * @reviser and other massage:
      */
    @RequestMapping("/saveBook")
    public String saveBook(BookPojo bookPojo){
        bookService.saveBook(bookPojo);
        return "redirect:/book/bookList";//重定向到@RequestMapping("/bookList")请求
    }

    /**
      * @Description: 跳转到更新书籍页面
      * @params: []
      * @return: java.lang.String
      * @author: 2020-6-2 22:32 jzhao
      * @reviser and other massage:
      */
    @RequestMapping("/updateBookPage")
    public String toUpdateBook(String id,Model model){
        BookPojo bookPojo = bookService.selectBookById(id);
        model.addAttribute("bookPojo",bookPojo);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(BookPojo bookPojo){
        bookService.updateBook(bookPojo);
        return "redirect:/book/bookList";//重定向到@RequestMapping("/bookList")请求
    }

    /**
      * @Description: 删除书籍
      * @params: [id]
      * @return: java.lang.String
      * @author: 2020-6-2 23:29 jzhao
      * @reviser and other massage: 使用Restful风格
      */
    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") String id){
        bookService.deleteBookById(id);
        return "redirect:/book/bookList";
    }
}
