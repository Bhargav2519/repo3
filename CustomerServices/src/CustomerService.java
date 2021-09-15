
public class CustomerService  {
public void createCustomer(Customer customer) {
	
			
		CustomerDao dao =new CustomerDao();
		if(customer.getid() > 0 && customer.getid() <=9999) {
			//String patt = "[a-z][A-Z]";
			if(customer.getSecondName() != null && customer.getSecondName() !="") {
				if((customer.getEmail()).contains("@")) {
					if(customer.getPhoneNumber() >5999999999l && customer.getPhoneNumber() <9999999999l) {
		dao.saveCustomer(customer);
					}else {
						System.out.println("Invalid Phone number,Enter valid phone number");
						
						dao.inValidData();
					}
				}else {
					System.out.println("Invalid email type,Enter valid E-MAIL");
					dao.inValidData();
				}
			}else {
				System.out.println("Invalid name type,Enter valid name");
				dao.inValidData();
			}
		}else {
			System.out.println("Invalid id length,enter between 1 to 4 digit length");
			dao.inValidData();
		}
}
}
