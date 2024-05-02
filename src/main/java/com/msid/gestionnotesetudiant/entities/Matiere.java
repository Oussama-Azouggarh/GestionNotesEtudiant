package com.msid.gestionnotesetudiant.entities;
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Matiere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_matiere;
    private String Nom;
    private double Devoir1;
    private double Devoir2;
    private double Devoir3;
    private int Coeff;
    private int hhhhhh;
}
