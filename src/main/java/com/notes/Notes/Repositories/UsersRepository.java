package com.notes.Notes.Repositories;

import com.notes.Notes.Entities.UsersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<UsersEntity, String> {
    UsersEntity findByUsername(String username);
}
