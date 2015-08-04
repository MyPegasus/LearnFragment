package com.example.mypegasus.learnfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Administrator on 2015/8/4 0004.
 */
public class JikexueyuanWebViewFragment extends Fragment {

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.jikexueyuan_webview, container, false);
		WebView wv = (WebView) root.findViewById(R.id.wv);
		wv.loadUrl("http://www.jikexueyuan.com");
		return root;
	}
}
