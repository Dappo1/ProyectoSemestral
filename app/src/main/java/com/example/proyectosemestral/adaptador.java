package com.example.proyectosemestral;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaptador extends RecyclerView.Adapter<adaptador.ViewHolderDatos> {
    ArrayList<PersonajeVO> listapersonajes;
    public adaptador(ArrayList<PersonajeVO> listapersonajes) {
        this.listapersonajes = listapersonajes;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.linearlayout,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.nombrecard.setText(listapersonajes.get(position).getNombre());
        holder.descripcioncard.setText(listapersonajes.get(position).getDescripcion());
        holder.representantecard.setText(listapersonajes.get(position).getRepresentante());
        holder.avatar.setImageResource(listapersonajes.get(position).getFoto());
    }

    @Override
    public int getItemCount() {

        return listapersonajes.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView nombrecard,descripcioncard, representantecard;
        ImageView avatar;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            nombrecard = itemView.findViewById(R.id.titulotarjeta);
            descripcioncard = itemView.findViewById(R.id.descripcion);
            representantecard = itemView.findViewById(R.id.representante);
            avatar = itemView.findViewById(R.id.avatar);
        }
    }
}
