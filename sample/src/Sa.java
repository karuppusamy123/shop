import java.util.Arrays;
//shallow copy
public class Sa {

	public static void main(String[] args) {
		int[] vals = { 3, 7, 9 };
		int[] data = new int[3];
		data = vals;
		System.out.println(Arrays.toString(data));
		vals[0] = 13;
		System.out.println(Arrays.toString(data));

	}
}