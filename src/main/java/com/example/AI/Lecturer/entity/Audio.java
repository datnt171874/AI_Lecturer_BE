package com.example.AI.Lecturer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "audios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Audio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "segment_id", nullable = false)
    private Segment segment;

    @Column(name = "audio_url")
    private String audioUrl;

    @Column(name = "language")
    private String language;

    private float duration;

    private float speed;

    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
