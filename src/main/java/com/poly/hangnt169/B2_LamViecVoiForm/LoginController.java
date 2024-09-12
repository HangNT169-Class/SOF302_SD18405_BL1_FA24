package com.poly.hangnt169.B2_LamViecVoiForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * J4: JSP & Servlet
 * 	+ JSP : FE ( chứa code giao diện )
 * 	+ Servlet : Chứa code Java- Logic (BE)
 * J5: JSP & Spring Boot
 * 	+ JSP : FE
 * 	+ Spring Boot : Chứa code Java – Logic (Thay cho servlet )
 *
 * 	Trong java trong main : Java – Spring Boot
 * 	JSP : Bắt buộc phải nằm trong webapp
 *
 * Để sử dụng được JSP làm giao diện
 * B1: Tạo folder webapp (ngang hàng java)
 * B2: Config trong application.protif…
 * B3: Add thư viện vào file pom
 */
@Controller
// annotation se bat dau bang @
// Trong Sring boot muon nhan 1 class bean => Bat buoc phai danh dau bang cac annotaion
public class LoginController {
    /**
     * Spring Boot nhan tat ca cac class trong sau trong com (affiact)
     * duoc danh bang cac annotation @Controller, @Repository, @Service, @RestController....
     * la 1 bean
     * Tang controller la tang trao doi giua client (FE) => jsp va server (BE)
     * thong qua phuong thuc http.
     * Co 4 phuong thuc http co ban:
     *   + GET: Hien thi/Lay
     *   + POST: Add (Them)
     *   + PUT: Update(Sua)
     *   + DELETE: Xoa
     *  Tuy nhien J4, J5 chi dung 2 phuong thuc Get & Post
     *    + GET: Hien/Lay
     *    + POST: Xu ly
     *  Tat ca cac ham trong class (@Controller ) => LUON LUON TRA VE 1 STRING (RETURN RA 1 VIEW)
     */
    // GET
    @GetMapping("/login")
    public String hienThiGiaoDien(Model model){
        /**
         * Truyen gia tri tu controller -> jsp (FE):
         * J4: request.setAttibute
         * J5: Model (addAtribute)
         */
        String mess = "SD18405";
        model.addAttribute("a1",mess);
        return "form-login";
    }

    @PostMapping("/ket-qua")
    public String hienThiKetQua(
            @RequestParam("u1") String username,
            @RequestParam("p1") String password, Model model
    ){
        // Lay gia tri tu view (giao dien) ve controller
        // J4: getAttribute
        // J5: Su dung @RequestParam
        model.addAttribute("a2",username);
        model.addAttribute("a3",password);
        return "hien-thi-ket-qua";
    }
}
