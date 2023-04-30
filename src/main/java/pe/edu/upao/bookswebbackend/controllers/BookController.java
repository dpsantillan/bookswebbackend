package pe.edu.upao.bookswebbackend.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.upao.bookswebbackend.models.Book;
import pe.edu.upao.bookswebbackend.services.BookService;
@RestController
@RequestMapping("/api/books")

public class BookController {
    public final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestParam String title,
                                        @RequestParam String author, @RequestParam String description,
                                        @RequestParam MultipartFile image) {
        Book newBook = bookService.addBook(title, author, description, image);
        return ResponseEntity.ok(newBook);
    }
}
