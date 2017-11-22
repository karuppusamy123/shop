package sample;
//deep copy
import java.util.Arrays;

public class Sa1 {

	public static void main(String[] args) {
		int[] vals = {3,7,9};
		int[] data = new int[3];
		for (int i = 0; i < 3; i++)
			data[i] = vals[i];
		System.out.println(Arrays.toString(data));
		vals[0] = 13;
		System.out.println(Arrays.toString(data));

	}
}