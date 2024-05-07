package com.msid.gestionnotesetudiant.repository;

import com.msid.gestionnotesetudiant.entities.Etudiant;
import com.msid.gestionnotesetudiant.entities.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatiereRepository extends JpaRepository<Matiere,Long> {

    List<Matiere> findMatiereByID(Long id_matiere);
    List<Matiere> findMatiereByNom(String Nom);
    List<Matiere> findMatiereByEtudiant(Etudiant etudiant);
}
