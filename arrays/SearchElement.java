package arrays;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 10, 15, 20, 25};
        int key = 23; // Fixed value to search
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(key + " found in the array.");
        } else {
            System.out.println(key + " not found in the array.");
        }

	}

}
