package com.aayar94.noteskmm.android.note_list

import com.aayar94.noteskmm.domain.note.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)
