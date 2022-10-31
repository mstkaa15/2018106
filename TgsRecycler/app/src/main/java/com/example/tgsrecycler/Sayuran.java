package com.example.tgsrecycler;

public class Sayuran {
    private String nama,penjelasan;
    private int img;
    public Sayuran(String nama, String penjelasan, int img){
        this.nama = nama;
        this.penjelasan= penjelasan;
        this.img = img;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getPenjelasan(){
        return penjelasan;
    }
    public void setPenjelasan(String penjelasan){
        this.penjelasan = penjelasan;
    }
    public  int getImg(){
        return  img;
    }
    public void setImg(){
        this.img = img;
    }

}
