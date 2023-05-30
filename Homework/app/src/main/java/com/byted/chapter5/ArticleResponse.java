package com.byted.chapter5;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class ArticleResponse {
    // 请求状态码
    @SerializedName("errorCode")
    public int errorCode;
    // 错误信息
    @SerializedName("errorMsg")
    public String errorMsg;
    // 包含一组 Article 对象的列表，是本次网络请求得到的文章列表
    @SerializedName("data")
    List<Article> articles;

    public static class Article {
        //        id: 409,
        //        name: "..",
        //        order: 190001
        @SerializedName("id")
        public int id;
        @SerializedName("name")
        public String name;
        @SerializedName("order")
        public int order;

        @Override
        public String toString() {
            return "Article{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", order=" + order +
                    '}';
        }
    }
}
