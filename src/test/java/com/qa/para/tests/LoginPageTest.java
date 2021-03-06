package com.qa.para.tests;
import org.testng.Assert;

import org.testng.annotations.Test;


import com.qa.para.base.BaseTest;

import com.qa.para.utils.Constants;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class LoginPageTest extends BaseTest{

	
	@Test(priority=2)
	@Description("verify login page title test")
	@Severity(SeverityLevel.NORMAL)
	public void verifyLoginpageTitleTest(){
		String title=loginpage.getLoginPageTitle();
		System.out.println("loginpage title is :  "+title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE,"login page title is not matched ");
		}
	@Test(priority=1)
	@Description("verify forgot password link test")
	@Severity(SeverityLevel.CRITICAL)
	public void verifyForgotPWDLinkTest(){
		Assert.assertTrue(loginpage.getForgotPWDLink(),"forget password link is not displayed");
		}
	@Test(priority=3)
	@Description("verify login test")
	@Severity(SeverityLevel.BLOCKER)
	public void loginTest(){
		loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		}
	








}
