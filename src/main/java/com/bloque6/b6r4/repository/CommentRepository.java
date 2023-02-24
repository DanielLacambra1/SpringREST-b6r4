package com.bloque6.b6r4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bloque6.b6r4.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
