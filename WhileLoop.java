package PracticeWallah;

import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int num = 1;

        while (num <= n) {
            System.out.println(num);
            //num = num +1 ;
            sum += num;
            num++ ;
        }
        System.out.println("The sum is: "+ sum);
    }
}
