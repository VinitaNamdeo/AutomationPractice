package api.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.PetEndPoints;

import api.payload.Pet;

import io.restassured.response.Response;

public class PetTests {
	Faker faker;
	Pet petPayload;
	
	@BeforeClass
	public void setData() {
		faker=new Faker();
		petPayload=new Pet();		
		petPayload.setId(faker.idNumber().hashCode());
		petPayload.setName(faker.name().name());

	}

	@Test(priority=1)
	public void testPostPet() {
		Response response=PetEndPoints.createPet(petPayload);
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test(priority=2)
	public void testGetPet() {
		Response response=PetEndPoints.readPet(petPayload.getName());
		Assert.assertEquals(response.getStatusCode(), 200);
	}}
	
