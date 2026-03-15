package io.github.mrjimin.streamkotlin

import io.github.mrjimin.streamkotlin.platform.chzzk.ChzzkClient
import io.github.mrjimin.streamkotlin.platform.cime.CimeClient
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val chzzk = ChzzkClient()
    val cime = CimeClient()

    println(chzzk.search.channel("a7e175625fdea5a7d98428302b7aa57f"))
    println()
    println(cime.search.channel("mueeng"))
}