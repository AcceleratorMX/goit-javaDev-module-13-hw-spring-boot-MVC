package ua.goit.hw13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

//		NoteService noteService = new NoteService();
//
//		noteService.add(new Note(1, "1st title", "First content."));
//		noteService.add(new Note(2, "2nd title", "Second content."));
//		noteService.add(new Note(3, "3rd title", "Third content."));
//
//		List<Note> allNotes = noteService.listAll();
//		for (Note note : allNotes) {
//			System.out.println(note);
//		}
	}
}

