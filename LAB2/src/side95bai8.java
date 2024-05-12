import java.util.Scanner;
public class side95bai8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, tong=0;
        double Trungbinh;
        System.out.print("Nhap so luong so ");
        n = sc.nextInt();
        int A[]= new int [n];
        for (int i=0; i<n; i++){
          System.out.print("Nhap so thu"+(i+1)+"=");
          A[i] = sc.nextInt();
          tong += A[i];


        }
        Trungbinh = (double)tong/n;
        System.out.print("Vay so trung binh nhan duoc la "+ Trungbinh);

    }
}
