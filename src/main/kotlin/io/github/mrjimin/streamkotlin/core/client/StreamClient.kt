package io.github.mrjimin.streamkotlin.core.client

import io.github.mrjimin.streamkotlin.core.DefaultHttpClientProvider
import io.github.mrjimin.streamkotlin.core.HttpClientProvider
import io.ktor.client.HttpClient

abstract class StreamClient(
    provider: HttpClientProvider = DefaultHttpClientProvider,
) {
    protected open val client: HttpClient = provider.client()
}