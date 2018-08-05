package com.example.easynotes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.easynotes.controller.NoteController;
import com.example.easynotes.model.Note;
import com.example.easynotes.repository.NoteRepository;
import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.given;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import com.fasterxml.jackson.databind.ObjectMapper;

import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.given;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;
@RunWith(SpringRunner.class)
@WebMvcTest(NoteController.class)
public class ControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private NoteRepository noteRepo;

	/*@Test
	public void createNoteTest() throws Exception {
	    Note note = new Note();
	    note.setContent("Content1");
	    note.setTitle("Title1");
	    note.setCreatedAt(new Date(1533294432160L));
	    note.setUpdatedAt(new Date(1533294432160L));
	    ObjectMapper mapper = new ObjectMapper();
	    String exampleCourseJson = "{\"content\":\"Spring\",\"title\":\"10 Steps\"}";
		//given(noteRepo.save(note)).willReturn(note);
		mvc.perform(post("/api/notes").contentType(APPLICATION_JSON).content(exampleCourseJson))
            .andExpect(status().isOk())
	               .andDo(print())
	               .andExpect(jsonPath("content", is(note.getContent())));
	}
	
*/	/*@Test
	public void getNoteByIdTest() throws Exception {
	    Optional<Note> note =null ;
	   // note.setContent("Content1");
	    //note.setTitle("Title1");
		
	    ObjectMapper mapper = new ObjectMapper();
		given(noteRepo.findById(6L)).willReturn(note);
		mvc.perform(get("/api/notes/6").contentType(APPLICATION_JSON))
            .andExpect(status().isOk())
	               .andDo(print());
	             //  .andExpect(jsonPath("content", is(note.get().getContent())));
	}*/
	 @Test
		public void contextLoads() {
		}
	/*@Test
	public void getAllNotesTest() throws Exception {
	    


	              
		Note note = new Note();
	    note.setContent("Content1");
	    note.setTitle("Title1");
		
	    List<Note> allNotes = singletonList(note);
	       given(noteRepo.findAll()).willReturn(allNotes);
	       ObjectMapper mapper = new ObjectMapper();


		mvc.perform(get("/api/notes").contentType(APPLICATION_JSON))
		 .andExpect(status().isOk())
         .andExpect(jsonPath("$", hasSize(1)))
         .andExpect(jsonPath("$[0].content", is(note.getContent()))).andDo(print());
}*/
	
	/*@Test
	public void personNotFoundTest() throws Exception {
		mvc.perform(get("/people/2").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isNotFound());
	}*/
}