import java.util.*;

public class TaxCalculator {

    static void calculateTax(String name,long income) {

        long tax=0;
        if(income>=300000)                                 // 20% tax on total annual income
            tax=(income*20)/100L;
        else if(income >=100000 && income < 300000)        // 10% tax on total annual income
            tax=(income*10)/100L;
        else if(income < 100000)                           // No tax on total annual income
            tax=0;
        System.out.println(name+" : ₹ "+tax);

    }

    public static void main(String[] args) {

        int count;

        System.out.println("Tax Calculator App");
        System.out.println("----- WELCOME -----\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total person count");
        count =sc.nextInt();

        String[] names = new String[count];
        long[] incomes = new long[count];

        System.out.println();

        for(int i=0;i<count;i++) {
            System.out.println("Enter name "+" :");
            names[i]=sc.next();

            System.out.println("Enter "+names[i]+"'s Annual Income:");
            incomes[i]=sc.nextLong();

            System.out.println();
        }

        System.out.println("Names with liable taxes");
        System.out.println("-------------------------");

        for(int i=0;i<count;i++)
            calculateTax(names[i],incomes[i]);


    }

}

/* Output:
Tax Calculator App
----- WELCOME -----

Enter total person count
3

Enter name  :
Neha
Enter Neha's Annual Income:
320000

Enter name  :
Vaibhav
Enter Vaibhav's Annual Income:
90000

Enter name  :
Kiran
Enter Kiran's Annual Income:
100000

Names with liable taxes
-------------------------
Neha : ₹ 64000
Vaibhav : ₹ 0
Kiran : ₹ 10000 
*/
