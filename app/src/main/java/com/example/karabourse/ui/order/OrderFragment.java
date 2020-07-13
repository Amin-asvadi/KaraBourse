package com.example.karabourse.ui.order;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.karabourse.R;
import com.example.karabourse.adapter.LiveScreenStockAdaopter;
import com.example.karabourse.adapter.OrderProductAdapter;
import com.example.karabourse.models.ProductModel;
import com.example.karabourse.ui.home.model.LiveScreenStockModel;
import com.example.karabourse.ui.tabOrderFragment.AccessoiresFragment;
import com.example.karabourse.ui.tabOrderFragment.FreeProductsFragment;
import com.example.karabourse.ui.tabOrderFragment.LearningCourseFragment;
import com.example.karabourse.ui.tabOrderFragment.LibralyFragment;
import com.example.karabourse.ui.tabOrderFragment.ViewPagerOrderAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class OrderFragment extends Fragment {

	private LearningCourseFragment learningCourseFragment;
	private AccessoiresFragment accessoiresFragment;
	private FreeProductsFragment freeProductsFragment;
	private LibralyFragment libralyFragment;
	private DashboardViewModel dashboardViewModel;
	ViewPager viewPager;
	TabLayout tabLayout;


	public View onCreateView(@NonNull LayoutInflater inflater,
	                         ViewGroup container, Bundle savedInstanceState) {
		dashboardViewModel =
				ViewModelProviders.of(this).get(DashboardViewModel.class);
		View root = inflater.inflate(R.layout.fragment_order, container, false);

		learningCourseFragment = new LearningCourseFragment();
		accessoiresFragment = new AccessoiresFragment();
		freeProductsFragment = new FreeProductsFragment();
		libralyFragment = new LibralyFragment();
		tabLayout = root.findViewById(R.id.tab_layout_singel);
		viewPager = root.findViewById(R.id.tab_order_fragment);
		tabLayout.setupWithViewPager(viewPager);

		ViewPagerOrderAdapter viewPagerOrderAdapter =
				new ViewPagerOrderAdapter(getChildFragmentManager(), 0);


		viewPagerOrderAdapter.addFragments(learningCourseFragment, "دوره های آموزشی");
		viewPagerOrderAdapter.addFragments(accessoiresFragment, "ابزار");
		viewPagerOrderAdapter.addFragments(freeProductsFragment, "محصولات رایگان");
		viewPagerOrderAdapter.addFragments(libralyFragment, "کتابخانه");
		viewPager.setAdapter(viewPagerOrderAdapter);




		return root;
	}


	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}
}