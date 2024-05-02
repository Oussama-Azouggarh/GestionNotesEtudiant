package com.msid.gestionnotesetudiant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


import jakarta.persistence.*;

        import lombok.*;


        import java.io.Serializable;
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
