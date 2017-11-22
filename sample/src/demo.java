import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String name = bf.readLine();
		int age=Integer.valueOf(name);
		System.out.println(name + 3);
		System.out.println(age + 3);
	}

}
