package com.example.AI.Lecturer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "voices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Voice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "audio_id", nullable = false)
    private Audio audio;

}
