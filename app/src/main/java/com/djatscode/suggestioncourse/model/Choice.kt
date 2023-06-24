package com.djatscode.suggestioncourse.model


import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Choice(
    @SerializedName("finish_reason")
    val finishReason: String,
    @SerializedName("index")
    val index: Int,
    @SerializedName("logprobs")
    val logprobs: Int,
    @SerializedName("text")
    val text: String
) : Parcelable
