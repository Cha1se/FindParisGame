package com.cha1se.findparisgame.data.model

import com.cha1se.findparisgame.data.storage.BalanceEntity
import com.cha1se.findparisgame.domain.model.BalanceModelDomain
import com.cha1se.findparisgame.presentation.model.BalanceModel

data class BalanceModelData(
    val id: Int,
    val count: Int
)

fun BalanceModelData.toModel(): BalanceModel {
    return BalanceModel(
        id = this.id,
        count = this.count
    )
}

fun BalanceModelData.toDomain(): BalanceModelDomain {
    return BalanceModelDomain(
        id = this.id,
        count = this.count
    )
}

fun BalanceModelData.toEntity(): BalanceEntity {
    return BalanceEntity(
        id = this.id,
        count = this.count
    )
}

