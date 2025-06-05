package com.example.AI.Lecturer.repository;


import com.example.AI.Lecturer.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}