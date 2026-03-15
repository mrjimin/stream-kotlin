package io.github.mrjimin.streamkotlin.platform.cime

import io.github.mrjimin.streamkotlin.core.json
import io.github.mrjimin.streamkotlin.platform.chzzk.response.ChzzkChannel
import io.github.mrjimin.streamkotlin.platform.cime.response.CimeChannel
import io.github.mrjimin.streamkotlin.platform.cime.response.CimeResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromJsonElement

class CimeSearch(private val client: HttpClient) {

    suspend fun channel(channelId: String): CimeChannel {
        val response: CimeResponse =
            client.get("${CimeConfig.API}/channels/$channelId").body()

        return json.decodeFromJsonElement(response.data)
    }
}