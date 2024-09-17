package com.poly.hangnt169.B3_4_CRUDListFixCung.controller;

import com.poly.hangnt169.B3_4_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SinhVienController {

    // goi service => goi thong @Autowire
    @Autowired
    private SinhVienService service;

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiSinhVien(Model model){
        model.addAttribute("listSinhVien",service.getAll());
        return "buoi3/sinhviens";
    }

    @GetMapping("/sinh-vien/remove/{id1}")
    public String removeSinhVien(@PathVariable("id1") String mssv){
        service.delete(mssv);
        // Xoa xong quay ve trang hien thi (redirect)
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/sinh-vien/detail/{id1}")
    public String detailSinhVien(@PathVariable("id1") String mssv, Model model){
        model.addAttribute("sv",service.detailSinhVien(mssv));
        return "buoi3/detail-sinh-vien";
    }
}
