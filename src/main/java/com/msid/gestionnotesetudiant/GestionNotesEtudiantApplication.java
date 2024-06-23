package com.msid.gestionnotesetudiant;

import com.msid.gestionnotesetudiant.entities.Admin;
import com.msid.gestionnotesetudiant.entities.Etudiant;
import com.msid.gestionnotesetudiant.entities.Matiere;
import com.msid.gestionnotesetudiant.entities.Note;
import com.msid.gestionnotesetudiant.repository.AdminRepository;
import com.msid.gestionnotesetudiant.repository.EtudiantRepository;
import com.msid.gestionnotesetudiant.repository.MatiereRepository;
import com.msid.gestionnotesetudiant.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.UUID;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.msid.gestionnotesetudiant.*")
public class GestionNotesEtudiantApplication {
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private MatiereRepository matiereRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(GestionNotesEtudiantApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository, NoteRepository noteRepository, MatiereRepository matiereRepository, AdminRepository adminRepository){

		restConfiguration.exposeIdsFor(Etudiant.class);
		restConfiguration.exposeIdsFor(Matiere.class);
		restConfiguration.exposeIdsFor(Note.class);


		return args -> {
			etudiantRepository.save(Etudiant.builder().firstName("ayoub").lastName("hamdoune")
					.email("ayoub@msid.com").niveau("tcs").username("ayoub").password("ayoub").classe("A")
					.build());
			etudiantRepository.save(Etudiant.builder().firstName("oussama").lastName("azouggarh")
					.email("oussama@msid.com").niveau("tcs").classe("B").username("oussama").password("oussama")
					.build());
			etudiantRepository.save(Etudiant.builder().firstName("driss").lastName("echouikhi")
					.email("driss@msid.com").niveau("tcs").classe("A").username("driss").password("driss")
					.build());
			adminRepository.save(Admin.builder().firstName("prof").lastName("anas").email("anas@msid.com")
					.username("anas").password("anas").build());
			adminRepository.save(Admin.builder().firstName("prof").lastName("ziti").email("ziti@msid.com")
					.username("ziti").password("ziti").build());

			etudiantRepository.findAll().forEach(et->{



				Matiere matiere2=Matiere.builder().Nom("Mathématiques").devoir1(10).devoir2(14).devoir3(20).Coeff(4).etudiant(et).build();
				matiere2.calculerMoyenneMatiere();
				matiereRepository.save(matiere2);
				Note note2= Note.builder().Valeur(matiere2.getNoteMatiere()).etudiant(et).matiere(matiere2).build();
				noteRepository.save(note2);

				Matiere matiere1=Matiere.builder().Nom("Physique et Chimie").devoir1(15).devoir2(14).devoir3(20).Coeff(4).etudiant(et).build();
				matiere1.calculerMoyenneMatiere();
				matiereRepository.save(matiere1);
				Note note1= Note.builder().Valeur(matiere1.getNoteMatiere()).etudiant(et).matiere(matiere1).build();
				noteRepository.save(note1);

                Matiere matiere0=Matiere.builder().Nom("Sciences de la Vie et de la Terre").devoir1(15).devoir2(14).devoir3(20).Coeff(4).etudiant(et).build();
                matiere0.calculerMoyenneMatiere();
                matiereRepository.save(matiere0);
                Note note0= Note.builder().Valeur(matiere0.getNoteMatiere()).etudiant(et).matiere(matiere0).build();
                noteRepository.save(note1);

				Matiere matiere3=Matiere.builder().Nom("Français").devoir1(16).devoir2(14).devoir3(20).Coeff(3).etudiant(et).build();
				matiere3.calculerMoyenneMatiere();
				matiereRepository.save(matiere3);
				Note note3= Note.builder().Valeur(matiere3.getNoteMatiere()).etudiant(et).matiere(matiere3).build();
				noteRepository.save(note3);

				Matiere matiere4=Matiere.builder().Nom("Anglais").devoir1(17).devoir2(14).devoir3(11).Coeff(3).etudiant(et).build();
				matiere4.calculerMoyenneMatiere();
				matiereRepository.save(matiere4);
				Note note4= Note.builder().Valeur(matiere4.getNoteMatiere()).etudiant(et).matiere(matiere4).build();
				noteRepository.save(note4);

				Matiere matiere5=Matiere.builder().Nom("Informatique").devoir1(12).devoir2(14).devoir3(20).Coeff(2).etudiant(et).build();
				matiere5.calculerMoyenneMatiere();
				matiereRepository.save(matiere5);
				Note note5= Note.builder().Valeur(matiere5.getNoteMatiere()).etudiant(et).matiere(matiere5).build();
				noteRepository.save(note5);

				Matiere matiere6=Matiere.builder().Nom("Arabe").devoir1(13).devoir2(14).devoir3(14).Coeff(2).etudiant(et).build();
				matiere6.calculerMoyenneMatiere();
				matiereRepository.save(matiere6);
				Note note6= Note.builder().Valeur(matiere6.getNoteMatiere()).etudiant(et).matiere(matiere6).build();
				noteRepository.save(note6);

				Matiere matiere7=Matiere.builder().Nom("Éducation Islamique").devoir1(9.9).devoir2(14).devoir3(20).Coeff(2).etudiant(et).build();
				matiere7.calculerMoyenneMatiere();
				matiereRepository.save(matiere7);
				Note note7= Note.builder().Valeur(matiere7.getNoteMatiere()).etudiant(et).matiere(matiere7).build();
				noteRepository.save(note7);

				Matiere matiere8=Matiere.builder().Nom("Histoire et Géographie").devoir1(19).devoir2(14).devoir3(10).Coeff(2).etudiant(et).build();
				matiere8.calculerMoyenneMatiere();
				matiereRepository.save(matiere8);
				Note note8= Note.builder().Valeur(matiere8.getNoteMatiere()).etudiant(et).matiere(matiere8).build();
				noteRepository.save(note8);

				Matiere matiere9=Matiere.builder().Nom("Philosophie").devoir1(15).devoir2(14).devoir3(20).Coeff(2).etudiant(et).build();
				matiere9.calculerMoyenneMatiere();
				matiereRepository.save(matiere9);
				Note note9= Note.builder().Valeur(matiere9.getNoteMatiere()).etudiant(et).matiere(matiere9).build();
				noteRepository.save(note9);

				Matiere matiere=Matiere.builder().Nom("Éducation physique et sportive").devoir1(15.0).devoir2(12).devoir3(17).Coeff(2).etudiant(et).build();
				matiere.calculerMoyenneMatiere();
				matiereRepository.save(matiere);
				Note note= Note.builder().Valeur(matiere.getNoteMatiere()).etudiant(et).matiere(matiere).build();
				noteRepository.save(note);

				Matiere matiere10=Matiere.builder().Nom("Sciences de l'ingénieur").devoir1(15.0).devoir2(12).devoir3(17).Coeff(2).etudiant(et).build();
				matiere10.calculerMoyenneMatiere();
				matiereRepository.save(matiere10);
				Note note10= Note.builder().Valeur(matiere10.getNoteMatiere()).etudiant(et).matiere(matiere10).build();
				noteRepository.save(note);













			});



		};
	}
}
