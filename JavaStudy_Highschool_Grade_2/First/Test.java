package First;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[] {51,23,74,21,12};
		
		for (int Main=1; Main < arr.length; Main++) {
			for (int back= Main; back > 0; back--) {
				if(arr[back-1] > arr[back]) {
					int temp = arr[back-1];
					arr[back-1] = arr[back];
					arr[back] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
