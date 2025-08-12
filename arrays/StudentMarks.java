package arrays;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {85, 90, 78, 88, 92, 80};
        int total = 0;

        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
            total += marks[i];
        }

        double average = total / 6.0;

        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + average);

	}

}
