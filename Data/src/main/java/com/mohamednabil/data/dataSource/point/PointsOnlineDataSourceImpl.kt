package com.mohamednabil.data.dataSource.point

import com.mohamednabil.data.di.WebServices
import com.mohamednabil.domain.entities.PointDTO
import javax.inject.Inject

class PointsOnlineDataSourceImpl @Inject constructor(val webServices: WebServices) : PointsOnlineDataSource {

    override suspend fun getPoint(): PointDTO {
        return webServices.getPoint().toPointDTO();
    }
}
