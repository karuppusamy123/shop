import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Median {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int m, n, i, j;
		System.out.println("arr size");
		n = Integer.valueOf(b.readLine());
		System.out.println("arr1 size");
		m = Integer.valueOf(b.readLine());
		System.out.println("arr");
		float[] arr = new float[n];
		float arr1[] = new float[m + n];
		for (i = 0; i < n; i++) {
			arr[i] = Integer.valueOf(b.readLine());
		}
		System.out.println("arr1");
		for (i = 0; i < m; i++) {
			arr1[i] = Integer.valueOf(b.readLine());
		}
		/*System.out.println("merge");*/
		System.arraycopy(arr, 0, arr1, m, n);
		/*for (i = 0; i < m + n; i++) {
			System.out.println(arr1[i]);
		}*/
		Arrays.sort(arr1);
		System.out.println("sorted");
		for (i = 0; i < m + n; i++) {
			System.out.println(arr1[i]);
		}
		j=m+n;
		if (j % 2 == 0)
			System.out.println("median" +" "+(( arr1[(j / 2)] + arr1[(j / 2)-1])/2));
		else
			System.out.println("median"+"" + arr1[j / 2]);

	}

}
