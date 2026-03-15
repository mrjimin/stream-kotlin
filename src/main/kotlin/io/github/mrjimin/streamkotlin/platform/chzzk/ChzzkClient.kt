package io.github.mrjimin.streamkotlin.platform.chzzk

import io.github.mrjimin.streamkotlin.core.client.StreamClient

class ChzzkClient(
) : StreamClient() {
    val search by lazy { ChzzkSearch(client) }

    val isLive by lazy {  }
}