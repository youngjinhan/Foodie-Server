package com.foodie.foodie.domain.post.domain.repository;

import com.foodie.foodie.domain.post.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
