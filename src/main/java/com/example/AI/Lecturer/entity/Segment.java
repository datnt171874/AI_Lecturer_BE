package com.example.AI.Lecturer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "segments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Segment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "lesson_id", nullable = false)
    private Lesson lesson;

    @Column(name = "order")
    private Integer order;

    @Column(columnDefinition = "TEXT")
    private String text;

    @Column(name = "start_time")
    private float startTime;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
