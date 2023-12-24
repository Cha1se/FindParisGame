package com.cha1se.findparisgame.domain.repository

import androidx.lifecycle.LiveData
import com.cha1se.findparisgame.domain.model.BalanceModelDomain

interface AppRepository {

    fun getBalance(): LiveData<BalanceModelDomain>

    suspend fun setBalance(balance: BalanceModelDomain)

    suspend fun updateBalance(balance: BalanceModelDomain)

}