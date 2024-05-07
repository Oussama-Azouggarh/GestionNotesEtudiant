package com.msid.gestionnotesetudiant.repository;

import com.msid.gestionnotesetudiant.entities.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findById_Etudiant(Long id_Etudiant);
    List<Etudiant> findEtudiantByNiveau(String niveau);
    List<Etudiant> findEtudiantByFirstName(String firstName);
    List<Etudiant> findEtudiantByLastName(String lastName);

}
