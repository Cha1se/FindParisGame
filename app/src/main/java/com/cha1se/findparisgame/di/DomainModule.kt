package com.cha1se.findparisgame.di

import com.cha1se.findparisgame.domain.usecases.GetBalanceUseCase
import com.cha1se.findparisgame.domain.usecases.SetBalanceUseCase
import com.cha1se.findparisgame.domain.usecases.UpdateBalanceUseCase
import org.koin.dsl.module

val domainModule = module {
    factory<GetBalanceUseCase> {
        GetBalanceUseCase(repository = get())
    }

    factory<UpdateBalanceUseCase> {
        UpdateBalanceUseCase(repository = get())
    }

    factory<SetBalanceUseCase> {
        SetBalanceUseCase(repository = get())
    }
}