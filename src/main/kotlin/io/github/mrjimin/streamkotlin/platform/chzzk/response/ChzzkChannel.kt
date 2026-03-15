package io.github.mrjimin.streamkotlin.platform.chzzk.response

import kotlinx.serialization.Serializable

@Serializable
data class ChzzkChannel(
    val channelId: String,
    val channelName: String,
    val channelImageUrl: String? = null,
    val verifiedMark: Boolean,
)