package com.example.librarymanaapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.librarymanaapp.R;
import com.example.librarymanaapp.model.LoaiSach;


import java.util.ArrayList;

public class LoaiSachSpinnerAdapter extends ArrayAdapter<LoaiSach> {
    private Context context;
    private ArrayList<LoaiSach> list;
    TextView tvMaLoai,tvTenLoai;

    public LoaiSachSpinnerAdapter(@NonNull Context context, ArrayList<LoaiSach> list) {
        super(context, 0,list);
        this.context= context;
        this.list=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.loaisach_item_spinner,null);
        }
        final LoaiSach item = list.get(position);
        if(item!= null){
            tvMaLoai = v.findViewById(R.id.tvMaLoaiSp);
            tvMaLoai.setText(item.getMaLoai() + ". ");
            tvTenLoai = v.findViewById(R.id.tvTenLoaiSp);
            tvTenLoai.setText(item.getTenLoai());
        }
        return v;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.loaisach_item_spinner,null);
        }
        final LoaiSach item = list.get(position);
        if(item != null){
            tvMaLoai = v.findViewById(R.id.tvMaLoaiSp);
            tvMaLoai.setText(item.getMaLoai() + ". ");
            tvTenLoai = v.findViewById(R.id.tvTenLoaiSp);
            tvTenLoai.setText(item.getTenLoai());
        }
        return v;
    }
}
