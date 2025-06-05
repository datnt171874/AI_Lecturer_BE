package com.example.AI.Lecturer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "input_files")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InputFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "lesson_id", nullable = false )
    private Lesson lesson;

    private String file_url;

    private String file_format;

    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
