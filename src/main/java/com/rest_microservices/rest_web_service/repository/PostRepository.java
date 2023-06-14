package com.rest_microservices.rest_web_service.repository;

import com.rest_microservices.rest_web_service.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
