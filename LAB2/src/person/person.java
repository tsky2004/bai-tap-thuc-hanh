package person;

import java.util.Scanner;

public class person {
    public String Hoten;
    public int nammat;
    public int Tuoitho;
    public String chungtoc;
    public void Nhapthongtin(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap thong tin");
        Hoten = sc.nextLine();
        System.out.print("nhap nam mat ");
        nammat = sc.nextInt();
        System.out.print("Nhap chung toc ");
        chungtoc = sc.next();
    }
    
    public void Inthongtin(){
        System.out.print("Hoten:"+Hoten);
        System.out.print("Tuoitho :"+nammat);
        System.out.print("Chungtoc"+chungtoc);
    }
    public void person(){
        Hoten = "Yeu quai ";
        nammat = 2024;
        chungtoc = "Người cá ";
    }
    public void person( int yeuquai){
        System.out.println("Hoten "+ Hoten);
        System.out.println("Nammat"+nammat);
        System.out.println("chungtoc"+chungtoc);
    }
}
