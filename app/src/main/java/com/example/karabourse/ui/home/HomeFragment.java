package com.example.karabourse.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.karabourse.R;
import com.example.karabourse.ui.home.adapter.LiveScreenStockAdaopter;
import com.example.karabourse.ui.home.model.LiveScreenStockModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

	LiveScreenStockAdaopter liveScreenStockAdaopter;
	List<LiveScreenStockModel> liveScreenStockModelsItems;
	RecyclerView rc_Live_Screen;

	private HomeViewModel homeViewModel;

	public View onCreateView(@NonNull LayoutInflater inflater,
	                         ViewGroup container, Bundle savedInstanceState) {
		homeViewModel =
				ViewModelProviders.of(this).get(HomeViewModel.class);
		View root = inflater.inflate(R.layout.fragment_home, container, false);

		rc_Live_Screen = root.findViewById(R.id.live_screen);


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


		return root;
	}
}