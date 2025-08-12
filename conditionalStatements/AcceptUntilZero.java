package conditionalStatements;
import java.util.Scanner; 
public class AcceptUntilZero {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
        } while (num != 0);
        System.out.println("Stopped accepting numbers.");
        sc.close();

	}

}
