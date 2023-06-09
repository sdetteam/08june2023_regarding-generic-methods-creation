
		package Selenium;

		import java.util.Scanner;

		public class Testclass {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the driver name");
				String s = sc.next();
				Browser browser = new Browser();
				browser.init(s);
				browser.navigateto("https://magento.softwaretestingboard.com/customer/account/create/");
				browser.close();
				

			}
            
		
	}


