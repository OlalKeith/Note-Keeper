package io.owuor91.simplenotekeeper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataManagerTest {

//    @Before
//    public void SetUp() throws Exception{
//        DataManager dm = DataManager.getInstance();
//        dm.getNotes().clear();
//        dm.initializeExampleNotes();
//    }

    @Test
    public void createNewNote(){
        final DataManager dm = DataManager.getInstance();
        final CourseInfo course = dm.getCourse("android_async");
        final String noteTitle = "Test not title";
        final String noteText = "This is the body text of my test note";

        int noteIndex = dm.createNewNote();
        NoteInfo newNote = dm.getNotes().get(noteIndex);
        newNote.setCourse(course);
        newNote.setText(noteText);
        newNote.setTitle(noteTitle);

        NoteInfo compareNote = dm.getNotes().get(noteIndex);
        assertEquals(compareNote.getCourse(), course);
        assertEquals(compareNote.getTitle(), noteTitle);
        assertEquals(compareNote.getText(), noteText);

    }
}