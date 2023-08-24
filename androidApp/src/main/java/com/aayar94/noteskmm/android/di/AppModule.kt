package com.aayar94.noteskmm.android.di

import android.app.Application
import com.aayar94.noteskmm.data.local.DatabaseDriverFactory
import com.aayar94.noteskmm.data.note.SqlDelightNoteDataSource
import com.aayar94.noteskmm.database.NoteDatabase
import com.aayar94.noteskmm.domain.note.NoteDataSource
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }

}