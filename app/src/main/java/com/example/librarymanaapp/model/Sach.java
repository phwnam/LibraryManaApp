package com.example.librarymanaapp.model;

public class Sach {
    public int maSach;
    public String tenSach;
    public int giaThue;
    public int maLoai;

    public Sach(){
    }

    public Sach(int maSach, String tenSach, int giaThue, int maLoai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaThue = giaThue;
        this.maLoai = maLoai;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", giaThue=" + giaThue +
                ", maLoai=" + maLoai +
                '}';
    }
}