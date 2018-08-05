package com.example.easynotes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.easynotes.controller.NoteController;
import com.example.easynotes.model.Note;
import com.example.easynotes.repository.NoteRepository;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EasyNotesApplicationTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private NoteRepository noteRepository;

	@Test
	public void contextLoads() {
	}
	
/*		@Test
	public void whenFindAllNotes() {
		Note note1 = new Note();
	    note1.setTitle("Title1");
	    note1.setContent("Content1");
	    entityManager.persist(note1);
	    entityManager.flush();
	    
		Note note2 = new Note();
	    note2.setTitle("Title2");
	    note2.setContent("Content2");
	    entityManager.persist(note2);
	    entityManager.flush();
	    
		Note note3 = new Note();
	    note3.setTitle("Title3");
	    note3.setContent("Content3");
	    entityManager.persist(note3);
	    entityManager.flush();
	    
	    List<Note> noteList = noteRepository.findAll();
	    assertThat(noteList.size(),is(3));
	    assertThat(noteList.get(1),is(note2));
	    assertThat(noteList.get(0),is(note1));
	}
	
	@Test
	public void whenFindAllById() {
		Note noteFirst = new Note();
	    noteFirst.setTitle("Title1");
	    noteFirst.setContent("Content1");
	    entityManager.persist(noteFirst);
	    entityManager.flush();
	    
	    Note noteSecond = new Note();
	    noteSecond.setTitle("Title2");
	    noteSecond.setContent("Content2");
	    entityManager.persist(noteSecond);
	    entityManager.flush();
	    
	    Note noteThird = new Note();
	    noteThird.setTitle("Title3");
	    noteThird.setContent("Content3");
	    entityManager.persist(noteThird);
	    entityManager.flush();
	    
	    List<Long> ids= new ArrayList<Long>();
	    ids.add(noteFirst.getId());
	    ids.add(noteSecond.getId());
	    List<Note> foundNote = noteRepository.findAllById(ids);
	    
	    assertThat(foundNote.get(0).getContent() ,is(noteFirst.getContent()));
	    assertThat(foundNote.get(1).getContent() ,is(noteSecond.getContent()));
	}
	
	@Test
	public void whenFindById() {
		Note note = new Note();
	    note.setTitle("Title1");
	    note.setContent("Content1");
	    entityManager.persist(note);
	    entityManager.flush();
	    
	    Optional<Note> noteById = noteRepository.findById(note.getId());
	    Note foundNote = noteById.get();
	    assertThat(foundNote.getContent(), is(note.getContent()));
	}
*/
}
