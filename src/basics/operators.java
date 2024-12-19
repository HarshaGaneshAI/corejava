package basics;

public class operators {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        /*
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);
        System.out.println(++i); //pre
        System.out.println(i++); //post
        System.out.println(i);
        System.out.println(--j);
        System.out.println(j--);
        System.out.println(j);
        System.out.println(i==j);
        System.out.println(i!=j);
        System.out.println(i>j);
        System.out.println(i<j);
        System.out.println(i>=j);
        System.out.println(i<=j);
        System.out.println(i < j && i==j); */
        i +=10;
        System.out.println(i);
        System.out.println();

    }


}
/*
operators : It performs various operations on variables and values
Arithmetic: (+ Additional, - subtraction,  * multiplication, / division, % modulus)
Unary: (++ increment , -- decrement ) when the value could be increased or decreased by one value.
Relational: comparing the two values and the output will be in boolean.
 == (equal to) , != (not equal) , >(greater than) , < (lessthan) , >= (greater than or equal), <= (less than or equal)
Conditional:
&&(AND)-- which performs both the actions  ->> true & true = true, true & false = false, false & true = false, false & false = false.
||(OR) -- which performs either this or that. ->> true | true = false , true | false = true, false | true = true, fasle & false = true.
Assignment:Assign values to variables  =,+=,-=,*=,/=,%=
Bitwise: which performs {(AND&,OR |, XOR ^, NOT~}=(follow truth table) <<(Left shift), >> (right shift).

 */