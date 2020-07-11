package com.example.karabourse.Network;




import com.example.karabourse.ui.home.HomeFragment;

import dagger.Component;


@RetrofitScope
@Component(dependencies = NetComponent.class, modules = ApplicationModule.class)

public interface ApplicationComponent {

    void inject_first_page(HomeFragment homeFragment);

}