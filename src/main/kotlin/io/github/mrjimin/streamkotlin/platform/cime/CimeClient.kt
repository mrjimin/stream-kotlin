package io.github.mrjimin.streamkotlin.platform.cime

import io.github.mrjimin.streamkotlin.core.client.StreamClient

class CimeClient(
) : StreamClient() {
    val search by lazy { CimeSearch(client) }
}