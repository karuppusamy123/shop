import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New {
	void show() {

		System.out.println("hello123");
	}

	void getGreetings(String user) {
		System.out.println(user + "Welcome");
	}

	static double netSalary(double basicSalary, float travelAllowance, float dearnessAllowance,
			float houseRentAllowance, float providentFund) {
		double netSalaryCalculation = basicSalary + (basicSalary * (travelAllowance / 100))
				+ (basicSalary * (dearnessAllowance / 100)) + (basicSalary * (houseRentAllowance / 100))
				- (basicSalary * (providentFund / 100));
		return netSalaryCalculation;
	}

	public static void main(String[] args) throws IOException  {

		System.out.println("Helloworld");
		long accountNumber = 101234567890123L;
		float houseRentAllowance = 5.0f;
		double travelAllowance = 5.3d;
		short a = 1;
		byte b = 12;
		boolean status = true;
		int white = 0xfff;
		short black = (short) ~white;
		double providentFund = houseRentAllowance;
		System.out.println(netSalary(10000d, 15, 10, 25, 10));
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String name = bf.readLine();
	}

}
