package com.msid.gestionnotesetudiant.web;


import com.msid.gestionnotesetudiant.entities.Etudiant;
import com.msid.gestionnotesetudiant.entities.Matiere;
import com.msid.gestionnotesetudiant.repository.EtudiantRepository;
import com.msid.gestionnotesetudiant.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/etudiant")
public class EtudiantRestController {
    @Autowired
    private EtudiantRepository etudiantRepository;



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







}
