package com.example.asus.sriwulandari_1202150268_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/**
 * Created by Asus on 02/18/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.menuholder> {
    CardView cd;
    private Context context;
    private List<pilihanMenu> daftarmenu;


    public Adapter(Context context, List<pilihanMenu> daftarmenu) {
        this.context = context;
        this.daftarmenu = daftarmenu;
    }

    @Override
    public menuholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cvmenu, parent, false);
        menuholder holder = new menuholder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(menuholder holder, int position) {
        pilihanMenu data = daftarmenu.get(position);
        holder.foto.setImageDrawable(context.getResources().getDrawable(data.getGambarmenu()));
        holder.foto.setTag(data.getGambarmenu());
        holder.nama.setText(data.getNamamenu());
        holder.nama.setTag(data.getKomposisi());
        holder.harga.setText("Harga: Rp. " + NumberFormat.getInstance(Locale.US).format(data.getHarga()));

    }

    @Override
    public int getItemCount() {
        return daftarmenu.size();
    }

    class menuholder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView nama, harga;

        public menuholder(View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.gambarmenu);
            nama = itemView.findViewById(R.id.namamenu);
            harga = itemView.findViewById(R.id.hargamenu);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent ganti = new Intent(context, DetailMenu.class);
                    ganti.putExtra("nama", nama.getText());
                    ganti.putExtra("harga", harga.getText());
                    ganti.putExtra("komposisi", nama.getTag().toString());
                    ganti.putExtra("foto", foto.getTag().toString());
                    context.startActivity(ganti);
                }
            });
        }
    }
}



