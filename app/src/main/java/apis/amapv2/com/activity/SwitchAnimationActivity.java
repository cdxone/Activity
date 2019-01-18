package apis.amapv2.com.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SwitchAnimationActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_animation);

        mContext = this;

        //切换动画
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext,TestActivity.class));
                //第一个参数：新的页面进入时的动画。
                //第二个参数：旧的页面退出时的动画。
                overridePendingTransition(R.anim.splash_fade_in, R.anim.splash_fade_out);
            }
        });
    }
}
