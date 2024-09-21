package com.poly.hangnt169.B3_4_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SinhVien {

    private String mssv;

    private String ten;

    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;

}
