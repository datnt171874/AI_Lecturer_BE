package com.example.AI.Lecturer.repository;


import com.example.AI.Lecturer.entity.Audio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudioRepository extends JpaRepository<Audio, Integer> {
}
