package com.example.cryptocrazy.model

import com.example.cryptocrazy.data.remote.TeamMember

data class CoinDetail(
    val coinId:String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val is_active: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>, override val size: Int
) : List<CoinDetail> {
    override fun contains(element: CoinDetail): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<CoinDetail>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): CoinDetail {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: CoinDetail): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<CoinDetail> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: CoinDetail): Int {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<CoinDetail> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<CoinDetail> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<CoinDetail> {
        TODO("Not yet implemented")
    }
}
