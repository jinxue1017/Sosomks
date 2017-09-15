package com.ssmk.module.merchant.view;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.liaoinstan.springview.widget.SpringView;
import com.ssmk.R;
import com.ssmk.adapter.ShoppingAdaoter;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.Presenter.MerShoppingPresenter;
import com.ssmk.module.merchant.Presenter.PopwinPrestenThree;
import com.ssmk.module.merchant.Presenter.PopwindPresenter;
import com.ssmk.module.merchant.Presenter.PopwindPresetertwo;
import com.ssmk.module.merchant.Presenter.PopwindPresterFour;
import com.ssmk.module.merchant.Presenter.ShangpinPrestenser;
import com.ssmk.module.merchant.bean.GoodsBean;
import com.ssmk.module.merchant.bean.PopBeans;
import com.ssmk.module.merchant.bean.PopowindBean;
import com.ssmk.module.merchant.bean.PopwinTwoBean;
import com.ssmk.module.merchant.bean.PopwindFourBean;
import com.ssmk.module.merchant.bean.PopwindThreeBean;
import com.ssmk.module.merchant.bean.ShangpinBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 14:22
 * 邮箱：17600157003@163.com
 */
public class Shopping_Activity extends MVPBaseActivity implements View.OnClickListener {
    @BindView(R.id.shopping_finsh)
    ImageView mShoppingFinsh;
    @BindView(R.id.shopping_edit)
    EditText mShoppingEdit;
    @BindView(R.id.shopping_menu)
    ImageView mShoppingMenu;
    @BindView(R.id.shopping_recycler)
    RecyclerView mShoppingRecycler;
    @BindView(R.id.shipping_card)
    CardView shippingCard;
    @BindView(R.id.textinput)
    TextView textinput;
    @BindView(R.id.shopping_zonghe)
    Button shoppingZonghe;
    @BindView(R.id.shopping_price)
    Button shoppingPrice;
    @BindView(R.id.shopping_xiaoliang)
    Button shoppingXiaoliang;
    @BindView(R.id.shipping_spview)
    SpringView shoppingSpview;


    private PopupWindow popWin;
    private RecyclerView recyclerView;
    private List<PopBeans> list = new ArrayList<>();
    private ShoppingAdaoter mAdapter;
    private List<GoodsBean.DataBean> mData=new ArrayList<>();
    private PopwindPresenter popwindPresenter;
    private PopwindPresetertwo popwindPresetertwo;
    private PopwinPrestenThree popwinPrestenThree;
    private PopwindPresterFour popwindPresterFour;
    private TextView pop_liebiao_tv2;
    private TextView pop_liebiao_tv3;
    private TextView pop_liebiao_tv4;
    private TextView pop_liebiao_tv5;
    private List<GoodsBean.DataBean> goodsBean;
    private List<PopowindBean.DataBean> mlistpopwindBean;
    private List<PopwinTwoBean.DataBean> mlistpopwindtwoBean;
    private List<PopwindThreeBean.DataBean> mlistpopwindthreeBean;
    private List<PopwindFourBean.DataBean> mlistpopwindfourBean;
    private List<ShangpinBean.DataBean> mshangpindata;
    private String type;
    private String type1;
    private String type2;
    private String type3;
    @Override
    protected void initview(){
        popwindPresenter=new PopwindPresenter(this,this);
        popwindPresetertwo=new PopwindPresetertwo(this,this);
        popwinPrestenThree=new PopwinPrestenThree(this,this);
        popwindPresterFour =new PopwindPresterFour(this,this);
        FontHelper.applyFont(Shopping_Activity.this,shoppingZonghe, FontHelper.WRYHL);
        FontHelper.applyFont(Shopping_Activity.this,shoppingPrice, FontHelper.WRYHL);
        FontHelper.applyFont(Shopping_Activity.this,shoppingXiaoliang, FontHelper.WRYHL);
        String id = getIntent().getStringExtra("id");
        if(id!=null){
        final MerShoppingPresenter inpo = new MerShoppingPresenter(id,this,this);
        inpo.GetDataModel();
        //recyclerview的上拉刷新
        shoppingSpview.setType(SpringView.Type.FOLLOW);
        shoppingSpview.setGive(SpringView.Give.TOP);
        shoppingSpview.setHeader(new ShoppingRefreshHead());
        shoppingSpview.setFooter(new ShoppingLoadFooter());
        shoppingSpview.setListener(new SpringView.OnFreshListener(){
            @Override
            public void onRefresh(){
                inpo.GetDataModel();
            }
            @Override
            public void onLoadmore() {
                inpo.GetDataModel();
            }
        });
    }
    }
    @OnClick({R.id.shopping_zonghe, R.id.shopping_price,R.id.shopping_xiaoliang})
    public void sortClick(View view){
        switch (view.getId()){
            case R.id.shopping_zonghe://综合
                mAdapter.notifyDataSetChanged();
                break;
            case R.id.shopping_price://价格
                priceSort();
                break;
            case R.id.shopping_xiaoliang://销量
                salesSort();
                break;
        }
    }
    /**
     * 按照价格排序
     */
    private void priceSort(){
        Collections.sort(mData,new Comparator<GoodsBean.DataBean>() {
            @Override
            public int compare(GoodsBean.DataBean o1, GoodsBean.DataBean o2) {

                return (int) (Float.valueOf(o2.getDiscountPrice())-Float.valueOf(o1.getDiscountPrice()));
            }
        });

        mAdapter.notifyDataSetChanged();
    }
    /**
     * 按照销量排序
     */
    private void salesSort() {
        Collections.sort(mData,new Comparator<GoodsBean.DataBean>() {
            @Override
            public int compare(GoodsBean.DataBean o1, GoodsBean.DataBean o2) {

                return (int) (Float.valueOf(o2.getGoodsSales())-Float.valueOf(o1.getGoodsSales()));
            }
        });

        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void initdata(){
        ShangpinPrestenser shangpin=new ShangpinPrestenser(this,this);
        shangpin.setId(110);
       /* PopBeans popBeans = new PopBeans();
        popBeans.setLiebiao("全部");
        list.add(popBeans);
        PopBeans popBeans2 = new PopBeans();
        popBeans2.setLiebiao("分类一");
        list.add(popBeans2);
        PopBeans popBeans3 = new PopBeans();
        popBeans3.setLiebiao("分类二");
        list.add(popBeans3);
        PopBeans popBeans4 = new PopBeans();
        popBeans4.setLiebiao("分类三");
        list.add(popBeans4);
        PopBeans popBeans5 = new PopBeans();
        popBeans5.setLiebiao("分类四");
        list.add(popBeans5);*/

    }
    @Override
    protected int layoutRes() {
        return R.layout.shopping_activity;
    }
    //数据返回成功
    @Override
    public void UpData(Object o){
        if (o instanceof GoodsBean){
            GoodsBean bean = (GoodsBean) o;
            goodsBean = bean.getData();
            mShoppingRecycler.setLayoutManager(new GridLayoutManager(this, 2));
            mAdapter = new ShoppingAdaoter(this);
            mAdapter.setDataGoodsBean(goodsBean);
            mShoppingRecycler.setAdapter(mAdapter);
            mAdapter.notifyDataSetChanged();
           shoppingSpview.onFinishFreshAndLoad();
        }else if (o instanceof PopowindBean){
            PopowindBean popowindBean= (PopowindBean) o;
            List<PopowindBean.DataBean> mlistpopwindBean = popowindBean.getData();
            mShoppingRecycler.setLayoutManager(new GridLayoutManager(this, 2));
            mAdapter = new ShoppingAdaoter(this);
            mAdapter.setDataPopowindBean(mlistpopwindBean);
        }else if (o instanceof PopwinTwoBean){
            PopwinTwoBean popowindtwoBean= (PopwinTwoBean) o;
            mlistpopwindtwoBean = popowindtwoBean.getData();
            mShoppingRecycler.setLayoutManager(new GridLayoutManager(this, 2));
            mAdapter = new ShoppingAdaoter(this);
            mAdapter.setDataPopwinTwoBean(mlistpopwindtwoBean);
        }else if (o instanceof PopwindThreeBean){
            PopwindThreeBean popowindthrerBean= (PopwindThreeBean) o;
            mlistpopwindthreeBean = popowindthrerBean.getData();
            mShoppingRecycler.setLayoutManager(new GridLayoutManager(this, 2));
            mAdapter = new ShoppingAdaoter(this);
            mAdapter.setDataPopwindThreeBean(mlistpopwindthreeBean);
        }else if(o instanceof PopwindFourBean){
            PopwindFourBean popowindfourBean= (PopwindFourBean) o;
            mlistpopwindfourBean = popowindfourBean.getData();
            mShoppingRecycler.setLayoutManager(new GridLayoutManager(this, 2));
            mAdapter = new ShoppingAdaoter(this);
            mAdapter.setDataPopwindFourBean(mlistpopwindfourBean);
        }else if(o instanceof ShangpinBean){
            ShangpinBean shangpinBean= (ShangpinBean) o;
            mshangpindata = shangpinBean.getData();
            type = mshangpindata.get(0).getMasterType();
            type1 = mshangpindata.get(1).getMasterType();
            type2 = mshangpindata.get(2).getMasterType();
            type3 = mshangpindata.get(3).getMasterType();
            Log.d("type", "UpData: "+type+"  "+type1+"  "+type2);


        }

    }

    @OnClick({R.id.shopping_finsh, R.id.shopping_menu,R.id.shopping_edit})
    public void onViewClicked(View view){
        switch (view.getId()) {
            case R.id.shopping_edit:
                mShoppingEdit.setFocusableInTouchMode(true);
                break;
            case R.id.shopping_finsh:
                finish();
                break;
            case R.id.shopping_menu:
                View popupView = getLayoutInflater().inflate(R.layout.popumenu, null);
                pop_liebiao_tv2 = (TextView) popupView.findViewById(R.id.pop_liebiao_tv2);
                pop_liebiao_tv3 = (TextView) popupView.findViewById(R.id.pop_liebiao_tv3);
                pop_liebiao_tv4 = (TextView) popupView.findViewById(R.id.pop_liebiao_tv4);
                pop_liebiao_tv5 = (TextView) popupView.findViewById(R.id.pop_liebiao_tv5);
                pop_liebiao_tv2.setOnClickListener(this);
                pop_liebiao_tv3.setOnClickListener(this);
                pop_liebiao_tv4.setOnClickListener(this);
                pop_liebiao_tv5.setOnClickListener(this);
                pop_liebiao_tv2.setText(type,null);
                pop_liebiao_tv3.setText(type1,null);
                pop_liebiao_tv4.setText(type2,null);
                pop_liebiao_tv5.setText(type3);
                popWin = new PopupWindow(popupView, 420, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                //设置点击空白处消失
                popWin.setTouchable(true);
                popWin.setOutsideTouchable(true);
                popWin.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
                // 设置背景颜色变暗
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.alpha = 0.4f;
                getWindow().setAttributes(lp);
                popWin.setOnDismissListener(new PopupWindow.OnDismissListener() {

                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp = getWindow().getAttributes();
                        lp.alpha = 1f;
                        getWindow().setAttributes(lp);
                    }
                });
              // popWin.showAtLocation(mShoppingMenu, Gravity.RIGHT,0,0);
               popWin.showAsDropDown(mShoppingMenu, 0, -10, Gravity.RIGHT);
                break;
        }
    }

//弹框的条目监听
    @Override
    public void onClick(View v){
        switch (v.getId()){
        case R.id.pop_liebiao_tv2:
            popwindPresenter.setId(35);
            shoppingSpview.onFinishFreshAndLoad();
            popWin.dismiss();
            break;
        case R.id.pop_liebiao_tv3:
            popwindPresetertwo.setId(36);
            shoppingSpview.onFinishFreshAndLoad();
             popWin.dismiss();
            break;
        case R.id.pop_liebiao_tv4:
             popwinPrestenThree.setId(36);
             popWin.dismiss();
            break;
        case R.id.pop_liebiao_tv5:
            popwindPresterFour.setId(36);
             popWin.dismiss();
            break;

    }
    }
}
