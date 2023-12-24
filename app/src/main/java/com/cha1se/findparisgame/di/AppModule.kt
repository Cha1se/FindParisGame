package com.cha1se.findparisgame.di

import com.cha1se.findparisgame.presentation.viewmodel.EndGameViewModel
import com.cha1se.findparisgame.presentation.viewmodel.GameViewModel
import com.cha1se.findparisgame.presentation.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    viewModel<MainViewModel> {
        MainViewModel(
            getBalanceUseCase = get(),
            setBalanceUseCase = get(),
            updateBalanceUseCase = get()
        )
    }

    viewModel<GameViewModel> {
        GameViewModel(
            getBalanceUseCase = get(),
            setBalanceUseCase = get(),
            updateBalanceUseCase = get()
        )
    }

    viewModel<EndGameViewModel> {
        EndGameViewModel(
            getBalanceUseCase = get(),
            setBalanceUseCase = get(),
            updateBalanceUseCase = get()
        )
    }
}