package com.example.karabourse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.karabourse.Components.Global;
import com.example.karabourse.R;
import com.example.karabourse.models.ProductModel;

import java.util.List;

public class OrderProductAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
	private List<ProductModel> productModelsitems;
	private Context context;


	public OrderProductAdapter(List<ProductModel> items, Context context) {
		this.productModelsitems = items;
		this.context = context;
	}

	@NonNull
	@Override
	public OrderProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_products,parent,false);

		return new OrderProductViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		ProductModel productModel = productModelsitems.get(position);
		final OrderProductViewHolder vh = (OrderProductViewHolder) holder;
		vh.img_product.setImageResource(productModel.getImg());
		vh.title.setText(productModel.getTitle());
		vh.limite_of_course.setText(productModel.getLimit_of_course());
		vh.price.setText(String.valueOf(productModel.getPrice()));
		vh.rate.setText(String.valueOf(productModel.getRate()));


	/*	ViewGroup.LayoutParams params = vh.cons_product_item.getLayoutParams();
		params.height = (int) ((Global.getSizeScreen(context)) / 4.1);
		vh.cons_product_item.setLayoutParams(params);
		ViewGroup.LayoutParams img_params = vh.cons_product_item.getLayoutParams();
		params.height = (int) ((Global.getSizeScreen(context)) / 4);
		params.width = (int) ((Global.getSizeScreen(context)) / 3.5);
		vh.cons_product_item.setLayoutParams(params);*/

	}

	@Override
	public int getItemCount() {
		return productModelsitems.size();
	}
}
class OrderProductViewHolder extends RecyclerView.ViewHolder{
	ImageView img_product;
	TextView title;
	TextView limite_of_course;
	TextView price;
	TextView rate;
	ConstraintLayout cons_product_item;


	public OrderProductViewHolder(@NonNull View itemView) {
		super(itemView);
		img_product = itemView.findViewById(R.id.img_product);
		title = itemView.findViewById(R.id.txt_item_product_tiitle);
		limite_of_course = itemView.findViewById(R.id.txt_time_of_course);
		price = itemView.findViewById(R.id.txt_price);
		rate = itemView.findViewById(R.id.txt_rate);
		cons_product_item = itemView.findViewById(R.id.product_constriant);

	}
}

