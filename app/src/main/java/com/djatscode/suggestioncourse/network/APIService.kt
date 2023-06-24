package com.djatscode.suggestioncourse.network

import com.djatscode.suggestioncourse.model.CompletionRequest
import com.djatscode.suggestioncourse.model.CompletionResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface APIService {
    @Headers("Content-Type: application/json")
    @POST("openai/completions")
    fun complete(
        @Body request: CompletionRequest
    ) : Call<CompletionResponse>
}