package week2Day2Home;
import io.restassured.RestAssured;

public class createChangeRequest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "iKVl2^g7^gAO";
		String url = "https://dev252551.service-now.com/api/now/table/change_request";
		String requestPayload = "{\r\n"
				+ "    \"short_description\": \"Connectivity issues\",\r\n"
				+ "    \"category\": \"Network\",\r\n"
				+ "    \"priority\": \"4\",\r\n"
				+ "    \"description\": \"While chaining connectivity issues happen\"\r\n"
				+ "}";
		RestAssured.given()
		.auth()
		.basic(username, password)
		.header("Content-Type", "application/json")
		.when()
		.body(requestPayload)
		.post(url)
		.then()
		.assertThat()
		.statusCode(201)
		.log()
		.all();

				
	
		
	}


}
