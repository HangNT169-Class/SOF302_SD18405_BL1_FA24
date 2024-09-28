package com.poly.hangnt169.B9_JPA.repository;

import com.poly.hangnt169.B9_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // CRUD 1 bang => Khong can phan viet
    // lay ra tat ca => findAll
    // add/update => save
    // delete => deleteById
}
