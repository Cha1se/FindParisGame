package com.cha1se.findparisgame.data.storage

import androidx.room.Entity
import com.cha1se.findparisgame.data.model.BalanceModelData
import com.cha1se.findparisgame.domain.model.BalanceModelDomain
import com.cha1se.findparisgame.presentation.model.BalanceModel

@Entity
data class BalanceEntity (
    val id: Int,
    val count: Int
)

fun BalanceEntity.toModel(): BalanceModel {
    return BalanceModel(
        id = this.id,
        count = this.count
    )
}

fun BalanceEntity.toDomain(): BalanceModelDomain {
    return BalanceModelDomain(
        id = this.id,
        count = this.count
    )
}

fun BalanceEntity.toData(): BalanceModelData {
    return BalanceModelData(
        id = this.id,
        count = this.count
    )
}
