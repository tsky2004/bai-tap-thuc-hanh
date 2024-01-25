import java.util.Scanner;
public class GiaiPTbac2 
{
    private static String X1;
    private static String X2;

    public static void main(double a,double b, double c)
    {
        System.out.println("Nhap gia tri a b c ");        
        Scanner scan = new Scanner(System.in);
         a = scan.nextDouble();
         b = scan.nextDouble();
         c = scan.nextDouble();
        if (a==0)
        {
            System.out.print("Phuong trinh co nghiem la" + (-c/b));
        }else {
            double delta = b*b - 4 * a * c;
        
        if ( delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }else if( delta ==0){
            double x = -b/2*a;
            System.out.println("Phuong trinh co nghiem kep la:" + x);
        }
            else {
                double X1,X2;
                 X1 =  (b - Math.sqrt(delta)/(2*a));
                 X2 =  (b + Math.sqrt(delta)/(2*a));
            }
            System.out.print("Ket qua X1 : " +X1);
        
            System.out.print("Ket qua x2" + X2);


        }



    }
    
    
}
