package com.cha1se.findparisgame.data.storage

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BalanceDAO {

    @Insert
    fun setBalance(balanceEntity: BalanceEntity)

    @Update
    fun updateBalance(balanceEntity: BalanceEntity)

    @Query("SELECT * FROM balanceEntity")
    fun getBalance(): LiveData<BalanceEntity>

}