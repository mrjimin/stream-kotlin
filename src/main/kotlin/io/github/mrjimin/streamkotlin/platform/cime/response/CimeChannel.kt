package io.github.mrjimin.streamkotlin.platform.cime.response

import kotlinx.serialization.Serializable

@Serializable
data class CimeChannel(
    val id: String,
    val slug: String,
    val name: String,
    val level: Int,
    val description: String,
    val imageUrl: String,
    val followerCount: Int,
    val subscriberCount: Int
)