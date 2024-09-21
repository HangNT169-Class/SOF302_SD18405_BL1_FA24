package com.poly.hangnt169.B3_4_CRUDListFixCung.service;

import com.poly.hangnt169.B3_4_CRUDListFixCung.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
// Tang service: Chua xu ly logic cua toan bo project
public class SinhVienService {
    // chua toan bo cac chuc nang ma de yeu
    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienService() {
        // add cac phan tu vao day
        lists.add(new SinhVien("ABC123", "abc", 18, "Ha Noi", true));
        lists.add(new SinhVien("ABC124", "gfds", 18, "Ha Noi", false));
        lists.add(new SinhVien("ABC125", "gfsd", 11, "Ha gsdf", false));
        lists.add(new SinhVien("ABC126", "gsfd", 123, "Ha gsfd", true));
        lists.add(new SinhVien("ABC127", "gsfd", 18, "Ha Noifsdg", false));
        lists.add(new SinhVien("ABC128", "abc", 44, "Ha Noi", true));
        lists.add(new SinhVien("ABC121", "abc", 18, "Ha Noi", true));
    }

    public List<SinhVien> getAll() {
        return lists;
    }

    public void delete(String mssv) {
        // lamda (remove if)
        lists.removeIf(sinhVien -> sinhVien.getMssv().equalsIgnoreCase(mssv));
//        for (int i = 0; i < lists.size(); i++) {
//            if(lists.get(i).getMssv().equalsIgnoreCase(mssv)){
//                lists.remove(i);
//                break;
//            }
//        }
    }

    public SinhVien detailSinhVien(String mssv) {
//        for (int i = 0; i < lists.size(); i++) {
//            if (lists.get(i).getMssv().equalsIgnoreCase(mssv)) {
//                return lists.get(i);
//            }
//        }
//        return null;
        // C2:filter: bo loc ( loc du lieu theo dieu kien mong muon)
        return lists.stream()
                .filter(s -> s.getMssv().equalsIgnoreCase(mssv))
                .findFirst()
                .orElse(null);
    }

    public void addSinhVien(SinhVien sv) {
        // validate
        lists.add(sv);
    }
}
