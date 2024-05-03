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
    @OneToOne
    private Note devoir1;
    @OneToOne
    private Note devoir2;
    @OneToOne
    private Note devoir3;
    private int Coeff;
    @OneToOne
    private Note noteMatiere=null;


    public void calculerMoyenneMatiere() {

         double sommeDevoirs = this.devoir1.getValeur() + this.devoir2.getValeur() + this.devoir3.getValeur();
         noteMatiere.setValeur((sommeDevoirs) / 3) ;
    }


}
