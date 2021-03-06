package com.qa.para.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.para.base.BaseTest;
import com.qa.para.pages.HomePage;
import com.qa.para.utils.Constants;

public class HomePageTest extends BaseTest {
	
	HomePage homepage;
	
	@BeforeClass
	public void homeSetUp() {
	homepage=loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	};
	
	
	@Test(priority=2)
	public void verifyHomepageTitleTest(){
		String hometitle=homepage.getHomePageTitle();
		System.out.println("loginpage title is :  "+hometitle);
		Assert.assertEquals(hometitle, Constants.HOME_PAGE_TITLE,"home page title is not matched ");
		}
	@Test(priority=1, enabled=false)
	public void verifyAccountNumber(){
		String accountnumber=homepage.getAccountNumber();
		System.out.println("my account number is :  "+accountnumber);
		Assert.assertEquals(accountnumber, prop.getProperty(accountnumber));
		}
	@Test(priority=3)
	public void verifyrequestloanlink(){
		Assert.assertTrue(homepage.getRequestLoanLink());
		}
	
  
	
	
	
	

}
