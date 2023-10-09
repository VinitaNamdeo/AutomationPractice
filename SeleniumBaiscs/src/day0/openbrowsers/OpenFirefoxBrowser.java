package day0.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdirver.gecko.Firefox.driver", ".\\drivers\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();

	}

}

