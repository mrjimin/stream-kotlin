package io.github.mrjimin.streamkotlin.platform.chzzk.response

import kotlinx.serialization.Serializable

@Serializable
data class ChzzkResponse(
    val code: Int,
    val message: String? = null,
    val content: ChzzkContent
)
@Serializable
data class ChzzkContent(
    val channel: ChzzkChannel
)