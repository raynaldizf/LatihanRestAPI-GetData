package com.app.latihanrestapi.network

import com.app.latihanrestapi.model.request.Mahasiswa
import com.app.latihanrestapi.model.response.ResponseAddDataMahasiswa
import com.app.latihanrestapi.model.response.ResponseDataMahasiswa
import com.app.latihanrestapi.model.response.ResponseDataUpdateMahasiswa
import com.app.latihanrestapi.model.response.ResponseDeleteDataMahasiswa
import com.app.latihanrestapi.model.response.ResponseDetailDataMahasiswa
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("datamahasiswa/")
    fun getDataMahasiswa() : Call<ResponseDataMahasiswa>

    @GET("datamahasiswa/{nim}")
    fun getDetailMahasiswa(@Path("nim") nim : String) : Call<ResponseDetailDataMahasiswa>

    @POST("datamahasiswa/")
    fun addDataMahasiswa(@Body data: Mahasiswa) : Call<ResponseAddDataMahasiswa>

    @DELETE("datamahasiswa/{nim}")
    fun deleteDataMahasiswa(@Path("nim") nim : String) : Call<ResponseDeleteDataMahasiswa>

    @POST("datamahasiswa/{nim}")
    fun updateDataMahasiswa(@Path("nim") nim : String, @Body data: Mahasiswa) : Call<ResponseDataUpdateMahasiswa>

}