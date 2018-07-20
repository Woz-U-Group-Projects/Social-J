package com.socialj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialj.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
	List<Comment> findByTopicId(Integer topicId);
}
