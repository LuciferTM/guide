package com.example.lucifer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by LuciferTM on 2017/3/7.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private Long id;
    private String quote;

    public Value(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Long getId() {

        return id;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString(){
        return "Value{" + "id=" + id +
                ", quote='" + quote + '\'' + "}";
    }
}
