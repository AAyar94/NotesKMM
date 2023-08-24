package com.aayar94.noteskmm.domain.note

import com.aayar94.noteskmm.presentation.BabyBlueHex
import com.aayar94.noteskmm.presentation.LightGreenHex
import com.aayar94.noteskmm.presentation.RedOrangeHex
import com.aayar94.noteskmm.presentation.RedPinkHex
import com.aayar94.noteskmm.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime,
) {
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}