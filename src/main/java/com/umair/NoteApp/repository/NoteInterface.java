package com.umair.NoteApp.repository;

import model.NoteModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteInterface extends MongoRepository<NoteModel ,String>{
}
