import java.util.Scanner;


   public class HinhTron{
    public float r;
    public float chuvi;
    public float dientich;
    final public float PI = 3.14f ;
    public void nhapbankinh(){
        System.out.print("Nhap ban kinh R = ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi= 2*PI*r;
    }
    public void tinhdientich(){
        dientich= PI*r*r;
    }
    public void inchuvi(){
        System.out.print("Chu vi la : "+ dientich);
    }
    public void indientich(){
        System.out.print("Dien tich la : " + dientich);
    }
   
}
