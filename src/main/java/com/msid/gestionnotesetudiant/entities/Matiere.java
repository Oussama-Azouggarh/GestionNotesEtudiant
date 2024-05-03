package com.msid.gestionnotesetudiant.entities;
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Matiere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_matiere;
    private String Nom;

    private double devoir1;

    private double devoir2;


    private double devoir3;
    private int Coeff;


    private double noteMatiere=0.0;

    @ManyToOne
    @JoinColumn(name = "id_Etudiant")
    private Etudiant etudiant;


    public void calculerMoyenneMatiere() {

         double sommeDevoirs = this.devoir1 + this.devoir2 + this.devoir3;
          noteMatiere=sommeDevoirs / 3 ;
    }


}
