package com.aayar94.noteskmm.android.note_list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aayar94.noteskmm.domain.note.Note
import com.aayar94.noteskmm.domain.time.DateTimeUtil

@Composable
fun NoteItem(
    note: Note,
    backgroundColor: Color,
    onNoteClick: () -> Unit,
    onDeleteClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val formattedDateTime = remember(note.created) {
        DateTimeUtil.formatNoteDate(note.created)
    }
    Column(modifier = modifier
        .clip(RoundedCornerShape(5.dp))
        .background(backgroundColor)
        .clickable { onNoteClick() }
        .padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.fillMaxWidth()
        ) {
            Text(text = note.title, fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Delete note",
                modifier = Modifier
                    .clickable(MutableInteractionSource(), null) {
                        onDeleteClick()
                    }
            )

        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = note.content, fontWeight = FontWeight.Light)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = formattedDateTime,
            color = Color.DarkGray,
            modifier = Modifier.align(Alignment.End)
        )
    }
}