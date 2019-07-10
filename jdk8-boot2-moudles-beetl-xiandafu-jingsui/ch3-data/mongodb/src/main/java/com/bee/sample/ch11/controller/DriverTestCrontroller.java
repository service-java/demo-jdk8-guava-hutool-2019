package com.bee.sample.ch11.controller;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.DbCallback;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bee.sample.ch11.entity.Baike;
import com.bee.sample.ch11.entity.Comment;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

@RestController
@RequestMapping("/driver")
public class DriverTestCrontroller {
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/baike/{name}")
    public Baike findUser(@PathVariable String name) {
        final String id = name;
        Baike baike = mongoTemplate.execute(new DbCallback<Baike>() {

            public Baike doInDB(MongoDatabase db) throws MongoException, DataAccessException {
                MongoCollection<Document> collection = db.getCollection("baike");
                MongoCursor<Document> cursor = collection.find(new Document("_id", id)).iterator();
                try {
                    while (cursor.hasNext()) {
                        System.out.println(cursor.next().toJson());
                    }
                } finally {
                    cursor.close();
                }
                return null;


//				Document doc = collection.find(new Document("_id", id)).first();
//				System.out.println(doc.toJson());
//				Baike baike = new Baike();
//
//				baike.setDesc(doc.getString("desc"));
//				Comment comment = new Comment();
//				Document docComment = doc.get("comment", Document.class);
//				comment.setBad(docComment.getInteger("bad"));
//				comment.setGood(docComment.getInteger("good"));
//				baike.setComment(comment);
//				return baike;
            }

        });

        return baike;

    }


}
