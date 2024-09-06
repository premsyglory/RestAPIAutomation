package week2Day2Home;

import io.restassured.RestAssured;

public class updateChangeRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "admin";
		String password = "iKVl2^g7^gAO";
		String url = "https://dev252551.service-now.com/api/now/table/change_request/6f42652083ac1210f76d7a65eeaad333";
		String requestPayload = "{\r\n"
				+ "    \"short_description\": \"Connectivity issues\",\r\n"
				+ "    \"category\": \"Hardware\",\r\n"
				+ "    \"priority\": \"4\",\r\n"
				+ "    \"description\": \"While updating connectivity issues happen\"\r\n"
				+ "}";
		RestAssured.given()
		.auth()
		.basic(username, password)
		.header("Content-Type", "application/json")
		.when()
		.body(requestPayload)
		.put(url)
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();

	}

}
