package com.cha1se.findparisgame.di

import com.cha1se.findparisgame.data.repository.AppRepositoryImpl
import com.cha1se.findparisgame.data.storage.AppDataBase
import com.cha1se.findparisgame.domain.repository.AppRepository
import org.koin.dsl.module

val dataModule = module {

    single<AppDataBase>{
        AppDataBase.getInstance(context = get())
    }

    single<AppRepository> {
        AppRepositoryImpl(get())
    }

}