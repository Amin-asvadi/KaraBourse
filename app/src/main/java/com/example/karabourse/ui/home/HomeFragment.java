package com.example.karabourse.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.karabourse.R;
import com.example.karabourse.adapter.LiveScreenStockAdaopter;
import com.example.karabourse.ui.home.model.LiveScreenStockModel;
import com.example.karabourse.ui.mainPageActivity.RegisterStockActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment{

	LiveScreenStockAdaopter liveScreenStockAdaopter;
	List<LiveScreenStockModel> liveScreenStockModelsItems;
	@BindView(R.id.live_screen)
	RecyclerView rc_Live_Screen;
ConstraintLayout cons_register;
	LinearLayout card_register;
	CardView card_register_bourse;


	private HomeViewModel homeViewModel;

	public View onCreateView(@NonNull LayoutInflater inflater,
	                         ViewGroup container, Bundle savedInstanceState) {
		homeViewModel =
				ViewModelProviders.of(this).get(HomeViewModel.class);
		View root = inflater.inflate(R.layout.fragment_home, container, false);
		ButterKnife.bind(this, root);

		card_register = root.findViewById(R.id.card_register);
		cons_register = root.findViewById(R.id.cons_register);
		card_register_bourse = root.findViewById(R.id.card_register_bourse);

		liveScreenStockModelsItems = new ArrayList<>();
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockModelsItems.add(new LiveScreenStockModel("ذوب", 4.5f, 6346f, 7515f));
		liveScreenStockAdaopter = new LiveScreenStockAdaopter(liveScreenStockModelsItems, getContext());
		LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true);
		rc_Live_Screen.setLayoutManager(linearLayoutManager);
		rc_Live_Screen.setAdapter(liveScreenStockAdaopter);

		cons_register.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getContext(),RegisterStockActivity.class);
				startActivity(intent);
			}
		});

		return root;
	}

}