package io.github.mrjimin.streamkotlin.platform.chzzk

import io.github.mrjimin.streamkotlin.platform.chzzk.response.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

class ChzzkSearch(private val client: HttpClient) {

    suspend fun channel(channelId: String): ChzzkChannel {
        val response: ChzzkResponse =
            client.get("${ChzzkConfig.API}/service/v3/channels/$channelId/live-detail") {
                headers { append(HttpHeaders.UserAgent, "Mozilla/5.0") }
            }.body()

        return response.content.channel
    }
}