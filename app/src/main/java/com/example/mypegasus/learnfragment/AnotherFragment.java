package com.example.mypegasus.learnfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2015/8/2 0002.
 */
public class AnotherFragment extends Fragment {
//public class AnotherFragment extends android.app.Fragment {

	private static final String TAG = "LearnFragment";
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

		Log.e(TAG, "AnotherFragment onAttach()...");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.e(TAG, "AnotherFragment onCreate()...");
	}
	
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//		return super.onCreateView(inflater, container, savedInstanceState);
		View root = inflater.inflate(R.layout.fragment_another, container, false);
		root.findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				getFragmentManager().popBackStack();
			}
		});

		root.findViewById(R.id.btn_showThirdFragment).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				FragmentTransaction ft = getFragmentManager().beginTransaction();
				ft.hide(AnotherFragment.this);
				ft.add(R.id.fragment, new ThirdFragment());
				ft.addToBackStack(null);
				// 设置动画
				ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
				ft.commit();
			}
		});

		Log.e(TAG, "AnotherFragment onCreateView()...");
		return root;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		Log.e(TAG, "AnotherFragment onActivityCreated()...");
	}

	@Override
	public void onStart() {
		super.onStart();

		Log.e(TAG, "AnotherFragment onStart()...");
	}

	@Override
	public void onResume() {
		super.onResume();

		Log.e(TAG, "AnotherFragment onResume()...");
	}

	@Override
	public void onPause() {
		super.onPause();

		Log.e(TAG, "AnotherFragment onPause()...");
	}

	@Override
	public void onStop() {
		super.onStop();

		Log.e(TAG, "AnotherFragment onStop()...");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();

		Log.e(TAG, "AnotherFragment onDestroyView()...");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		Log.e(TAG, "AnotherFragment onDestroy()...");
	}

	@Override
	public void onDetach() {
		super.onDetach();

		Log.e(TAG, "AnotherFragment onDetach()...");
	}
}
