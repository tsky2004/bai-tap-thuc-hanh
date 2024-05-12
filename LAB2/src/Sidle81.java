import java.util.Scanner;

public class Sidle81 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sohang, socot, Max;
        System.out.print("Nhap so hang ");
        sohang = sc.nextInt();
        System.out.print("Nhap so cot");
        socot = sc.nextInt();
        int A[][] = new int[sohang][socot];
        for (int i=0; i<sohang; i++){
            for ( int j=0; j<socot; j++){
                System.out.print("Nhap phan tu a["+(i+1)+"]["+(j+1)+"]");
                A[i][j] = sc.nextInt();

            }
          }
         Max = A[0][0];
         for (int i=0; i<sohang; i++){
            for ( int j=0; j<socot; j++){ 
                if (A[i][j]> Max){
                    Max = A[i][j];
                }
            }
        
         }
         System.out.print("Vay max cua mang 2 chieu la : "+ Max);
        }
    }
 