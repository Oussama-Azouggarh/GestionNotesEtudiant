package com.msid.gestionnotesetudiant.dao;

import com.msid.gestionnotesetudiant.entities.Matier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatierRepository extends JpaRepository<Matier,Long> {
}
