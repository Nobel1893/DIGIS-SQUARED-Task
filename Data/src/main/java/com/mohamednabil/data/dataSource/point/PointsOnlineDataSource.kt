package com.mohamednabil.data.dataSource.point

import com.mohamednabil.domain.entities.PointDTO

interface PointsOnlineDataSource {
    suspend fun getPoint(): PointDTO
}
