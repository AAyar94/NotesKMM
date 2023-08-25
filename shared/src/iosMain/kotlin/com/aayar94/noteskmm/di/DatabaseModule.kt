package com.aayar94.noteskmm.di

import com.aayar94.noteskmm.data.local.DatabaseDriverFactory
import com.aayar94.noteskmm.data.note.SqlDelightNoteDataSource
import com.aayar94.noteskmm.database.NoteDatabase
import com.aayar94.noteskmm.domain.note.NoteDataSource

class DatabaseModule {

    private val factory by lazy { DatabaseDriverFactory() }
    val noteDataSource : NoteDataSource by lazy {
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }

}