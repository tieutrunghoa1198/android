package com.example.shoeapp.login;

import com.example.shoeapp.login.model.ProductDAO;
import com.example.shoeapp.login.model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface LogInService {
    @GET("/prm/api/v1.0/product/images/")
    Call<List<ProductDAO>> getOneProduct(@Query("product_id") String id);

    @POST()
    Call<List<User>> logIn();
}
