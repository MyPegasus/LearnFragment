package com.example.mypegasus.fragmentmodule;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

	public MainActivityFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main, container, false);

		view.findViewById(R.id.btn_gotoSecondFragment).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				getFragmentManager().beginTransaction().
						replace(R.id.fragment, new SecondFragment()).
						addToBackStack(null).
						commit();
			}
		});
		return view;
	}
}
