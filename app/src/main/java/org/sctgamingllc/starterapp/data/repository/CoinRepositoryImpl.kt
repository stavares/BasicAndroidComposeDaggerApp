package org.sctgamingllc.starterapp.data.repository

import org.sctgamingllc.starterapp.data.remote.CoinPaprikaApi
import org.sctgamingllc.starterapp.data.remote.dto.CoinDetailDto
import org.sctgamingllc.starterapp.data.remote.dto.CoinDto
import org.sctgamingllc.starterapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}