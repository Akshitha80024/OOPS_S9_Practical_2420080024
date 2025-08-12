package operators;

public class LogicalAnd {

	public static void main(String[] args) {
		int theoryMarks = 85;
        int practicalMarks = 65;
        
        if (theoryMarks >= 40 && practicalMarks >= 40) {
            System.out.println("Student has passed both theory and practical exams.");
        } else {
            System.out.println("Student has not passed both the exams.");
        }
    }

	}


