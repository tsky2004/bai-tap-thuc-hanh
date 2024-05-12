package NhanVien;

import java.util.Scanner;

public class nhanvien {
    public String Ten;
    public Long luong;
    public String kieunhanvien;
    Scanner sc = new Scanner(System.in);
    public void nhanvien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten");
        Ten = sc.nextLine();
        System.out.print("kieu Nhan vien ");
        kieunhanvien = sc.nextLine();
    }
    public void nhanvien( String Ten){
        this.Ten= Ten;
    }
    public String kieunhanvien(){
        return "";
    } 
    public void InTT(){
        System.out.print("Ten"+Ten);
        System.out.print("Kieu nhan vien "+ kieunhanvien);
    }
}
