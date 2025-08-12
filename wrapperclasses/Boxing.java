package wrapperclasses;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
        Integer boxed = Integer.valueOf(num); // manual boxing

        System.out.println("Primitive int: " + num);
        System.out.println("Boxed Integer: " + boxed);

	}

}
