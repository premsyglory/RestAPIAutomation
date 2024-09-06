package week2Day2Home;

import io.restassured.RestAssured;

public class getChangeRequest {
	public static void main(String[] args) {
	String username = "admin";
	String password = "iKVl2^g7^gAO";
	String url = "https://dev252551.service-now.com/api/now/table/change_request/6f42652083ac1210f76d7a65eeaad333";
	
	RestAssured.given()
	.auth().basic(username, password)
	.when()
	.get(url)
	.then()
	.assertThat()
	.statusCode(200)
	.log().all();
	

}
}
