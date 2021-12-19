package org.sss;

public class CitiBank extends IciciBank{//child class

	@Override
	void savings() {	
		System.out.println("Citibank savings is:11%");
	}

	@Override
	void deposit() {
		System.out.println("Citibank deposit is:6%");
	}
	private void currentAccount() {
		System.out.println("Citibank current account:5%");
	}
	public static void main(String[] args) {
		CitiBank c=new CitiBank();
		c.currentAccount();
		c.deposit();
		c.savings();
		c.fixed();
		
		
	}
	

}
