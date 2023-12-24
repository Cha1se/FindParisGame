package com.cha1se.findparisgame.presentation.model

import com.cha1se.findparisgame.data.model.BalanceModelData
import com.cha1se.findparisgame.data.storage.BalanceEntity
import com.cha1se.findparisgame.domain.model.BalanceModelDomain

data class BalanceModel(
    val id: Int,
    val count: Int
)

fun BalanceModel.toDomain(): BalanceModelDomain {
    return BalanceModelDomain(
        id = this.id,
        count = this.count
    )
}

fun BalanceModel.toData(): BalanceModelData {
    return BalanceModelData(
        id = this.id,
        count = this.count
    )
}

fun BalanceModel.toEntity(): BalanceEntity {
    return BalanceEntity(
        id = this.id,
        count = this.count
    )
}
