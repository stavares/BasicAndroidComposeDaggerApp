package org.sctgamingllc.starterapp.presentation.coin_detail

import org.sctgamingllc.starterapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
