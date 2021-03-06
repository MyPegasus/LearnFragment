package com.example.mypegasus.learnfragment;

//import android.app.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
//public class MainActivity extends Activity {

	private static final String TAG = "LearnFragment";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if(savedInstanceState == null) {
			// getSupportFragmentManager()支持的是 extends android.support.v4.app.Fragment 的相关Fragment
			getSupportFragmentManager().beginTransaction().add(R.id.fragment, new MainActivityFragment()).commit();
			// getFragmentManager()支持的是 extends android.app.Fragment 的相关Fragment
			//getFragmentManager().beginTransaction().add(R.id.fragment, new MainActivityFragment()).commit();
		}

		Log.i(TAG, "MainActivity onCreate()...");
	}

	@Override
	protected void onStart() {
		super.onStart();

		Log.i(TAG, "MainActivity onStart()...");
	}

	@Override
	protected void onResume() {
		super.onResume();

		Log.i(TAG, "MainActivity onResume()...");
	}

	@Override
	protected void onPause() {
		super.onPause();

		Log.i(TAG, "MainActivity onPause()...");
	}

	@Override
	protected void onStop() {
		super.onStop();

		Log.i(TAG, "MainActivity onStop()...");
	}

	protected void onDestroy() {
		super.onDestroy();

		Log.i(TAG, "MainActivity onDestroy()...");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
