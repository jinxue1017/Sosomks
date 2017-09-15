package com.ssmk.module.merchant.view;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.ssmk.adapter.Marter_Adapter;
import com.ssmk.adapter.Marter_head_adapter;
import com.ssmk.adapter.Marter_item_Adapter;
import com.ssmk.adapter.Popu_GridView_Adapter;
import com.ssmk.base.MVPBaseFragment;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.Presenter.MerchantPresenter;
import com.ssmk.module.merchant.bean.ShoppingFeileiBean;
import com.ssmk.utlis.CustomProgressDialog;
import com.ssmk.utlis.SearchView;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/27 10:04
 * 邮箱：17600157003@163.com
 */


//这个是品牌页面
public class MerChantFragment<T> extends MVPBaseFragment<T> {

    @BindView(R.id.marter_edit)
    SearchView mMarterEdit;
    @BindView(R.id.marter_bnt)
    Button mMarterBnt;
//    @BindView(R.id.image1)
//    ImageView mImage1;
//    @BindView(R.id.text1)
//    TextView mText1;
//    @BindView(R.id.linear1)
//    LinearLayout mLinear1;
//    @BindView(R.id.image2)
//    ImageView mImage2;
//    @BindView(R.id.text2)
//    TextView mText2;
//    @BindView(R.id.linear2)
//    LinearLayout mLinear2;
//    @BindView(R.id.image3)
//    ImageView mImage3;
//    @BindView(R.id.text3)
//    TextView mText3;
//    @BindView(R.id.linear3)
//    LinearLayout mLinear3;
//    @BindView(R.id.image4)
//    ImageView mImage4;
//    @BindView(R.id.text4)
//    TextView mText4;
//    @BindView(R.id.linear4)
//    LinearLayout mLinear4;
//    @BindView(R.id.image5)
//    ImageView mImage5;
//    @BindView(R.id.text5)
//    TextView mText5;
//    @BindView(R.id.linear5)
//    LinearLayout mLinear5;
    @BindView(R.id.marter_tea4)
    RadioButton mMarterTea4;
    @BindView(R.id.marter_chekd)
    CheckBox mMarterChekd;
    @BindView(R.id.marter_address)
    TextView mMarterAddress;
    @BindView(R.id.marter_relayout)
    RelativeLayout mMarterRelayout;
    @BindView(R.id.marter_recycler)
    RecyclerView mMarterRecycler;
    Unbinder unbinder;
    @BindView(R.id.marter_rv)
    RecyclerView marterRv;
    Unbinder unbinder1;
    @BindView(R.id.marter_radio)
    LinearLayout marterRadio;
    private MerchantPresenter mBasePresenter;
    private Marter_Adapter adapter;
    private PopupWindow popWin;
    private boolean bo = true;
    private List<ShoppingFeileiBean.MerchantsTypeDataBean> mMerchantsTypeData;
    private List<ShoppingFeileiBean.MerchantsDataBean> mMerchantsData = new ArrayList<>();
    private CustomProgressDialog mDialog;
    private Boolean Flag = false;

    @Override
    protected void initdata() {
        mBasePresenter = new MerchantPresenter(this, getActivity());
        mBasePresenter.GetDataModel();
    }

    @Override
    protected void initView(){
        mDialog = new CustomProgressDialog(getActivity(), "", R.drawable.emptyloadanim);
        mDialog.show();
        WindowManager windowManager = getActivity().getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        WindowManager.LayoutParams lp = mDialog.getWindow().getAttributes();
//        lp.alpha = 0.9f; //0.0-1.0//设置透明度?
        lp.width = display.getWidth(); //设置宽度
        lp.height = display.getHeight() - 380;
        mDialog.getWindow().setAttributes(lp);
        FontHelper.applyFont(getActivity(), mMarterEdit, FontHelper.WRYH);
//        FontHelper.applyFont(getActivity(), mText1, FontHelper.WRYH);
//        FontHelper.applyFont(getActivity(), mText2, FontHelper.WRYH);
//        FontHelper.applyFont(getActivity(), mText4, FontHelper.WRYH);
//        FontHelper.applyFont(getActivity(), mText5, FontHelper.WRYH);
//        FontHelper.applyFont(getActivity(), mText3, FontHelper.WRYH);
        FontHelper.applyFont(getActivity(), mMarterBnt, FontHelper.WRYH);
        FontHelper.applyFont(getActivity(), mMarterAddress, FontHelper.WRYHL);
    }

    @Override
    protected int layoutRes() {
        return R.layout.marter_fragment;
    }


    //通过网络请求数据，内部封装返回到v层，我们需要的数据（内部指定的数据类型==ShoppingFeileiBean）
    @Override
    public void UpData(T o) {
        mDialog.dismiss();
        ShoppingFeileiBean bean = (ShoppingFeileiBean) o;
        mMerchantsData = bean.getMerchantsData();

        //这里通过bean类拿到一级商品类别的数据  mMerchantsTypeData==烟、酒、女装、男装等等  目前商品类别有8个
        mMerchantsTypeData = bean.getMerchantsTypeData();


//
//
//        if (mMerchantsTypeData.get(1).getTypeName() != null) {
//            Glide.with(getActivity()).load(mMerchantsTypeData.get(1).getOriginalIcon()).into(mImage2);
//            mText2.setText(mMerchantsTypeData.get(1).getTypeName());
//        }
//        if (mMerchantsTypeData.get(2).getTypeName() != null) {
//            Glide.with(getActivity()).load(mMerchantsTypeData.get(2).getOriginalIcon()).into(mImage3);
//            mText3.setText(mMerchantsTypeData.get(2).getTypeName());
//        }
//            else if (mMerchantsTypeData.get(3).getTypeName() != null) {
//                Glide.with(getActivity()).load(mMerchantsTypeData.get(3).getOriginalIcon()).into(mImage4);
//                mText4.setText(mMerchantsTypeData.get(3).getTypeName());
//            } else if (mMerchantsTypeData.get(4).getTypeName() != null) {
//                Glide.with(getActivity()).load(mMerchantsTypeData.get(4).getOriginalIcon()).into(mImage5);
//                mText5.setText(mMerchantsTypeData.get(4).getTypeName());
//            }

       LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        marterRv.setLayoutManager(linearLayoutManager);
        Marter_head_adapter marterHeadAdapter = new Marter_head_adapter(getContext());
        marterHeadAdapter.setData(mMerchantsTypeData);
        marterRv.setAdapter(marterHeadAdapter);
        marterHeadAdapter.setOnItemClickListener(new RecyclerViewListener.OnItemClickListener() {
            @Override
            public void OnItemClick(View v, int position) {
               final ImageView icon= (ImageView) v.findViewById(R.id.iv_icon);
               LinearLayout liner = (LinearLayout) v.findViewById(R.id.liner);
                switch (position){
                    case 0:
                        Toast.makeText(getActivity(),"点击",Toast.LENGTH_LONG).show();
                        //Glide.with(getActivity()).load(mMerchantsTypeData.get(0).getOriginalIcon()).into(icon);
                        mMarterRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
                        adapter = new Marter_Adapter(getActivity(), mMerchantsData);
                        mMarterRecycler.setAdapter(adapter);
                        break;

                    case 1:
                        liner.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event){
                                switch(event.getAction()){
                                    case  MotionEvent.ACTION_DOWN:
                                        Glide.with(getActivity()).load(mMerchantsTypeData.get(1).getCheckIcon()).into(icon);
                                        break;
                                    case  MotionEvent.ACTION_UP:
                                        Glide.with(getActivity()).load(mMerchantsTypeData.get(1).getOriginalIcon()).into(icon);
                                        break;

                                }
                                return true;
                            }
                        });
                        Toast.makeText(getActivity(),"点击2",Toast.LENGTH_LONG).show();
                        //Glide.with(getActivity()).load(mMerchantsTypeData.get(1).getCheckIcon()).into(icon);
                        adapter.setPosition(0);
                        adapter.notifyDataSetChanged();
                        break;
                    case 2:
                        liner.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                switch(event.getAction()){
                                    case  MotionEvent.ACTION_DOWN:
                                        Glide.with(getActivity()).load(mMerchantsTypeData.get(2).getCheckIcon()).into(icon);
                                        break;
                                    case  MotionEvent.ACTION_UP:
                                        Glide.with(getActivity()).load(mMerchantsTypeData.get(2).getOriginalIcon()).into(icon);
                                        break;

                                }
                                return true;
                            }
                        });
                        Toast.makeText(getActivity(),"点击3",Toast.LENGTH_LONG).show();
                        //Glide.with(getActivity()).load(mMerchantsTypeData.get(2).getCheckIcon()).into(icon);
                        adapter.setPosition(1);
                        adapter.notifyDataSetChanged();

                        break;

                    case 3:

                        break;


                }
            }
        });


        for (int i = 0; i < mMerchantsData.size(); i++) {

            if (mMerchantsData.get(i).getMerchantsSellerInfo() == null || mMerchantsData.get(i).getMerchantsSellerInfo().size() == 0) {
                mMerchantsData.remove(i);
                i--;
            }
        }


        mMarterRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new Marter_Adapter(getActivity(), mMerchantsData);
        mMarterRecycler.setAdapter(adapter);

    }


    @OnClick({R.id.marter_chekd, R.id.marter_bnt, R.id.marter_tea4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.marter_bnt:
                startActivity(new Intent(getActivity(), CollaborateActivity.class));
                break;

            case R.id.marter_tea4:

                final View popview = LayoutInflater.from(getActivity()).inflate(R.layout.mermat_popwindow, null);
                AutoUtils.auto(popview);
                ImageView imageView = (ImageView) popview.findViewById(R.id.mermat_popwidow);
                EditText text = (EditText) popview.findViewById(R.id.pop_marter_edit);
                Button button = (Button) popview.findViewById(R.id.pop_marter_bnt);
                FontHelper.applyFont(getActivity(), text, FontHelper.WRYH);
                FontHelper.applyFont(getActivity(), button, FontHelper.WRYH);
                //我要合作的按钮
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(getActivity(), CollaborateActivity.class));
                    }
                });

                GridView gridView = (GridView) popview.findViewById(R.id.pop_gridview);
                Popu_GridView_Adapter adapter2 = new Popu_GridView_Adapter(getActivity(), mMerchantsTypeData);
                gridView.setAdapter(adapter2);
//                popWin = new PopupWindow(popview, 420, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popWin = new PopupWindow(popview, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                //设置点击空白处消失
                popWin.setTouchable(true);
                popWin.setOutsideTouchable(true);
                popWin.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));
                // 设置背景颜色变暗
                WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
                getActivity().getWindow().setAttributes(lp);
                popWin.setOnDismissListener(new PopupWindow.OnDismissListener() {

                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
                        lp.alpha = 1f;
                        getActivity().getWindow().setAttributes(lp);
                    }
                });

                popWin.showAtLocation(mMarterEdit, Gravity.TOP, 100, -22);
                //收起
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popWin.dismiss();
                    }
                });
                //分类gridview点击事件
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        switch (position) {
                            case 0:
                                mMarterRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
                                adapter = new Marter_Adapter(getActivity(), mMerchantsData);
                                mMarterRecycler.setAdapter(adapter);
                                popWin.dismiss();
                                break;
                            case 1:
                                adapter.setPosition(0);
                                adapter.notifyDataSetChanged();
                                popWin.dismiss();
                                break;
                            case 2:
                                adapter.setPosition(1);
                                adapter.notifyDataSetChanged();
                                popWin.dismiss();
                                break;
                            case 3:
                                adapter.setPosition(2);
                                adapter.notifyDataSetChanged();
                                popWin.dismiss();
                                break;
                            case 4:
                                adapter.setPosition(3);
                                adapter.notifyDataSetChanged();
                                popWin.dismiss();
                                break;
                            case 5:
                                adapter.setPosition(4);
                                adapter.notifyDataSetChanged();
                                popWin.dismiss();
                                break;
                            case 6:
//                                adapter.setPosition(5);
//                                adapter.notifyDataSetChanged();
                                popWin.dismiss();
                                break;
                            case 7:
//                                adapter.setPosition(6);
//                                adapter.notifyDataSetChanged();
                                popWin.dismiss();
                                break;
                            case 8:
//                                adapter.setPosition(7);
//                                adapter.notifyDataSetChanged();
                                popWin.dismiss();
                                break;
                            case 9:
//                                adapter.setPosition(8);
//                                adapter.notifyDataSetChanged();
                                popWin.dismiss();
                                break;
                        }
                    }
                });
                break;
            case R.id.marter_chekd:
                if (mMarterChekd.isChecked()) {
                    mMarterAddress.setVisibility(View.VISIBLE);
                    for (Marter_item_Adapter maAdapters : adapter.adapterList) {
                        maAdapters.setBo(true);
                        maAdapters.notifyDataSetChanged();
                    }
                } else {
                    mMarterAddress.setVisibility(View.GONE);
                    for (Marter_item_Adapter maAdapters : adapter.adapterList) {
                        maAdapters.setBo(false);
                        maAdapters.notifyDataSetChanged();
                    }
                }
                break;
        }
    }

    public void zhuanhuan(String string, ImageView iv){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder1 = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder1.unbind();
    }
}
