package com.example.SpringBootProjectWithGson;

import java.util.Date;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringBootProjectWithGson.model.DebitCardStateChange;
import com.example.SpringBootProjectWithGson.model.DebitCardStateChangeRequest;
import com.google.gson.Gson;

@SpringBootApplication
public class SpringBootProjectWithGsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectWithGsonApplication.class, args);

		// Gson Serialization
		
		// Create Gson Class
		Gson gson = new Gson();
		
        //Serializing Object To Json String
		DebitCardStateChangeRequest request = new DebitCardStateChangeRequest();
		request.setStateChange(DebitCardStateChange.LOCK);
		request.setId(UUID.randomUUID());
		request.setToken("123456");
		request.setTimestamp(new Date());
		
		
		String json = gson.toJson(request);
		System.err.println("Serialized Json : \n "+json+"\n\n");
		
		//DeSerializing JSon From Java Object
		DebitCardStateChangeRequest deserializedRequest = gson.fromJson(json,DebitCardStateChangeRequest.class );
		
		System.err.println("Writing Deserialized Object ");
		System.err.println("State Change :: "+deserializedRequest.getStateChange());
		System.err.println("ID :: "+deserializedRequest.getId());
		System.err.println("Token :: "+deserializedRequest.getToken());
		System.err.println("TimeStamp :: "+ deserializedRequest.getTimestamp());
		

	}
}
