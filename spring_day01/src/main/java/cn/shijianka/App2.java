package cn.shijianka;


import cn.shijianka.dao.BookDao;
import cn.shijianka.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //3 获取容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4 获取bean
        BookDao bookDao =(BookDao) ctx.getBean("bookDao");
        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}
