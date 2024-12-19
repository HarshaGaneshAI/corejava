package basics;

public class javaMethods {

    static int totalFees = 25000;

    public static int paidFees(int fees){
        totalFees = totalFees - fees;
        System.out.println("You have paid your fee successfully");
        return totalFees;

    }
    public static int remainingFee(int fees){
        return totalFees;
    }


    public static void main (String[] args){
        javaMethods feeUpdate = new javaMethods();

        paidFees(20000);
        System.out.println("Paid fees is : "+ feeUpdate);
        System.out.println("Remaing fee is : "+javaMethods.remainingFee(5000));


    }


}

//Need to practice more