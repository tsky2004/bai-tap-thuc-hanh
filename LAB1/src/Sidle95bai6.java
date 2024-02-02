import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class Sidle95bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so");
        int n= scanner.nextInt();
        scanner.close();
        int gt=1;
        for (int i=n; i>0; i--){
            gt*=i;
        }
        System.out.print(gt);
    }
    
}
