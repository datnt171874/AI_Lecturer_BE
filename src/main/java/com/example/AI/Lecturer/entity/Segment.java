package com.example.AI.Lecturer.entity;

import com.example.AI.Lecturer.entity.Lesson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "segments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Segment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "lesson_id", nullable = false)
    private Lesson lesson;

    @Column(name = "segment_order")
    private Integer segmentOrder;

    @Column(columnDefinition = "TEXT")
    private String text;

    private Float duration;

    @Column(name = "start_time")
    private Float startTime;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}