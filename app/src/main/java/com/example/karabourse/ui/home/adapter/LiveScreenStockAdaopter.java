package com.example.karabourse.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.karabourse.Components.Global;
import com.example.karabourse.R;
import com.example.karabourse.ui.home.model.LiveScreenStockModel;

import java.util.List;

public class LiveScreenStockAdaopter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
private List<LiveScreenStockModel> items;
private Context context;


	public LiveScreenStockAdaopter(List<LiveScreenStockModel> items, Context context) {
		this.items = items;
		this.context = context;
	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stoke_home_fragment,parent,false);

		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		LiveScreenStockModel liveScreenStockModel = items.get(position);
		final ViewHolder vh = (ViewHolder) holder;
		vh.bourseSymbol.setText(liveScreenStockModel.getBourseSymbol());
		vh.closingPrice.setText(String.valueOf(liveScreenStockModel.getClosingPrice()));
		vh.openingPrice.setText(String.valueOf(liveScreenStockModel.getOpeningPrice()));
		vh.closingPChgPercent.setText(String.valueOf(liveScreenStockModel.getClosingPChgPercent()));


		ViewGroup.LayoutParams params = vh.cons_live_screen.getLayoutParams();
		params.height = (int) ((Global.getSizeScreen(context)) / 5);
		params.width = (int) ((Global.getSizeScreen(context)) / 4.5);
		vh.cons_live_screen.setLayoutParams(params);
	}

	@Override
	public int getItemCount() {
		return items.size();
	}
}
class ViewHolder extends RecyclerView.ViewHolder{
	TextView bourseSymbol;
	TextView closingPChgPercent;
	TextView openingPrice;
	TextView closingPrice;
	ConstraintLayout cons_live_screen;


	public ViewHolder(@NonNull View itemView) {
		super(itemView);
		bourseSymbol = itemView.findViewById(R.id.bourseSymbol);
		closingPChgPercent = itemView.findViewById(R.id.closingPChgPercent);
		openingPrice = itemView.findViewById(R.id.openingPrice);
		closingPrice = itemView.findViewById(R.id.closingPrice);
		cons_live_screen = itemView.findViewById(R.id.cons_live_screen);

	}
}
