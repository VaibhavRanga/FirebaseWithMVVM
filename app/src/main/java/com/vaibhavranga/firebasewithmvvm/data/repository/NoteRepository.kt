package com.vaibhavranga.firebasewithmvvm.data.repository

import com.vaibhavranga.firebasewithmvvm.data.model.Note

interface NoteRepository {

    fun getNotes(): List<Note>
}