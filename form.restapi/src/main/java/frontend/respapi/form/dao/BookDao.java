package frontend.respapi.form.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import frontend.respapi.form.entities.Book;

public interface BookDao extends JpaRepository<Book, Integer>{

}
