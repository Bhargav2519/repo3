
public class CustomerController {
	public void createCustomer(Customer customer) {

		CustomerService service = new CustomerService();

		service.createCustomer(customer);

	}
}
