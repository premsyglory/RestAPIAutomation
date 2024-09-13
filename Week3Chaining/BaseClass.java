package Week3Chaining;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BaseClass {

	// Define  Sys_Id as global -   

	public static String sys_Id ;

	   	  // Define Base URI And Authentication  inside a method
    @BeforeTest
	public void setUp(){

			RestAssured.baseURI="https://dev252551.service-now.com";
			RestAssured.basePath = "/api/now/table/{table_name}";
				
			RestAssured.authentication= RestAssured.basic("admin", "iKVl2^g7^gAO");
	               }

}
