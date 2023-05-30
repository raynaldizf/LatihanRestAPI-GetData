package com.app.latihanrestapi.model.response


import com.google.gson.annotations.SerializedName

data class ResponseAddDataMahasiswa(
    @SerializedName("data")
    val data: String,
    @SerializedName("status")
    val status: String
)