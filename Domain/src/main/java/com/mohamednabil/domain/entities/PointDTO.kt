package com.mohamednabil.domain.entities

typealias Points = List<PointDTO>
typealias Point = PointDTO

data class PointDTO(
        val RSRP: Int? = null,
        val RSRQ: Int? = null,
        val SINR: Int? = null
)

interface PointsRepository {
    suspend fun getPoint(): Point
}