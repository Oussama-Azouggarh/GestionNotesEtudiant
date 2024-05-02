package com.msid.gestionnotesetudiant.entities;
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Matier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mat;
    private String Nom;
    private double Devoir1;
    private double Devoir2;
    private double Devoir3;
    private int Coeff;
}
