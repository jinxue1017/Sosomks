

package com.ssmk.module.shoppingcar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.ssmk.R;
import com.ssmk.base.WzMVPBaseFragment;
import com.ssmk.module.login.Login_main_Activity;
import com.ssmk.module.shoppingcar.adapter.ShopExpandableAdapter;
import com.ssmk.module.shoppingcar.bean.CompileBean;
import com.ssmk.module.shoppingcar.bean.ShopsOrderBean;
import com.ssmk.module.shoppingcar.bean.TestBean;
import com.ssmk.module.shoppingcar.bean.TestGoodsBean;
import com.ssmk.module.shoppingcar.bean.TestShopsBean;
import com.ssmk.module.shoppingcar.module.MessageEvent;
import com.ssmk.module.shoppingcar.presenter.ShoppingCarPresenter;
import com.ssmk.utlis.CustomProgressDialog;

import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import static com.ssmk.R.id.btnCollect;
import static com.ssmk.R.id.btnSettle;
import static com.ssmk.R.id.shoppingcar_rl;


/**
 * 功能描述  :
 * 创建时间 : 2017/8/15 11:12
 * 编写人  :  王成哲
 */

public class ShoppingCarFragment extends WzMVPBaseFragment<Object> implements ShopExpandableAdapter.CheckInterface,
        ShopExpandableAdapter.ModifyCountInterface, ShopExpandableAdapter.GroupEdtorListener{


    @BindView(R.id.line)//购物车无数据
            ImageView mLine;
    @BindView(R.id.empty_iv)//购物车无数据显示的图片
            ImageView mEmptyIv;
    @BindView(R.id.btn_gohome)//购物车无数据 跳转首页的按钮
            Button mBtnGohome;
    @BindView(R.id.shoppingcar_empty)//购物车为空的时候展示的布局
            LinearLayout mShoppingcarEmpty;
    @BindView(R.id.cbSelectAll)//全选
            CheckBox mCbSelectAll;
    @BindView(R.id.tvSelectAll)//全选的字体
            TextView mTvSelectAll;
    @BindView(R.id.btnCollect)//进入编辑状态的收藏按钮
            Button mBtnCollect;
    @BindView(R.id.btnDelete)//进入编辑状态对的删除按钮
            Button mBtnDelete;
    @BindView(R.id.llbottom_Edit)//进入编辑状态的布局 默认是goen 隐藏
            LinearLayout mLlbottomEdit;
    @BindView(R.id.shoppingcar_rl_jiesuan) //结算布局
            RelativeLayout mJieSuan;
    @BindView(R.id.rl_layou_log_in)  //跳转Log布局
            RelativeLayout mRlLogin;
    @BindView(R.id.car_login_bt)  //跳转Log按钮
            Button mBtLogin;
    @BindView(R.id.tvCountMoney)//总价
            TextView mTvCountMoney;
    @BindView(R.id.btnSettle)//去结算
            Button mBtnSettle;
    @BindView(R.id.shopping_rlBottom)//全选.支付.删除.收藏.的整体布局
            RelativeLayout mRlBottom;


    @BindView(R.id.expandableListView)//用于显示主信息 的二级列表
            ExpandableListView mExpandableListView;
    @BindView(shoppingcar_rl)//保函整布局的RelativeLayout 包括二级类表
            RelativeLayout mShoppingcarRl;
    @BindView(R.id.top_iv_back)//引用头部局 的返回键
            ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)//引用头部局的标题
    TextView mTopTvTitle;
    @BindView(R.id.top_tv_other)//
    TextView mTopTvOther;
    @BindView(R.id.shipping_car_tvEdit)//头布局的编辑按钮
    TextView mCarTvEdit;
    Unbinder unbinder;
    List<TestShopsBean>groups =new ArrayList<>();//商铺数据
    List<TestGoodsBean>goods =new ArrayList<>();//商品数据
    private Map<String, List<TestGoodsBean>> children =
            new HashMap<String, List<TestGoodsBean>>();// 子元素数据列表
    private ShoppingCarPresenter mPresenter;
    private ShopExpandableAdapter mAdapter;
    private int flag = 0;
    private double totalPrice = 0.00;// 购买的商品总价
    private int totalCount = 0;// 购买的商品总数量
    private CustomProgressDialog mDialog;



    @Subscribe()
    public void XXX(MessageEvent messageEvent) {
        mRlLogin.setVisibility(View.GONE);
        mPresenter.GetDataModel();
    }

    @Override
    protected void initdata() {
        mPresenter = new ShoppingCarPresenter(getActivity(), this);
        mPresenter.GetDataModel();
        //设置二级类表适配什么的
        setAdapter();
    }

    private void setAdapter() {

        mAdapter = new ShopExpandableAdapter(getActivity(), groups , goods,mLlbottomEdit,mJieSuan);
        //设置适配器
        mAdapter.setCheckInterface(this);// 关键步骤1,设置复选框接口
        mAdapter.setModifyCountInterface(this);// 关键步骤2,设置数量增减接口
        mAdapter.setmListener(this);
        mExpandableListView.setAdapter(mAdapter);
        //设置列表默认全部展开
        for(int i = 0; i < groups.size(); i++){
            mExpandableListView.expandGroup(i);
        }
        //设置父节点(章目录)不可点击
        mExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return false;
            }
        });
        //去除父节点图标
        mExpandableListView.setGroupIndicator(null);
    }

    @Override
    protected void initView() {
        mBtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Login_main_Activity.class);
                startActivity(intent);

            }
        });
        mBtnGohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb = (RadioButton) getActivity().findViewById(R.id.home_rb_home);
                rb.setChecked(true);
            }
        });

        mDialog = new CustomProgressDialog(getActivity(), "", R.drawable.emptyloadanim);
        mDialog.show();
        WindowManager windowManager = getActivity().getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        WindowManager.LayoutParams lp = mDialog.getWindow().getAttributes();
        lp.width = display.getWidth(); //设置宽度
        lp.height = display.getHeight() - 380;
        mDialog.getWindow().setAttributes(lp);

    }

    @Override
    protected int layoutRes() {
        return R.layout.shoppingcar_fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void succeed(Object o,int tag) {

        mDialog.dismiss();
        switch (tag){
            case 1:

                if (o instanceof Boolean){//判断是否是登录状态
                    mShoppingcarRl.setVisibility(View.GONE);
                    mRlLogin.setVisibility(View.VISIBLE);
                    return;
                }
                TestBean testBean=(TestBean) o;

                if (testBean.getGroup()==null||testBean.getGroup().size()==0){
                    mCarTvEdit.setVisibility(View.GONE);
                    mShoppingcarEmpty.setVisibility(View.VISIBLE);
                    mShoppingcarRl.setVisibility(View.GONE);
                    return;
                }
                mCarTvEdit.setVisibility(View.VISIBLE);
                mShoppingcarRl.setVisibility(View.VISIBLE);
                mRlLogin.setVisibility(View.GONE);


                groups.clear();//清空集合


                List<TestShopsBean> group = testBean.getGroup();
                groups.addAll(group);
                for (TestShopsBean testbean :group) {
                    for (int i = 0; i <group.size() ; i++) {
                        goods.addAll(group.get(i).getGoods()) ;
                        children.put(String.valueOf(group.get(i).getSellerId()),group.get(i).getGoods());
                        groups.get(i).setEdtor(flag==0?false:true);
                    }
                }

                mAdapter.notifyDataSetChanged();
                //设置列表默认全部展开
                for(int i = 0; i < groups.size(); i++){
                    mExpandableListView.expandGroup(i);
                }
                break;

            case 2:
                mPresenter.GetDataModel();
                break;
                case 3:
                    LogUtils.e("完成---------->","更新成功！@");

                break;

        }



    }

    @Override
    public void error(Object o, int tag) {

        LogUtils.e("更新失败！——————————>","嫉妒我的才华");
    }


    @Override
    public void onResume() {
        super.onResume();
        setCartNum();
    }

    /**
     * 设置购物车产品数量
     */
    private void setCartNum() {
        int count = 0;
        for (int i = 0; i < groups.size(); i++) {
            groups.get(i).setChoosed(mCbSelectAll.isChecked());
            TestShopsBean group = groups.get(i);
            List<TestGoodsBean> childs = children.get(String.valueOf(group.getSellerId()));
            for (TestGoodsBean goodsInfo : childs) {
                count += 1;
            }
        }

        //购物车已清空
        if(count==0){
            clearCart();
        } else{
            mTopTvTitle.setText("购物车" + "(" + count + ")");
        }
    }

    private void clearCart() {
        mTopTvTitle.setText("购物车" + "(" + 0 + ")");
//        mLlbottomEdit.setVisibility(View.VISIBLE);
//        mJieSuan.setVisibility(View.GONE);
        mCbSelectAll.setChecked(false);
        if (groups==null)
        mShoppingcarEmpty.setVisibility(View.VISIBLE);
    }
    /**
     * 删除操作<br>
     * 1.不要边遍历边删除，容易出现数组越界的情况<br>
     * 2.现将要删除的对象放进相应的列表容器中，待遍历完后，以removeAll的方式进行删除
     */
    protected void doDelete() {
        List<TestShopsBean> toBeDeleteGroups = new ArrayList<>();// 待删除的组元素列表
        Map<String, String> map = new HashMap<>();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < groups.size(); i++) {
            TestShopsBean group = groups.get(i);
            if (group.isChoosed()) {
                toBeDeleteGroups.add(group);
            }
            List<TestGoodsBean> toBeDeleteProducts = new ArrayList<>();// 待删除的子元素列表
            List<TestGoodsBean> childs = children.get(String.valueOf(group.getSellerId()));
            for (int j = 0; j < childs.size(); j++) {
                if (childs.get(j).isChoosed()) {
                    toBeDeleteProducts.add(childs.get(j));
                        sb.append(","+childs.get(j).getCartId());
                }
            }

            childs.removeAll(toBeDeleteProducts);
        }
        if (sb.length()>0) {
            sb.deleteCharAt(0);
        }
        groups.removeAll(toBeDeleteGroups);


        map.put("cartIds",sb.toString());
        mPresenter.postDeleteCar(2,map);
        //记得重新设置购物车
        setCartNum();
        mAdapter.notifyDataSetChanged();

    }

    /**
     * 增加购物车数量
     * @param groupPosition 组元素位置
     * @param childPosition 子元素位置
     * @param showCountView 用于展示变化后数量的View
     * @param isChecked     子元素选中与否
     */
    @Override
    public void doIncrease(int groupPosition, int childPosition,
                           View showCountView, boolean isChecked) {
        TestGoodsBean product = (TestGoodsBean) mAdapter.getChild(groupPosition,
                childPosition);
        int currentCount = product.getGoodsNumber();
        currentCount++;
        product.setGoodsNumber(currentCount);
        ((TextView) showCountView).setText(currentCount + "");
        mAdapter.notifyDataSetChanged();
        calculate();
    }

    /**
     * 减少购物车数量
     * @param groupPosition 组元素位置
     * @param childPosition 子元素位置
     * @param showCountView 用于展示变化后数量的View
     * @param isChecked     子元素选中与否
     */
    @Override
    public void doDecrease(int groupPosition, int childPosition,
                           View showCountView, boolean isChecked) {

        TestGoodsBean product = (TestGoodsBean) mAdapter.getChild(groupPosition,
                childPosition);
        int currentCount = product.getGoodsNumber();
        if (currentCount == 1)
            return;
        currentCount--;
        product.setGoodsNumber(currentCount);
        ((TextView) showCountView).setText(currentCount + "");
        mAdapter.notifyDataSetChanged();
        calculate();
    }

    @Override
    public void childDelete(int groupPosition, int childPosition) {
        children.get(groups.get(groupPosition).getSellerId()).remove(childPosition);
        TestShopsBean group = groups.get(groupPosition);
        List<TestGoodsBean> childs = children.get(group.getSellerId());
        if (childs.size() == 0) {
            groups.remove(groupPosition);
        }
        mAdapter.notifyDataSetChanged();
        //     handler.sendEmptyMessage(0);
        calculate();
    }

    @Override
    public void checkGroup(int groupPosition, boolean isChecked) {
        TestShopsBean group = groups.get(groupPosition);
        List<TestGoodsBean> childs = children.get(String.valueOf(group.getSellerId()));
        for (int i = 0; i < childs.size(); i++) {
            childs.get(i).setChoosed(isChecked);
        }
        if (isAllCheck())
            mCbSelectAll .setChecked(true);
        else
            mCbSelectAll.setChecked(false);
        mAdapter.notifyDataSetChanged();
        calculate();
    }

    @Override
    public void checkChild(int groupPosition, int childPosiTion,
                           boolean isChecked) {
        boolean allChildSameState = true;// 判断改组下面的所有子元素是否是同一种状态
        TestShopsBean group = groups.get(groupPosition);
        List<TestGoodsBean> childs = children.get(String.valueOf(group.getSellerId()));
        for (int i = 0; i < childs.size(); i++) {
            // 不全选中
            if (childs.get(i).isChoosed() != isChecked) {
                allChildSameState = false;
                break;
            }
        }
        //获取店铺选中商品的总金额
        if (allChildSameState) {
            group.setChoosed(isChecked);// 如果所有子元素状态相同，那么对应的组元素被设为这种统一状态
        } else {
            group.setChoosed(false);// 否则，组元素一律设置为未选中状态
        }

        if (isAllCheck()) {
            mCbSelectAll.setChecked(true);// 全选
        } else {
            mCbSelectAll.setChecked(false);// 反选
        }
        mAdapter.notifyDataSetChanged();
        calculate();

    }

    private boolean isAllCheck() {

        for (TestShopsBean group : groups) {
            if (!group.isChoosed())
                return false;

        }

        return true;
    }

    /**
     * 全选与反选
     */
    private void doCheckAll() {
        for (int i = 0; i < groups.size(); i++) {
            groups.get(i).setChoosed(mCbSelectAll.isChecked());
            TestShopsBean group = groups.get(i);
            List<TestGoodsBean> childs = children.get(String.valueOf(group.getSellerId()));
            for (int j = 0; j < childs.size(); j++) {
                childs.get(j).setChoosed(mCbSelectAll.isChecked());
            }
        }
        mAdapter.notifyDataSetChanged();
        calculate();
    }

    /**
     * 统计操作<br>
     * 1.先清空全局计数器<br>
     * 2.遍历所有子元素，只要是被选中状态的，就进行相关的计算操作<br>
     * 3.给底部的textView进行数据填充
     */
    private void calculate() {
        totalCount = 0;
        totalPrice = 0.00;
        for (int i = 0; i < groups.size(); i++) {
            TestShopsBean group = groups.get(i);
            List<TestGoodsBean> childs = children.get(String.valueOf(group.getSellerId()));
            for (int j = 0; j < childs.size(); j++) {
                TestGoodsBean product = childs.get(j);
                if (product.isChoosed()) {
                    totalCount++;
                    totalPrice += product.getGoodsPrice() * product.getGoodsNumber();
                }
            }
        }

        mTvCountMoney.setText("￥" + totalPrice);
        mBtnSettle.setText("去结算(" + totalCount + ")");
        //计算购物车的金额为0时候清空购物车的视图
        if(totalCount==0){
            setCartNum();
        } else{
            mTopTvTitle.setText("购物车" + "(" + totalCount + ")");
        }
    }

    @OnClick({R.id.cbSelectAll, R.id.btnDelete, R.id.shipping_car_tvEdit, R.id.btnSettle, btnCollect})
    public void onClick(View view) {
        AlertDialog alert;
        switch (view.getId()) {
            case R.id.cbSelectAll:
                doCheckAll();
                break;
            case R.id.btnDelete:
                if (totalCount == 0) {
                    Toast.makeText(getActivity(), "请选择要移除的商品", Toast.LENGTH_LONG).show();
                    return;
                }
                alert = new AlertDialog.Builder(getActivity()).create();
                alert.setTitle("操作提示");
                alert.setMessage("您确定要将这些商品从购物车中移除吗？");
                alert.setButton(DialogInterface.BUTTON_NEGATIVE, "取消",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                return;
                            }
                        });
                alert.setButton(DialogInterface.BUTTON_POSITIVE, "确定",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                doDelete();
                            }
                        });
                alert.show();
                break;
            case btnSettle:
                if (totalCount == 0) {
                    Toast.makeText(getActivity(), "您还没有选择商品哦！", Toast.LENGTH_LONG).show();
                    return;
                }
                ArrayList<ShopsOrderBean>list0=new ArrayList<>();
                for (int i = 0; i < groups.size(); i++)
                {
                    ShopsOrderBean shopsOrderBean = new ShopsOrderBean();
                    String sellerName = groups.get(i).getSellerName();
                    int sellerId = groups.get(i).getSellerId();
                    List<TestGoodsBean> goods = groups.get(i).getGoods();
                    shopsOrderBean.setSellerName(sellerName);
                    shopsOrderBean.setSellerId(sellerId);
                    List<ShopsOrderBean.CommodityInfoListBean>goods0=new ArrayList<>();
                    for (int j = 0; j <goods.size(); j++)
                        {
                            ShopsOrderBean.CommodityInfoListBean
                                    commodityInfoListBean = new ShopsOrderBean.CommodityInfoListBean();
                                commodityInfoListBean.setGoodsId(goods.get(j).getGoodsId());
                            commodityInfoListBean.setCartId(goods.get(j).getCartId());
                            commodityInfoListBean.setGoodsName(goods.get(j).getGoodsName());
                            commodityInfoListBean.setGoodsCode(goods.get(j).getGoodsCode());
                            commodityInfoListBean.setSkuId(goods.get(j).getSkuId());
                            commodityInfoListBean.setGoodsFormatId(goods.get(j).getGoodsFormatId());
                            commodityInfoListBean.setSizeNumberId(goods.get(j).getSizeNumberId());
                            commodityInfoListBean.setGoodsPrice(goods.get(j).getGoodsPrice());
                            commodityInfoListBean.setFreight(goods.get(j).getFreight());
                            commodityInfoListBean.setPurchaseSize(goods.get(j).getGoodsNumber());
                        }
                    shopsOrderBean.setCommodityInfoList(goods0);
                    list0.add(shopsOrderBean);

                    Intent intent=new Intent(getActivity(),OrderActivity.class);

                    intent.putExtra("arr",list0);
                    startActivity(intent);
                }

                break;

            case R.id.btnCollect:
                        if (totalCount==0){
                            Toast.makeText(getActivity(), "请选择要收藏的商品", Toast.LENGTH_LONG).show();
                        }
                Toast.makeText(getActivity(), "收藏商品成功", Toast.LENGTH_LONG).show();
                break;


            case R.id.shipping_car_tvEdit:
                if (flag == 0) {
                    mJieSuan.setVisibility(View.GONE);
                    mLlbottomEdit.setVisibility(View.VISIBLE);
                    mCarTvEdit.setText("完成");
                    for (int i=0; i<groups.size();i++){
                        groups.get(i).setEdtor(true);
                    }
                } else if (flag == 1) {
                    mJieSuan.setVisibility(View.VISIBLE);
                    mLlbottomEdit.setVisibility(View.GONE);

                    mCarTvEdit.setText("编辑");
                    List<CompileBean>list=new ArrayList<>();
                    for (int i=0; i<groups.size();i++){
                        groups.get(i).setEdtor(false);
                        List<TestGoodsBean> goods = groups.get(i).getGoods();
                        for (int j = 0; j < goods.size(); j++)
                        {
                            CompileBean compileBean = new CompileBean();
                            compileBean.setCartId(goods.get(j).getCartId());
                            compileBean.setSellerId(String.valueOf(groups.get(i).getSellerId()));
                            compileBean.setSellerName(String.valueOf(groups.get(i).getSellerName()));
                            compileBean.setGoodsId(String.valueOf(goods.get(j).getGoodsId()));
                            compileBean.setGoodsName(String.valueOf(goods.get(j).getGoodsName()));
                            compileBean.setGoodsCode(String.valueOf(goods.get(j).getGoodsCode()));
                            compileBean.setGoodsFormatId(String.valueOf(goods.get(j).getGoodsFormatId()));
                            compileBean.setSizeNumberId(String.valueOf(goods.get(j).getSizeNumberId()));
                            compileBean.setGoodsNumber(String.valueOf(goods.get(j).getGoodsNumber()));
                            list.add(compileBean);
                        }
                    }

                    Gson gson=new Gson();
                    String json = gson.toJson(list);
                    mPresenter.upDataShoppingCar(json,3);

                    }
                flag = (flag + 1) % 2;//其余得到循环执行上面2个不同的功能

                mAdapter.notifyDataSetChanged();

                break;




        }
    }


    @Override
    public void groupEdit(int groupPosition) {
        groups.get(groupPosition).setEdtor(true);
        mAdapter.notifyDataSetChanged();
    }

//    Handler handler = new Handler() {
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            //删除购物车后动态改变数量
//            setCartNum();
//        }
//    };

    @Override
    public void onDestroy() {
        super.onDestroy();
        mAdapter=null;
        groups.clear();
        totalPrice=0;
        totalCount=0;
        children.clear();
    }

}
