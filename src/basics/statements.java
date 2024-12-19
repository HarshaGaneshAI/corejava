package basics;

import java.util.Scanner;

public class statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = scanner.nextInt();

        if (num %2==0){
            System.out.println("It's a even number");

        }
        else {
            System.out.println("It's an odd number");

        }
    }
}
 /*
 If
 Else
 Switch
  */