package Week3Chaining;



import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class deleteIncident extends BaseClass {
    
	@Test(dependsOnMethods="Week3Chaining.updateIncident.shouldUserBeAbleToUpdate()")
	public  void shouldUserBeAbleToDelete() {
    	        given()				
    			.header("Content-Type", "application/json")
    			.pathParam("table_name", "incident")
    			.pathParam("sys_id", sys_Id)
    			.log().all()
    			.when()
    			.delete("/{sys_id}")
    			.then()		
    			.assertThat()
    			.statusCode(204);

				
	
		
	}

}
