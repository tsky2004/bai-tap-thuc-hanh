package NhanVien;

import java.util.Scanner;

public class nhanvienparttime {
    public int giolamviec;
    Scanner sc = new Scanner(System.in);
    public void nhanvienparttime(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so ngay lam ");
        giolamviec= sc.nextInt();
    }
    
    public void LoaiNhanVien(String LoaiNhanVien) {
        this.hanVien = LoaiNhanVien;
    }

    public void TinhLuong() {
        Luong = confit.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * Giolamvien;
    }

    @Override
    public void InTT() {
        super.InTT();
    }
}

