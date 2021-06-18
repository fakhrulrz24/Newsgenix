package org.d3if4027.newsgenix.models

import org.d3if4027.newsgenix.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)