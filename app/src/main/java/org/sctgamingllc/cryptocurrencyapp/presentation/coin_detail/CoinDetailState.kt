package org.sctgamingllc.cryptocurrencyapp.presentation.coin_detail

import org.sctgamingllc.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
