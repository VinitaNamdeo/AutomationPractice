package api.endpoints;

import api.payload.Pet;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetEndPoints {
	public static Response createPet(Pet payload) {
		Response response = RestAssured.given()
							.contentType(ContentType.JSON)
							.accept(ContentType.JSON)
							.body(payload)
							.when().post(BaseURLs.post_Url);
		return response;
	}
	public static Response readPet(String name) {
		Response response = RestAssured.given()
						    .pathParam("name", name)
							.when().get(BaseURLs.get_Url);
		return response;
	}
}
