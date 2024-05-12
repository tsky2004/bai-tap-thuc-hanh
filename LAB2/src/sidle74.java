import java.util.Scanner;

public class sidle74 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang :");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        int tong = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
           if (mang[i] % 2 ==0){
            tong += mang[i];
           }

        }
        System.out.println("Tong cac so chan trong mang la:" + tong);
    }
    
}

