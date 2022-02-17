package cn.shijianka;

import cn.shijianka.service.BookService;
import cn.shijianka.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
