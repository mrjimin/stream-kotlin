package io.github.mrjimin.streamkotlin.platform.cime.response

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class CimeResponse(
    val code: Int,
    val data: JsonElement
)