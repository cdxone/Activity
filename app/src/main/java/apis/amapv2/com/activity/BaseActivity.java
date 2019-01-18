package apis.amapv2.com.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity {

    private static final String TAG = "cdx";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG,"BaseActivity - onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initParamsAndValues();
        initView();
        initData();
    }

    protected abstract void initView();

    protected void initData() {
        Log.e(TAG,"BaseActivity - initData");
    }

    protected void initParamsAndValues(){
        Log.e(TAG,"BaseActivity - initParamsAndValues");
    }
}
