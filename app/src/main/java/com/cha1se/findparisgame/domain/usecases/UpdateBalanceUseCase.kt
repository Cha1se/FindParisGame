package com.cha1se.findparisgame.domain.usecases

import com.cha1se.findparisgame.domain.model.BalanceModelDomain
import com.cha1se.findparisgame.domain.repository.AppRepository

class UpdateBalanceUseCase(val repository: AppRepository) {

    suspend fun init(balance: BalanceModelDomain) {
        repository.updateBalance(balance)
    }

}