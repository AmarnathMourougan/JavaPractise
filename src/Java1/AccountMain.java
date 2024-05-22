package Java1;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		
		acc.setAccno(100);
		acc.setName("Amar");
		acc.setSalary(30.500);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getSalary());
		
	}

}
