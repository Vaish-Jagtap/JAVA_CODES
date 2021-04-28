import java.util.Scanner;

public class Identity {

    public static void main(String[] args) {

		/* Student ID Card Generator */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Age: ");
        int age = scanner.nextInt();

        System.out.println("Enter Blood group: ");
        String bloodGroup = scanner.nextLine();

        scanner.close();

        String groupName;

        if (age >= 20) {
            groupName = "RED";
        } else if (age >= 15) {
            groupName = "BLUE";
        } else if (age >= 10) {
            groupName = "YELLOW";
        } else {
            groupName = "NO GROUP";
        }

        System.out.println("____________________________");
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Blood Group: " + bloodGroup);
        System.out.println("____________________________");
        System.out.println("   Your group is " + groupName);
        System.out.println("____________________________");
    }
}


/* 
Enter Name: 
Kiran Agarwal
Enter Age: 
20
Enter Blood group: 
____________________________
  Name: Kiran Agarwal
  Age: 20
  Blood Group: 
____________________________
   Your group is RED
____________________________ */
