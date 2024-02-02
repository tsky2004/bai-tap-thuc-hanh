import java.util.Scanner;
public class side69bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dem=0;
        char Kytu;
        String str;
        do {
            System.out.print("Nhap duoi 80  ky tu ");
            str = sc.nextLine();
        } while (str.length() >80);
      System.out.print("Nhap ky tu muon dem so luong ");
      Kytu = sc.nextLine().charAt(0);
      for (int i=0; i<str.length();i++){
        if (str.charAt(i)==Kytu);
        dem+=1;
      }
      System.out.print("So lan suat hien ky tu la "+dem);
    }
    
}
