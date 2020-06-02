package com.aostar.dao;

import com.aostar.pojo.BookPojo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Description 书籍持久层
 * @Author jzhao
 * @Date 2020-6-1 18:41
 **/
@Repository
public interface BookMapper {
    /**
      * @Description: 增加一本书
      * @params: [book]
      * @return: int
      * @author: 2020-6-1 21:24 jzhao
      * @reviser and other massage:
      */
    int saveBook(BookPojo book);

    /**
      * @Description: 根据id删除书籍
      * @params: [id]
      * @return: int
      * @author: 2020-6-1 21:25 jzhao
      * @reviser and other massage:
      */
    int deleteBookById(@Param("id") String id);

    /**
      * @Description: 更新书籍信息
      * @params: [bookPojo]
      * @return: int
      * @author: 2020-6-1 21:26 jzhao
      * @reviser and other massage:
      */
    int updateBook(BookPojo bookPojo);

    /**
      * @Description: 根据id查询书籍
      * @params: [id]
      * @return: com.aostar.pojo.BookPojo
      * @author: 2020-6-2 8:47 jzhao
      * @reviser and other massage:
      */
    BookPojo selectBookById(@Param("id") String id);

    /**
      * @Description: 查询所有书籍
      * @params: []
      * @return: List<BookPojo>
      * @author: 2020-6-1 21:27 jzhao
      * @reviser and other massage:
      */
    List<BookPojo> selectBookList();

    /**
      * @Description: 根据书籍名称查询书籍
      * @params: [bookName]
      * @return: java.util.List<com.aostar.pojo.BookPojo>
      * @author: 2020-6-3 0:32 jzhao
      * @reviser and other massage: 
      */
    List<BookPojo> selectBookListByBookName(@Param("bookName") String bookName);

}
