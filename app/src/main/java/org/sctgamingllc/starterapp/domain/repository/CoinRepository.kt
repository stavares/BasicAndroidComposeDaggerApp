package org.sctgamingllc.starterapp.domain.repository

import org.sctgamingllc.starterapp.data.remote.dto.CoinDetailDto
import org.sctgamingllc.starterapp.data.remote.dto.CoinDto


interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}