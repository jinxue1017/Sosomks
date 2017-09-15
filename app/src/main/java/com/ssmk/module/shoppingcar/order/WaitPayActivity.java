package com.ssmk.module.shoppingcar.order;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.shoppingcar.adapter.WaitPayAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WaitPayActivity extends MVPBaseActivity implements View.OnClickListener {

    @BindView(R.id.orderdetails_recycler)
    RecyclerView mOrderdetailsRecycler;
    @BindView(R.id.orderdetails_cancel)
    Button mOrderdetailsCancel;
    @BindView(R.id.orderdetails_submit)
    Button mOrderdetailsSubmit;
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    private PopupWindow popWin;
    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.order_details);
        mTopTvTitle.setText(title);
    }
    @Override
    protected void initdata() {
        mOrderdetailsRecycler.setLayoutManager(new LinearLayoutManager(this));
        mOrderdetailsRecycler.setAdapter(new WaitPayAdapter());
        mTopIvBack.setOnClickListener(this);
        mOrderdetailsCancel.setOnClickListener(this);
        mOrderdetailsSubmit.setOnClickListener(this);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_wait_pay;
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.orderdetails_cancel:

                break;
            case R.id.orderdetails_submit:

                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
