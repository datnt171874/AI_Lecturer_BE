package com.example.AI.Lecturer.repository;



import com.example.AI.Lecturer.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
}
