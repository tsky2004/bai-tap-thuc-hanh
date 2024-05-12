package NhanVien;

import java.util.Scanner;

public class nhanvienfulltime extends nhanvien {
    public int ngaylamthem;
    public int chucvu;
    Scanner sc = new Scanner(System.in);
    public void nhanvienfulltime(){
       Scanner sc = new Scanner(System.in);
       System.out.print("So ngay lam");
       ngaylamthem= sc.nextInt();
       System.out.print("Nhap chuc vu ");
       chucvu= sc.nextInt();
    }
    public void nhanvienfulltime(String Ten, int ngaylamthem){
        this.Ten =Ten;
        this.ngaylamthem=ngaylamthem;
    }
    public void Setloaichucvu(){
         this.chucvu=chucvu;
    }
    public String Loainhanvien(){
        return "Nhan vien Fulltime";
    }
    public void tinhluong(){
        if(chucvu ==1){
            luong = configs.NHAN_VIEN_SEP +configs.LUONG_LAM_THEM_MOI_NGAY*ngaylamthem;
        }
        else{
            luong = configs.LUONG_NHAN_VIEN_FULL_TIME_LINH+configs.LUONG_LAM_THEM_MOI_NGAY*ngaylamthem;
        }
    }


}
