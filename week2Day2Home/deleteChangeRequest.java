package week2Day2Home;

import io.restassured.RestAssured;

public class deleteChangeRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "admin";
		String password = "iKVl2^g7^gAO";
		String url = "https://dev252551.service-now.com/api/now/table/change_request/6f42652083ac1210f76d7a65eeaad333";
		
		RestAssured.given()
		.auth().basic(username, password)
		.when()
		.delete(url)
		.then()
		.assertThat()
		.statusCode(204)
		.log()
		.all();

	}

}
