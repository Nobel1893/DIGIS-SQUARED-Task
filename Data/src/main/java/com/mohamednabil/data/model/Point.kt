package com.mohamednabil.data.model

import com.google.gson.annotations.SerializedName
import com.mohamednabil.domain.entities.PointDTO

data class Point(

        @field:SerializedName("RSRQ")
        val rSRQ: Int? = null,

        @field:SerializedName("RSRP")
        val rSRP: Int? = null,

        @field:SerializedName("SINR")
        val sINR: Int? = null
) {

    fun fromPointDTO(source: PointDTO): Point {
        return Point(rSRQ = source.RSRQ,
                sINR = source.SINR,
                rSRP = source.RSRP)
    }

    fun toPointDTO(source: Point): PointDTO {
        return PointDTO(RSRP = source.rSRP,
                RSRQ = source.rSRQ,
                SINR = source.sINR)
    }

    fun toPointDTO(): PointDTO {
        return PointDTO(RSRP = this.rSRP,
                RSRQ = this.rSRQ,
                SINR = this.sINR)
    }
}
