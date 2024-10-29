package com.vaibhavranga.firebasewithmvvm.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.vaibhavranga.firebasewithmvvm.data.model.Note
import java.util.Date
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    val database: FirebaseFirestore
) : NoteRepository {
    override fun getNotes(): List<Note> {
        return arrayListOf(
            Note("dfdjhf", "Note 1", Date()),
            Note("ijdfio", "Note 2", Date()),
            Note("dsi", "Note 3", Date())
        )
    }
}