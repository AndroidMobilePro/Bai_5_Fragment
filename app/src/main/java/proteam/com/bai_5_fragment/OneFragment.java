package proteam.com.bai_5_fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OneFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, null);
        Log.i("TAG11", "onCreateView");
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("TAG11", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG11", "onCreate");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("TAG11", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("TAG11", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TAG11", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TAG11", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TAG11", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TAG11", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG11", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TAG11", "onDetach");
    }
}
