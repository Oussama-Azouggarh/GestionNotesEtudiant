package com.msid.gestionnotesetudiant.repository;

import com.msid.gestionnotesetudiant.entities.Etudiant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {


    Optional<Etudiant> findById(long id);


    Optional<Etudiant> findByNiveau(String niveau);
    Optional<Etudiant> findByFirstName(String firstName);
    Optional<Etudiant> findByLastName(String lastName);




}
