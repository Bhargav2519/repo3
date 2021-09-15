
public class CustomerDao {
public void saveCustomer(Customer customer) {
	
		
		System.out.println("Customer ID  : "+customer.getid());
		
		System.out.println("Second Name  : "+customer.getSecondName());
		
		System.out.println("Email Id     : "+customer.getEmail());
		
		System.out.println("Phone Number : "+customer.getPhoneNumber());
		
		System.out.println("Successfully saved");
	
	}
public void inValidData() {
	System.out.println();
	System.out.println("If you entered valid details,Please contact 'ADMIN' ");
}
}
