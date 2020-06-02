import com.aostar.pojo.BookPojo;
import com.aostar.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description 单元测试
 * @Author jzhao
 * @Date 2020-6-1 22:04
 **/
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("BookServiceImpl", BookService.class);
        List<BookPojo> bookPojos = bookService.selectBookList();
        for (BookPojo book:bookPojos) {
             System.out.println(book);
        }
    }
}
