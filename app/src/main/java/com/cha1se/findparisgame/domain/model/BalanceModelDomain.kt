package com.cha1se.findparisgame.domain.model

import com.cha1se.findparisgame.data.model.BalanceModelData
import com.cha1se.findparisgame.data.storage.BalanceEntity
import com.cha1se.findparisgame.presentation.model.BalanceModel

data class BalanceModelDomain (
    val id: Int,
    val count: Int
)

fun BalanceModelDomain.toModel(): BalanceModel {
    return BalanceModel(
        id = this.id,
        count = this.count
    )
}

fun BalanceModelDomain.toData(): BalanceModelData {
    return BalanceModelData(
        id = this.id,
        count = this.count
    )
}

fun BalanceModelDomain.toEntity(): BalanceEntity {
    return BalanceEntity(
        id = this.id,
        count = this.count
    )
}

