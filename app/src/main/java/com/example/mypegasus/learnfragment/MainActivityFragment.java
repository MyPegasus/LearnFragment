package com.example.mypegasus.learnfragment;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
//public class MainActivityFragment extends android.app.Fragment {

	private static final String TAG = "LearnFragment";

	public MainActivityFragment() {
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

		Log.w(TAG, "MainFragment onAttach()...");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.w(TAG, "MainFragment onCreate()...");
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

		root.findViewById(R.id.btn_startSliderActivity).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getActivity(), SliderActivity.class));
			}
		});

		Log.w(TAG, "MainFragment onCreateView()...");
		return root;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		Log.w(TAG, "MainFragment onActivityCreated()...");
	}

	@Override
	public void onStart() {
		super.onStart();

		Log.w(TAG, "MainFragment onStart()...");
	}

	@Override
	public void onResume() {
		super.onResume();

		Log.w(TAG, "MainFragment onResume()...");
	}

	@Override
	public void onPause() {
		super.onPause();

		Log.w(TAG, "MainFragment onPause()...");
	}

	@Override
	public void onStop() {
		super.onStop();

		Log.w(TAG, "MainFragment onStop()...");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();

		Log.w(TAG, "MainFragment onDestroyView()...");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		Log.w(TAG, "MainFragment onDestroy()...");
	}

	@Override
	public void onDetach() {
		super.onDetach();

		Log.w(TAG, "MainFragment onDetach()...");
	}

}
