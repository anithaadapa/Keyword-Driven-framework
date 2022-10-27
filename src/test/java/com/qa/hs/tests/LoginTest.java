package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.keyword.engine.KeyWordEngine;

public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
	@Test
	public void LaunchApp(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("LaunchApp");
	}
	
	
	@Test
	
	public void LoginTestCase()
	{
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
		
		
	}
	

	
	
	

}
