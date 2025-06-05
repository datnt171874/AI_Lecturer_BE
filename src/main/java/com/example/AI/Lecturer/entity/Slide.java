package com.example.AI.Lecturer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "slides")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Slide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "segment_id", nullable = false)
    private Segment segment;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "display_time")
    private Float displayTime;

    @Column(name = "order_index")
    private Integer orderIndex;

    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
