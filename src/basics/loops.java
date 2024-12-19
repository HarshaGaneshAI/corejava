package basics;

//when you know the loop number we can opt for (for loop) if we don't know the number we can opt for (while loop)
public class loops {
    public static void main(String[] args) {
/**
 * For Loop :
 * Syntax
 *  for (initilization;condition; increment/decrement)
 *  body
 * Example 1
        for (int num = 99 ; num <= 995; num+= 1){
            System.out.print(num);
        }
 *Example 2
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num=0; num <=n; ++num){
            System.out.print(num +" ");
        }

**/

/**
 * While Loop:

        int num =1;
        while (num <=10) {
            System.out.println(num);
            num ++;
}
 */

/** Do while loop:
 *
 */
        int n=1;
        do{
            System.out.println("hello");
        } while (n != 1);

    }
}
