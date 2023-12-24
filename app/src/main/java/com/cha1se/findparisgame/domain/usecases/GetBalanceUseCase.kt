package com.cha1se.findparisgame.domain.usecases

import androidx.lifecycle.LiveData
import com.cha1se.findparisgame.domain.model.BalanceModelDomain
import com.cha1se.findparisgame.domain.repository.AppRepository

class GetBalanceUseCase(val repository: AppRepository) {

    fun init(): LiveData<BalanceModelDomain> {
        return repository.getBalance()
    }

}