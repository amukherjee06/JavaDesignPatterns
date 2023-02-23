package com.arnab.designpatterns.builder;

public class TestBuilder {

    //There is a problem creating the object for HttpClient
    //Suppose you are using a GET request and doesn't need a body
    //How to instantiate - by forcing null

    HttpClient httpClient=new HttpClient("GET","https://localhost","username","password","x-a-b-c",null);
}
