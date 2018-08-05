package com.example.easynotes.repository;

import com.example.easynotes.model.Note;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.easynotes.model.Note;
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
	
}
