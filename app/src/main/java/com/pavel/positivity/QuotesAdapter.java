package com.pavel.positivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.ViewHolder> {

                QuotesData[] quotesData;
    Context context;


    public QuotesAdapter(QuotesData[] quotesData,MainActivity activity){
        this.quotesData = quotesData;
        this.context=activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view  = layoutInflater.inflate(R.layout.motivation_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final QuotesData QuotesDataList = quotesData[position];
        holder.quotes.setText(QuotesDataList.getQuotes());
        holder.author.setText(QuotesDataList.getAuthor());
        holder.imageView.setImageResource(QuotesDataList.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, QuotesDataList.getQuotes(), Toast.LENGTH_SHORT).show();
                Toast.makeText(context, QuotesDataList.getQuotes(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return quotesData.length;
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{

            ImageView imageView ;
            TextView  quotes;
            TextView  author;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            quotes = itemView.findViewById(R.id.quotes);
            author = itemView.findViewById(R.id.author);

        }
    }

}
