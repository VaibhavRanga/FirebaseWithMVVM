package com.vaibhavranga.firebasewithmvvm.di

import com.google.firebase.firestore.FirebaseFirestore
import com.vaibhavranga.firebasewithmvvm.data.repository.NoteRepository
import com.vaibhavranga.firebasewithmvvm.data.repository.NoteRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNoteRepository(
        database: FirebaseFirestore
    ): NoteRepository {
        return NoteRepositoryImpl(database)
    }
}