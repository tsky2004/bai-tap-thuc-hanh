import java.util.Scanner;
public class side69bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, chu=0 , so=0 , chuhoa=0;
        String str;
        System.out.print("Nhap vao mot chuoi bat ki");
        str = sc.nextLine();
        for (int i=0; i<str.length(); i++){
            int ACIICODE = str.charAt(i);
            x = ACIICODE;
            if ( x>96 && x<123){
                chu  += 1;
            }
            else if (x>64 && x<91){
                chuhoa +=1;
            }
            else if (x>48 && x<58){
                so+=1;
            }
        }
    System.out.println("Dem so chu la :"+chu);
    System.out.println("Dem chu hoa la :"+chuhoa);
    System.out.println("Dem so  la :"+so);
    }
    
}
