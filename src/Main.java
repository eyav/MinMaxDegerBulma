import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int k;
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++) {
            System.out.println(i+". Sayıyı giriniz :");
            k = input.nextInt();
            if(min > k) min = k;
            else if(max < k) max = k;
        }

        System.out.println("En büyük sayı :"+max+"\nEn küçük sayı :"+min);



    }
}
