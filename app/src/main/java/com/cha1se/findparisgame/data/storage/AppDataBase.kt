package com.cha1se.findparisgame.data.storage

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(BalanceEntity::class), version = 1, exportSchema = false)
abstract class AppDataBase: RoomDatabase() {

    abstract fun geDao(): BalanceDAO

    companion object {
        private var INSTANCE: AppDataBase? = null
        fun getInstance(context: Context): AppDataBase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context,
                    AppDataBase::class.java,
                    "roomdb"
                )
                    .build()
            }

            return INSTANCE as AppDataBase
        }
    }

}