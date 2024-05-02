package com.msid.gestionnotesetudiant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Etudiant implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Etudiant;
    private String firstName;
    private String lastName;
    @Column(unique=true)
    private String email;
    private String niveau;
    private String classe;



}
