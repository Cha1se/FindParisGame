package com.cha1se.findparisgame.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.cha1se.findparisgame.data.storage.AppDataBase
import com.cha1se.findparisgame.data.storage.toDomain
import com.cha1se.findparisgame.domain.model.BalanceModelDomain
import com.cha1se.findparisgame.domain.model.toEntity
import com.cha1se.findparisgame.domain.repository.AppRepository

class AppRepositoryImpl(val db: AppDataBase): AppRepository {
    override fun getBalance(): LiveData<BalanceModelDomain> {
        return db.geDao().getBalance().map { it.toDomain() }
    }

    override suspend fun setBalance(balance: BalanceModelDomain) {
        db.geDao().setBalance(balance.toEntity())
    }

    override suspend fun updateBalance(balance: BalanceModelDomain) {
        db.geDao().updateBalance(balance.toEntity())
    }


}