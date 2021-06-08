package com.example.ejercicio04_acevedo_jose.api;

import com.example.ejercicio04_acevedo_jose.entity.Sala;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServiceSalaApi {
    @POST("sala")
    public abstract Call<Sala> insertaSala(@Body Sala obj);

    @GET("sala")
    public abstract Call<List<Sala>> listaSala();
}

