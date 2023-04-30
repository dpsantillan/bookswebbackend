package pe.edu.upao.bookswebbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upao.bookswebbackend.models.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,  Long> {
    @Query("select b from Book b where b.title = :title")
    public List<Book> listByTitle(String title);
}
