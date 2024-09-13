package Week3Chaining;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class createIncident extends BaseClass {
    @Test
	public  void shouldUserBeAbleToCreate() {
    	 sys_Id = given()				
    			.header("Content-Type", "application/json")
    			.pathParam("table_name", "incident")
    			.log().all()
    			.when()
    			.body(new File("src/main/resources/Payloads/UpdateIncident.json"))
    			.post()
    			.then()		
    			.assertThat()
    			.statusCode(201)
    			.extract()
    			.jsonPath()
    			.getString("result.sys_id");

				
	
		
	}

}
