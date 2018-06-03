package proteam.com.bai_5_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private Fragment mFragment1;
    private Fragment mFragment2;
    private FrameLayout mFrContain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragment1 = new OneFragment();
        mFragment2 = new TwoFragment();
        mFrContain2 = (FrameLayout) findViewById(R.id.frContain2);
        (findViewById(R.id.btnFragment1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchFragment(mFragment1, true, R.id.frContain1);
                mFrContain2.setVisibility(View.GONE);
            }
        });

        (findViewById(R.id.btnFragment2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchFragment(mFragment2, true, R.id.frContain1);
                mFrContain2.setVisibility(View.GONE);
            }
        });
        (findViewById(R.id.btnFragment3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFrContain2.setVisibility(View.VISIBLE);
            }
        });
    }

    private void switchFragment(Fragment fragment, boolean addToBackStack, int id) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (fragment.getTag() == null) {
            ft.replace(id, fragment, fragment.toString());
        } else {
            ft.replace(id, fragment);
        }

        //backPress with fragment
        if (addToBackStack) {
            ft.addToBackStack(null);
        }
        ft.commit();

//        //find fragment current
//        Fragment currentFragment = fm.findFragmentById(R.id.frContain1);
//
//        if (currentFragment != fragment) {
//            if (fragment.getTag() == null) {
//                ft.replace(id, fragment, fragment.toString());
//            } else {
//                ft.replace(id, fragment);
//            }
//
//            //back Press with fragment
//            if (addToBackStack) {
//                ft.addToBackStack(null);
//            }
//            ft.commit();
//        }


    }
}
