package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
