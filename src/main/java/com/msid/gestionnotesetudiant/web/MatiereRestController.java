package com.msid.gestionnotesetudiant.web;


import com.msid.gestionnotesetudiant.entities.Etudiant;
import com.msid.gestionnotesetudiant.entities.Matiere;
import com.msid.gestionnotesetudiant.repository.EtudiantRepository;
import com.msid.gestionnotesetudiant.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatiereRestController {

    private EtudiantRepository etudiantRepository;
    private MatiereRepository matiereRepository;

    public MatiereRestController(EtudiantRepository etudiantRepository, MatiereRepository matiereRepository) {

        this.etudiantRepository = etudiantRepository;
        this.matiereRepository = matiereRepository;

    }

    @GetMapping(path = "/matieres")
    public List<Matiere> allMatieres() {
        return matiereRepository.findAll();
    }

    @GetMapping(path = "/matieres/{id}")
    public Matiere getMatiereById(@PathVariable Long id_matiere) {
        return matiereRepository.findById(id_matiere).get();
    }

    @GetMapping(path = "/etudiants")
    public List<Etudiant> allEtudiants() {
        return etudiantRepository.findAll();
    }




}
