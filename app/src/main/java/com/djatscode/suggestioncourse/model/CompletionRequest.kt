package com.djatscode.suggestioncourse.model

data class CompletionRequest(
    val prompt: String,
    val max_tokens: Int,
    val temperature: Double
)
