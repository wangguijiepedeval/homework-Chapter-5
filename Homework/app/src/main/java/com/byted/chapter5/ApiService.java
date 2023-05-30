package com.byted.chapter5;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;

//*使用了 Retrofit 库来访问网络
// getArticles()： GET请求，访问 https://wanandroid.com/wxarticle/chapters/json 接口来获取文章列表
// registerUser()：POST请求，访问 https://www.wanandroid.com/user/register 接口来注册用户，传递三个参数：用户名、密码和确认密码
// 用注解 @Field 来指定需要传递的参数名*/
public interface ApiService {
    // https://wanandroid.com/wxarticle/chapters/json
    @GET("wxarticle/chapters/json")
    Call<ArticleResponse> getArticles();

    // https://www.wanandroid.com/user/register
    // 方法：POST
    // username, password, repassword
    @FormUrlEncoded
    @POST("user/register")
    Call<UserResponse> registerUser(
            @Field("username") String username,
            @Field("password") String password,
            @Field("repassword") String repassword
    );
}
