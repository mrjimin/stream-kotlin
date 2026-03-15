package io.github.mrjimin.streamkotlin.core

import io.ktor.client.HttpClient

interface HttpClientProvider {
    fun client(): HttpClient
}