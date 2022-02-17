package cn.shijianka.service.impl;

import cn.shijianka.dao.BookDao;
import cn.shijianka.dao.impl.BookDaoImpl;
import cn.shijianka.service.BookService;

public class BookServiceImpl implements BookService {
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    private BookDao bookDao ;

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
