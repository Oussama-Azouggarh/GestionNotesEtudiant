package com.msid.gestionnotesetudiant.repository;



import com.msid.gestionnotesetudiant.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {
}
