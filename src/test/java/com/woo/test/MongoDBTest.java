package com.woo.test;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest
{
	public static void main(String[] args)
	{

		MongoClient mongo = new MongoClient("localhost", 27017);

		MongoDatabase db = mongo.getDatabase("Spider");

		MongoCollection<Document> collection = db.getCollection("books");
		System.out.println(collection.count());

		// FindIterable<Document> result=collection.find();
		FindIterable<Document> result = collection.find(new Document("price", "£34.65"));

		result.forEach(new Block<Document>()
		{
			public void apply(final Document t)
			{
				System.out.println(t);
			}
		});

		mongo.close();
	}
}
