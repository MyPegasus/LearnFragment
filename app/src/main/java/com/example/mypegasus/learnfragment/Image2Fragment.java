package com.example.mypegasus.learnfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by MyPegasus on 2015/8/5.
 */
public class Image2Fragment extends Fragment {

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		ImageView iv = new ImageView(getActivity());
		iv.setImageResource(R.drawable.img2);
		return iv;
	}
}
