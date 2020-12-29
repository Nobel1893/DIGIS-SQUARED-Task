package com.mohamednabil.data.repository

import com.mohamednabil.data.dataSource.point.PointsOnlineDataSource
import com.mohamednabil.domain.entities.Point
import com.mohamednabil.domain.entities.PointsRepository
import javax.inject.Inject

class PointsRepository @Inject constructor(val pointsOnlineDataSource: PointsOnlineDataSource)
    : PointsRepository {

    override suspend fun getPoint(): Point {
        return pointsOnlineDataSource.getPoint();
    }

}