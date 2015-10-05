package com.builds.uimaps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginClass {
	@FindBy(name="user_id")
	public WebElement user_id_txt;
	
	@FindBy(name="password")
	public WebElement password_txt;
	
	@FindBy(linkText="Login")
	public WebElement login_a;
	
	@FindBy(linkText="Forgot Password")
	public WebElement forgotPassword_a;
	
	@FindBy(linkText="Login")
	public WebElement support_a;
	
	@FindBy(linkText="Login")
	public WebElement bookmarkThisSite_a;
		
}
