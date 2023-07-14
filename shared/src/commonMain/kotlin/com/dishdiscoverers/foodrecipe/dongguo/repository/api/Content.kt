package com.dishdiscoverers.foodrecipe.dongguo.repository.api


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Content(
    @SerialName("type")
    val type: String?,
    @SerialName("value")
    val value: String?
)