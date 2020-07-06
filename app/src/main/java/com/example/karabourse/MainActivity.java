package com.example.karabourse;

import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.karabourse.ui.bottom_sheet.BottomSheetFragment;
import com.example.karabourse.ui.home.HomeFragment;
import com.example.karabourse.ui.order.OrderFragment;
import com.example.karabourse.ui.profile.ProfileFragment;
import com.example.karabourse.ui.secondlyMarket.SecondlyMarketFragment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

	MeowBottomNavigation bottomNavigation;
	private final static int ID_ARROW = 1;
	private final static int ID_ORDER = 2;
	private final static int ID_HOME = 3;
	private final static int ID_MARKET = 4;
	private final static int ID_PROFILE = 5;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bottomNavigation = findViewById(R.id.bottom_nav);

		bottomNavigation.add(new MeowBottomNavigation.Model(ID_ARROW, R.drawable.ic_up));
		bottomNavigation.add(new MeowBottomNavigation.Model(ID_ORDER, R.drawable.ic_shop));
		bottomNavigation.add(new MeowBottomNavigation.Model(ID_HOME, R.drawable.ic_home));
		bottomNavigation.add(new MeowBottomNavigation.Model(ID_MARKET, R.drawable.ic_signal));
		bottomNavigation.add(new MeowBottomNavigation.Model(ID_PROFILE, R.drawable.ic_profile));


		//getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new HomeFragment()).commit();

		bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
			@Override
			public void onClickItem(MeowBottomNavigation.Model item) {
				Toast.makeText(getApplicationContext(), "Clicked item" + item.getId(), Toast.LENGTH_SHORT).show();
			}
		});
		bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
			@Override
			public void onShowItem(MeowBottomNavigation.Model item) {
				Fragment select_fragment = null;
				switch (item.getId()) {
					case ID_ARROW:
						select_fragment = new BottomSheetFragment();
						break;
					case ID_ORDER:
						select_fragment = new OrderFragment();
						break;
					case ID_HOME:
						select_fragment = new HomeFragment();
						break;
					case ID_MARKET:
						select_fragment = new SecondlyMarketFragment();
						break;
					case ID_PROFILE:
						select_fragment = new ProfileFragment();
						break;

				}
				getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, select_fragment).commit();
			}
		});
		bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
			@Override
			public void onReselectItem(MeowBottomNavigation.Model item) {
			}
		});
		bottomNavigation.show(ID_HOME,true);
	}
}



