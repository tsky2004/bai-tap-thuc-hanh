import java.util.Scanner;
    public class test {       
 public static void main(String[]arg){
    HinhTron h1= new HinhTron();
    HinhTron h2 = new HinhTron();
    System.out.print("Nhap thong tin cua hinh tron 1");
    h1.nhapbankinh();
    h1.tinhchuvi();
    h1.tinhdientich();
    h1.inchuvi();
    h1.indientich();
    System.out.print("Nhap thong tin cua hinh tron 2 ");
    h2.nhapbankinh();
    h2.tinhchuvi();
    h2.tinhdientich();
    h2.inchuvi();
    h2.indientich();
 }
}
