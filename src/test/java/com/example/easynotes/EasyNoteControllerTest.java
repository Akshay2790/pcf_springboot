package com.example.easynotes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.example.easynotes.controller.NoteController;
import com.example.easynotes.model.Note;
import com.example.easynotes.repository.NoteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.given;

import java.util.Date;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

@RunWith(SpringRunner.class)
@WebMvcTest(NoteController.class)
public class EasyNoteControllerTest {
   @Autowired
   private MockMvc mvc;
  
   @MockBean
   private NoteController noteController;
   
   @MockBean
   private NoteRepository noteRepo;
   
   @Test
   public void getNotes() throws Exception {
       Note note = new Note();
       note.setContent("Content1");
       note.setTitle("Title1");
       
       List<Note> allNotes = singletonList(note);
       given(noteController.getAllNotes()).willReturn(allNotes);
       mvc.perform(get("/api/notes").contentType(APPLICATION_JSON))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$", hasSize(1)))
               .andExpect(jsonPath("$[0].content", is(note.getContent()))).andDo(print());
      
   }
   

   @Test
   public void getNotesById() throws Exception {
	   Note note = new Note();
       note.setContent("Akshay");
       note.setTitle("Ikhar");
     
       given(noteController.getNoteById(10L)).willReturn(note);
       mvc.perform(get("/api/notes/10")
               .contentType(APPLICATION_JSON))
               .andExpect(status().isOk())
               .andDo(print())
               .andExpect(jsonPath("content", is(note.getContent())));
   }
   
   @Test
   public void deleteNote() throws Exception {
	   Note note = new Note();
       note.setContent("def");
       note.setTitle("def");
     
       given(noteController.getNoteById(9L)).willReturn(note);
       mvc.perform(delete("/api/notes/9")
               .contentType(APPLICATION_JSON))
               .andExpect(status().isOk())
               .andDo(print());
   }
/*   @Test
	public void contextLoads() {
	}
*/  /* @Test
   public void createNote() throws Exception {
	   Note note = new Note();
       note.setContent("Content5");
       note.setTitle("Title5");
       ObjectMapper mapper = new ObjectMapper();
       given(noteController.createNote(note)).willReturn(note);
       
       mvc.perform(post("/api/notes")
               .contentType(APPLICATION_JSON))
               .andExpect(status().isOk())
               .andDo(print())
               .andExpect(jsonPath("content", is(note.getContent())));
   }*/
   
   
   /*
    @Test
   public void updateNote() throws Exception {
	   Note note = new Note();
       note.setContent("Content5");
       note.setTitle("Title5");
       ObjectMapper mapper = new ObjectMapper();
       given(noteController.updateNote(10L, note)).willReturn(note);
       
       mvc.perform(put("/api/notes/10")
               .contentType(APPLICATION_JSON).content(mapper.writeValueAsString(note)))
               .andExpect(status().isOk())
               .andDo(print())
               .andExpect(jsonPath("content", is(note.getContent())));
   }*/
}
 