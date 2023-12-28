package api

data class Response(
    val response: List<ResponseItem>
)

data class ResponseItem(
    val name: String,
    val ticker: String,
    val img: String
)