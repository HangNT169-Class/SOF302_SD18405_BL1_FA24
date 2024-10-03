package com.poly.hangnt169.B9_JPA.controller;

import com.poly.hangnt169.B9_JPA.entity.Category1;
import com.poly.hangnt169.B9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @GetMapping("/category/hien-thi")
    public String hienThiCategory(Model model) {
        model.addAttribute("listCategory", repository.findAll());
        // add/ update
//        repository.save(doi tuong);
        // delete
//        repository.delete(doi tuong);
//        repository.deleteById(khoa chinh);
        return "/buoi9/category";
    }

    @ResponseBody
    @GetMapping("/phan-trang")
    // pageNo: dai dien day la trang thu may
    // size: bn phan tu tren 1 trang
    // VD: 10 phan tu, 3 phan/trang
    // => 4 trang
    // Trang 1: 3 phan tu => 0
    // Trang 2: 3 phan tu => 1
    // Trang 3: 3 phan tu
    // Trang 4: 1 phan tu
    // Page => import .domain
    // Phan trang: Page, Pageable
    public List<Category1> phanTrang(@RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo,
                                     @RequestParam(value = "size",defaultValue = "2") Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return repository.findAll(pageable).getContent();
    }
}
