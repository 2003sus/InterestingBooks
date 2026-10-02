package com.example.interestingbooks;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/V1/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Operation(summary = "查所有书")
    @GetMapping
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    @Operation(summary = "按 ID 查一本书")
    @GetMapping("/{id}")
    public Book getBookById(
            @Parameter(description = "书的 ID") @PathVariable Integer id
    ) {
        return bookService.getBookById(id);
    }

    @Operation(summary = "新增一本书")
    @PostMapping
    public Book addBook(@Valid @RequestBody Book book) {
        return bookService.addBook(book);
    }

    @Operation(summary = "更新一本书")
    @PutMapping("/{id}")
    public Book updateBook(
            @Parameter(description = "书的 ID") @PathVariable Integer id,
            @Valid @RequestBody Book book
    ) {
        return bookService.updateBook(id, book);
    }

    @Operation(summary = "删除一本书")
    @DeleteMapping("/{id}")
    public void deleteBook(
            @Parameter(description = "书的 ID") @PathVariable Integer id
    ) {
        bookService.deleteBook(id);
    }
}