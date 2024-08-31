package com.notes.Notes.Repositories;

import com.notes.Notes.Entities.NoteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends MongoRepository<NoteEntity, String> {
}
