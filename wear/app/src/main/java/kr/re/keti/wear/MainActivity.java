package kr.re.keti.wear;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.wearable.activity.WearableActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ViewAnimator;

import kr.re.keti.common.activities.SampleActivityBase;
import kr.re.keti.common.logger.Log;
import kr.re.keti.common.logger.LogFragment;
import kr.re.keti.common.logger.LogWrapper;
import kr.re.keti.common.logger.MessageOnlyLogFilter;




public class MainActivity extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            BluetoothChatFragment fragment = new BluetoothChatFragment(this);
            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();
        }



        // Enables Always-on
        setAmbientEnabled();
    }
}
