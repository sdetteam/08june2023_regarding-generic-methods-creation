



	
		
		package Selenium;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.ie.InternetExplorerDriver;

		public class Browser {
			WebDriver driver;

			
			
				 public void init(String browserType) {
					 if(browserType.equalsIgnoreCase("chrome")){
						 System.setProperty("Webdriver.chrome.driver","C:\\Users\\gandepudi.jayakumar\\Downloads\\chromrdriver_win32\\chromedriver.exe");
						 driver = new ChromeDriver();
					 }
					 else if(browserType.equalsIgnoreCase("firefox")) {
						 System.setProperty("","");
						 driver = new FirefoxDriver();
					 }
					 else if(browserType.equalsIgnoreCase("ie")) {
						 System.setProperty("","");
						 driver = new InternetExplorerDriver();
					 }
				 }
				 public void navigateto(String url){
					 driver.get(url);
				 }
				 public void close(){
					 driver.close();
				 }
	}

