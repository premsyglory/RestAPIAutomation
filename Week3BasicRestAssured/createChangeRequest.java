package Week3BasicRestAssured;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class createChangeRequest extends BaseClass{
	@Test
	
	public  void userCanCreateAChangeRequest() {
		
		
		String requestPayload = "{\r\n"
				+ "    \"short_description\": \"Connectivity issues\",\r\n"
				+ "    \"category\": \"Network\",\r\n"
				+ "    \"priority\": \"4\",\r\n"
				+ "    \"description\": \"While chaining connectivity issues happen\"\r\n"
				+ "}";
		RestAssured.given()
		.header("Content-Type", "application/json")
		.pathParam("table_name", "change_request")
		.log()
		.all()
		.when()
		.body(requestPayload)
		.post()
		.then()
		.assertThat()
		.statusCode(201)
		.log()
		.all();

				
	
		
	}


}
