package com.example.karabourse.ui.tabOrderFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.karabourse.R;
import com.example.karabourse.adapter.OrderProductAdapter;
import com.example.karabourse.models.ProductModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LibralyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LibralyFragment extends Fragment {

	OrderProductAdapter orderProductAdapter;
	List<ProductModel> productModelsitems;
	RecyclerView rc_libraly;
	// TODO: Rename parameter arguments, choose names that match
	// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
	private static final String ARG_PARAM1 = "param1";
	private static final String ARG_PARAM2 = "param2";

	// TODO: Rename and change types of parameters
	private String mParam1;
	private String mParam2;

	public LibralyFragment() {
		// Required empty public constructor
	}

	/**
	 * Use this factory method to create a new instance of
	 * this fragment using the provided parameters.
	 *
	 * @param param1 Parameter 1.
	 * @param param2 Parameter 2.
	 * @return A new instance of fragment LibralyFragment.
	 */
	// TODO: Rename and change types and number of parameters
	public static LibralyFragment newInstance(String param1, String param2) {
		LibralyFragment fragment = new LibralyFragment();
		Bundle args = new Bundle();
		args.putString(ARG_PARAM1, param1);
		args.putString(ARG_PARAM2, param2);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
			mParam1 = getArguments().getString(ARG_PARAM1);
			mParam2 = getArguments().getString(ARG_PARAM2);
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View root =	inflater.inflate(R.layout.fragment_libraly, container, false);
		rc_libraly = root.findViewById(R.id.rc_libraly);

		productModelsitems = new ArrayList<>();
		productModelsitems.add(new ProductModel(R.drawable.clip_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip2_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip3_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip4_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip2_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip3_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip4_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip1, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip2_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip3_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip4_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip1, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		productModelsitems.add(new ProductModel(R.drawable.clip2_xxx, "آشنایی با بورس",
				"مدت دوره: سه جلسه 3 ساعته", 70000f, 4.5f));
		orderProductAdapter = new OrderProductAdapter(productModelsitems, getContext());
		LinearLayoutManager linearLayoutMan = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
		rc_libraly.setLayoutManager(linearLayoutMan);
		rc_libraly.setAdapter(orderProductAdapter);


		return  root;
	}
}