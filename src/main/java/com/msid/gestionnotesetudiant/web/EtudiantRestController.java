package com.msid.gestionnotesetudiant.web;


import com.msid.gestionnotesetudiant.entities.Etudiant;
import com.msid.gestionnotesetudiant.entities.Matiere;
import com.msid.gestionnotesetudiant.repository.EtudiantRepository;
import com.msid.gestionnotesetudiant.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
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

    @PutMapping(value="/listEtudiants/{id}")
    public Etudiant update(@PathVariable(name="id") Long id,@RequestBody Etudiant p){
        p.setId(id);
        return etudiantRepository.save(p);

    }

    @PostMapping(value="/listEtudiants")
    public Etudiant save(@RequestBody Etudiant p) {
        return etudiantRepository.save(p);
    }

    @DeleteMapping(value="/listEtudiants/{id}")
    public void deleteEtudiant(@PathVariable(name="id") Long id) {
        etudiantRepository.deleteById(id);
    }

    @PutMapping(value="/listMatiers/{id}")
    public Matiere update(@PathVariable(name="id") Long id,@RequestBody Matiere p){
        p.setId(id);
        return matiereRepository.save(p);

    }

    @PostMapping(value="/listMatiers")
    public Matiere save(@RequestBody Matiere p) {
        return matiereRepository.save(p);
    }

    @DeleteMapping(value="/listMatiers/{id}")
    public void deleteMatiere(@PathVariable(name="id") Long id) {
        matiereRepository.deleteById(id);
    }





}
