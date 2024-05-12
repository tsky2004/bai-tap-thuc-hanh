package Chuong4;

import java.util.Scanner;

public class Person {

    public String Hoten;
    public String ID;
    public void Nhapthongtin(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap thong tin");
        Hoten = sc.nextLine();
        ID = sc.nextLine();
    }
    
    public void Inthongtin(){
        System.out.print("Hoten:"+Hoten);
        System.out.print("Nhap ID :"+ ID);
        
    }
    public void Xuatthongtin(){
        

    }
}
