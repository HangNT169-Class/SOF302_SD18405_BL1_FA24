package com.poly.hangnt169.B3_4_CRUDListFixCung.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SinhVien {

    @NotEmpty(message = "MSSV k duoc de trong")
    @Size(min = 5)// do dai toi thieu la bn day ... co the truyen them max
    private String mssv;

    @NotEmpty
//    @Pattern(regexp = "truyen regex vao day")
    private String ten;

    @NonNull
    @Min(value = 5) // tuoi phai lon hon bn day
    @Max(value = 10) // tuoi phai nho hon bn day
    private Integer tuoi;

    @NotBlank
    private String diaChi;

    private Boolean gioiTinh;

}
