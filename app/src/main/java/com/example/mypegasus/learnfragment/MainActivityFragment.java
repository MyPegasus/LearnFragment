package com.example.mypegasus.learnfragment;

//import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
//public class MainActivityFragment extends Fragment {
public class MainActivityFragment extends android.app.Fragment {

	public MainActivityFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_main, container, false);

		root.findViewById(R.id.btn_showAnotherFragment).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/*FragmentManager fm = getFragmentManager();
				FragmentTransaction ts = fm.beginTransaction();
				ts.hide(MainActivityFragment.this);
				ts.add(R.id.fragment, new AnotherFragment());
				ts.addToBackStack(null);
				ts.commit();*/
				/* addToBackStack 没有效果，当Fragment 继承与android.app.Fragment*/
				getFragmentManager().beginTransaction().
						replace(R.id.fragment, new AnotherFragment()).
						addToBackStack(null).
						commit();
			}
		});

		return root;
	}
}
