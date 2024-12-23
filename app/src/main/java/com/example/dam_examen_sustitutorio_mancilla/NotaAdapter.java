package com.example.dam_examen_sustitutorio_mancilla;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotaAdapter extends RecyclerView.Adapter<NotaAdapter.NotaViewHolder> {

    private List<Nota> notaList;

    public NotaAdapter(List<Nota> notaList) {
        this.notaList = notaList;
    }

    @NonNull
    @Override
    public NotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_nota, parent, false);
        return new NotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotaViewHolder holder, int position) {
        Nota nota = notaList.get(position);
        holder.tvTitulo.setText(nota.getTitulo());
        holder.tvContenido.setText(nota.getContenido());
    }

    @Override
    public int getItemCount() {
        return notaList.size();
    }

    static class NotaViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitulo, tvContenido;

        public NotaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvContenido = itemView.findViewById(R.id.tvContenido);
        }
    }
}
