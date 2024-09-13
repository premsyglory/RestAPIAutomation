package Week3Chaining;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class updateIncident extends BaseClass {
    
	@Test(dependsOnMethods="Week3Chaining.createIncident.shouldUserBeAbleToCreate()")
	public  void shouldUserBeAbleToUpdate() {
    	        given()				
    			.header("Content-Type", "application/json")
    			.pathParam("table_name", "incident")
    			.pathParam("sys_id", sys_Id)
    			.log().all()
    			.when()
    			.body(new File("src/main/resources/Payloads/UpdateIncident.json"))
    			.put("/{sys_id}")
    			.then()		
    			.assertThat()
    			.statusCode(200);

				
	
		
	}

}
