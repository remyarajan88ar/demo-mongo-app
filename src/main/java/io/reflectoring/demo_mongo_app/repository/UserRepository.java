package io.reflectoring.demo_mongo_app.repository;

import io.reflectoring.demo_mongo_app.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
