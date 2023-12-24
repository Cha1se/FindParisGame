package com.cha1se.findparisgame.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cha1se.findparisgame.domain.usecases.GetBalanceUseCase
import com.cha1se.findparisgame.domain.usecases.SetBalanceUseCase
import com.cha1se.findparisgame.domain.usecases.UpdateBalanceUseCase
import com.cha1se.findparisgame.presentation.model.BalanceModel
import com.cha1se.findparisgame.presentation.model.toDomain
import kotlinx.coroutines.launch

class GameViewModel(
    val getBalanceUseCase: GetBalanceUseCase,
    val setBalanceUseCase: SetBalanceUseCase,
    val updateBalanceUseCase: UpdateBalanceUseCase
) : ViewModel() {

    fun getBalance() = getBalanceUseCase.init()

    fun setBalance(balance: BalanceModel) {
        viewModelScope.launch {
            setBalanceUseCase.init(balance.toDomain())
        }
    }

    fun updateBalance(balance: BalanceModel) {
        viewModelScope.launch {
            updateBalanceUseCase.init(balance.toDomain())
        }
    }

}