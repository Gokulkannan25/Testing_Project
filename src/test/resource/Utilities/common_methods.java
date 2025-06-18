package Utilities;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class common_methods {
	public static Browser b;
	public static Page p;
	protected static void Launch_chrome(String url) {
		b=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		p=b.newPage();
		p.navigate(url);
	}	
}
