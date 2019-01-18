package apis.amapv2.com.activity;

import com.cdx.answerlibrary.activity.BaseAnswerListActivity;

public class KnowledgeActivity extends BaseAnswerListActivity {

    @Override
    protected void initData() {
        mAv.setData("ActivityKnowledge.xml");
    }
}
