package com.msid.gestionnotesetudiant.dao;

import com.msid.gestionnotesetudiant.entities.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}