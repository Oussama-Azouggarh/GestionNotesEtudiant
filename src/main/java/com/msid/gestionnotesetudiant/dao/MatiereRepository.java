package com.msid.gestionnotesetudiant.dao;

import com.msid.gestionnotesetudiant.entities.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereRepository extends JpaRepository<Matiere,Long> {
}
