package apis.amapv2.com.activity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class MainActivity extends BaseListActivty{


    @Override
    protected void initData() {

        ArrayList<ItemObject> data = new ArrayList<>();
        data.add(new ItemObject("Activity的基本知识", KnowledgeActivity.class));
        data.add(new ItemObject("Activity的切换动画", SwitchAnimationActivity.class));

        mMyListView.setData(data);
    }
}
