package com.poly.hangnt169.B9_JPA.repository;

import com.poly.hangnt169.B9_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category1, Long> {
    // CRUD 1 bang => Khong can phan viet
    // lay ra tat ca => findAll
    // add/update => save
    // delete => deleteById
    // 1. Raw SQL => TRUY VAN DUA VAO TEN HAM => TEN HAM SE LA DIEU KIEU SQL
    // 2. JPQL ( JPA Query Language) => TRUY VAN TREN THUC THE
    // KHONG CO SELECT *
    // so 1,2 => phu thuoc vao vi tri cua ham
    @Query("SELECT c FROM Category1 c WHERE c.listCategory = ?2")
    Category1 searchCode(String name, String code);

    @Query("SELECT c FROM Category1 c WHERE c.listCategory =:code1")
    Category1 searchCode1(@Param("code1") String code, String name);

    // 3. native query ( truy van bang sql)
}
