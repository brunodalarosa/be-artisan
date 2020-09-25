package com.brunodalarosa.beartisan.di

import android.content.Context
import androidx.room.Room
import com.brunodalarosa.beartisan.data.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase { //todo on release remove fallbackToDestructiveMigration
        return Room.databaseBuilder(context, AppDatabase::class.java, "be-artisan.db").fallbackToDestructiveMigration().build()
    }
}