package com.pavel.positivity;

public class QuotesData {

    private String quotes;
    private  String author;
    private Integer image;
    public  QuotesData(String quotes, String author, Integer image){
        this.quotes=quotes;
        this.author=author;
        this.image=image;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(
            String author) {
        this.author = author;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
