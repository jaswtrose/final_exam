public class Main {
	
	public static void main(String[] args) {
		Customer customer;
		RegularCustomer regularCustomer = new RegularCustomer("Naruto Uzumaki", 1010);
		SeniorCustomer seniorCustomer = new SeniorCustomer("Ken Kaneki", 1220);

		customer = regularCustomer;
		System.out.println(customer.getName()+", a senior customer has a total bill of " +customer.calculateBill());

		customer = seniorCustomer;
		System.out.println(customer.getName()+" also is a senior customer with a total bill of "+customer.calculateBill());
	}

}
