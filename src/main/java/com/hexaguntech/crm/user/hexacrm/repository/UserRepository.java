package com.hexaguntech.crm.user.hexacrm.repository;

import com.hexaguntech.crm.user.hexacrm.collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
