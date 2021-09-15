import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customer c1 = new Customer();

		System.out.println("Enter your  Name");

		c1.secondName = sc.nextLine();

		System.out.println("Enter your Email");
		c1.email = sc.nextLine();

		System.out.println("Enter your Phone Number");
		c1.phoneNumber = sc.nextLong();

		System.out.println("Enter your ID");
		int id = sc.nextInt();
		c1.setId(id);

		CustomerController controller = new CustomerController();

		controller.createCustomer(c1);

	}
}
