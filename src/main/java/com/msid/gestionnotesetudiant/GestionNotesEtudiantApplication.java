package com.msid.gestionnotesetudiant;

import com.msid.gestionnotesetudiant.entities.Etudiant;
import com.msid.gestionnotesetudiant.entities.Matiere;
import com.msid.gestionnotesetudiant.entities.Note;
import com.msid.gestionnotesetudiant.repository.EtudiantRepository;
import com.msid.gestionnotesetudiant.repository.MatiereRepository;
import com.msid.gestionnotesetudiant.repository.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class GestionNotesEtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionNotesEtudiantApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository, NoteRepository noteRepository, MatiereRepository matiereRepository){

		return args -> {
			etudiantRepository.save(Etudiant.builder().firstName("ayoub").lastName("hada").email("ayoub@ayoub.com").niveau("tcs").classe("A")
					.build());
			etudiantRepository.save(Etudiant.builder().firstName("oussama").lastName("hada").email("oussama@oussama.com").niveau("tcs").classe("B")
					.build());

			etudiantRepository.findAll().forEach(et->{
					Matiere matiere=Matiere.builder().Nom("math").devoir1(15.0).devoir2(12).devoir3(20).Coeff(5).etudiant(et).build();
					matiere.calculerMoyenneMatiere();
				    matiereRepository.save(matiere);
				    Note note= Note.builder().Valeur(matiere.getNoteMatiere()).etudiant(et).matiere(matiere).build();
				    noteRepository.save(note);

					Matiere matiere1=Matiere.builder().Nom("eco").devoir1(10).devoir2(14).devoir3(20).Coeff(2).etudiant(et).build();
					matiere1.calculerMoyenneMatiere();
				    matiereRepository.save(matiere1);
				    Note note1= Note.builder().Valeur(matiere1.getNoteMatiere()).etudiant(et).matiere(matiere1).build();
					noteRepository.save(note1);









			});



		};
	}
}
