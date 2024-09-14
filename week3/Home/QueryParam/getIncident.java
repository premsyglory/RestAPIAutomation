package week3.Home.QueryParam;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getIncident extends BaseClass {
    @Test
	public  void shouldUserBeAbleToGetThroughQueryParam() {
    	Map <String ,String> queryparam=new HashMap<String,String>();

    	queryparam.put("sysparm_fields","sys_id,short_description,category");
    	queryparam.put("sysparm_limit","3");
    	queryparam.put("sysparm_query", "category=hardware"); 
    	

    	         given()				
    			.pathParam("table_name", "incident")
    			.queryParams(queryparam)
    			.log().all()
    			.when()
    			.get()
    			.then()		
    			.assertThat()
    			.statusCode(200)
    			.log()
    			.all();

				
	
		
	}

}
