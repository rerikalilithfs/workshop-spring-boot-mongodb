package com.rerikalfs.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rerikalfs.workshopmongo.domain.Post;
import com.rerikalfs.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}
