package org.sctgamingllc.starterapp.domain.use_case.get_coins

import org.sctgamingllc.starterapp.common.Resource
import org.sctgamingllc.starterapp.data.remote.dto.toCoin
import org.sctgamingllc.starterapp.domain.model.Coin
import org.sctgamingllc.starterapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
){
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage?:"An unexpected Http error occurred."))
        } catch (e: IOException) {
            emit(Resource.Error("Could not reach the server. Check your internet connection."))
        }
    }
}