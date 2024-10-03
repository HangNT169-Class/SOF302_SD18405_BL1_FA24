package com.poly.hangnt169.B3_4_CRUDListFixCung.controller;

import com.poly.hangnt169.B3_4_CRUDListFixCung.entity.SinhVien;
import com.poly.hangnt169.B3_4_CRUDListFixCung.service.SinhVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sinh-vien/") // tach rieng duong dan chung len tren
public class SinhVienController {

    // goi service => goi thong @Autowire
    @Autowired
    private SinhVienService service;
    // Validate => Spring Validation
    // 1. Add thu vien vao pom
    @GetMapping("hien-thi")
    // duong dan : duong danh chung + duong dan truyen vao trong get/postmapping
    public String hienThiSinhVien(Model model) {
        model.addAttribute("listSinhVien", service.getAll());
        return "buoi3/sinhviens";
    }

    @GetMapping("remove/{id1}")
    public String removeSinhVien(@PathVariable("id1") String mssv) {
        service.delete(mssv);
        // Xoa xong quay ve trang hien thi (redirect)
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("detail/{id1}")
    public String detailSinhVien(@PathVariable("id1") String mssv, Model model) {
        model.addAttribute("sv", service.detailSinhVien(mssv));
        return "buoi3/detail-sinh-vien";
    }

    @GetMapping("view-add")
    public String viewAddSinhVien(Model model) {
        // add => new SV
        // update => truyen doi tuong dang duoc chon
        model.addAttribute("sv1", new SinhVien());
        return "/buoi3/add-sinh-vien";
    }
    @PostMapping("add")
    public String addSinhVien(@Valid @ModelAttribute("sv1") SinhVien sv,
                              BindingResult result
                              ){
        // Neu co loi thi quay lai trang form add
        if(result.hasErrors()){
            return "/buoi3/add-sinh-vien";
        }
        service.addSinhVien(sv);
        return "redirect:/sinh-vien/hien-thi";
    }
//
//    @PostMapping("add")
//    public String addSinhVien(
//            @RequestParam("mssv")String ma,
//            @RequestParam("ten")String ten,
//            @RequestParam("tuoi")String tuoi,
//            @RequestParam("diaChi")String diaChi1,
//            @RequestParam("gioiTinh")String gioiTinh
//    ){
//        // Khoi tao doi dung contructor
//        SinhVien sv = SinhVien.builder()
//                .diaChi(diaChi1)
//                .mssv(ma)
//                .ten(ten)
//                .tuoi(Integer.valueOf(tuoi))
//                .gioiTinh(Boolean.valueOf(gioiTinh))
//                .build();
//        // goi ham add trong service
//        service.addSinhVien(sv);
//        // Quay ve trang hien thi
//        return "redirect:/sinh-vien/hien-thi";
//    }
    // C1: responsebody ( tra ve api - json)
    @GetMapping("test")
    @ResponseBody
    public List<SinhVien>hienThi(){
        return service.getAll();
    }
}
