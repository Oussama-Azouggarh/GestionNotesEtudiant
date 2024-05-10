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
public class EtudiantRestController {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private MatiereRepository matiereRepository;


    @GetMapping(value="/listEtudiants")
    public List<Etudiant> listEtudiants(){

        return etudiantRepository.findAll();
    }

    @GetMapping(value="/listEtudiantId/{id}")
    public Etudiant listEtudiantId (@PathVariable(name="id") Long id) {
        return etudiantRepository.findById(id).get();
    }

    @GetMapping(value="/listEtudiantNiveau/{niveau}")
    public Etudiant listEtudiantNiveau (@PathVariable(name="niveau") String niveau) {
        return etudiantRepository.findByNiveau(niveau).get();
    }


    @GetMapping(value = "/listMatiers")
    public List<Matiere> listMatiers(){
        return matiereRepository.findAll();
    }








}
