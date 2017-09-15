package com.ssmk.module.shoppingcar.adapter;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.ssmk.R;
import com.ssmk.module.shoppingcar.bean.GoodsAttributeBean;
import com.ssmk.module.shoppingcar.bean.TestGoodsBean;
import com.ssmk.module.shoppingcar.bean.TestShopsBean;
import com.ssmk.module.shoppingcar.module.LayoutBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/15 11:12
 * 编写人  :  王成哲
 */
public class ShopExpandableAdapter extends BaseExpandableListAdapter{
    private Context context;
    private List<TestShopsBean> groups;
    private List<TestGoodsBean> goods;
    private CheckInterface checkInterface;
    private ModifyCountInterface modifyCountInterface;
    public int flag = 0;
    private GroupEdtorListener mListener;
    LinearLayout mline;
    RelativeLayout relativeLayout;

    public GroupEdtorListener getmListener() {
        return mListener;
    }

    public void setmListener(GroupEdtorListener mListener) {
        this.mListener = mListener;
    }
    int count=0;

    public void setModifyCountInterface(ModifyCountInterface modifyCountInterface) {
        this.modifyCountInterface = modifyCountInterface;
    }
    public void setCheckInterface(CheckInterface checkInterface) {
        this.checkInterface = checkInterface;
    }


    public ShopExpandableAdapter(Context context, List<TestShopsBean> groups, List<TestGoodsBean> goods,LinearLayout mline,RelativeLayout relativeLayout) {
        this.context=context;
        this.groups=groups;
        this.goods=goods;
        this.mline=mline;
        this.relativeLayout=relativeLayout;
    }

    @Override
    public int getGroupCount() {
        return groups.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return groups.get(groupPosition).getGoods().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groups.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return groups.get(groupPosition).getGoods().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groups.get(groupPosition).getSellerId();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return   0;
//                Long.valueOf(groups.get(groupPosition).getGoods().get(childPosition).getGoodsId()

    }

    @Override
    public boolean hasStableIds(){
        return false;
    }

    @Override
    public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        final GroupViewHolder gholder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.shoppingcar_group_item, null);
            gholder = new GroupViewHolder(convertView);
            convertView.setTag(gholder);
        } else {
            gholder = (GroupViewHolder) convertView.getTag();
        }
        final TestShopsBean group = (TestShopsBean) getGroup(groupPosition);
        gholder.tvSourceName.setText(group.getSellerName());

        gholder.determineChekbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                group.setChoosed(((CheckBox) v).isChecked());
                checkInterface.checkGroup(groupPosition, ((CheckBox) v).isChecked());// 暴露组选接口
            }
        });

        gholder.determineChekbox.setChecked(group.isChoosed());

        notifyDataSetChanged();

        return convertView;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
         final ChildViewHolder cholder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.shoppingcar_child_item, null);
            cholder = new ChildViewHolder(convertView);
            convertView.setTag(cholder);
        } else {
            cholder = (ChildViewHolder) convertView.getTag();
        }
        LayoutBean.relativeLayout=cholder.rlNoEdtor ;
        LayoutBean.mline=cholder.llEdtor;


        final TestGoodsBean goods = groups.get(groupPosition).getGoods().get(childPosition);
        if (goods != null) {
            cholder.tvPrice.setText("￥" + goods.getGoodsPrice() + "");
            cholder.tvBuyNum.setText("X "+goods.getGoodsNumber() + "");
            cholder.etNum.setText(goods.getGoodsNumber()+"");
            Gson gson=new Gson();
            GoodsAttributeBean goodsAttributeBean = gson.fromJson(goods.getSkuInfo(), GoodsAttributeBean.class);
            if (goodsAttributeBean.getCommodityFormat().getGoodsFormatName()==""&&goodsAttributeBean.getCommoditySizeJson().getSizeNumberName()==""){
                cholder.tvIntro.setText("颜色："+" 暂无 " + " 尺码："+"暂无" );

            }else {
                cholder.tvIntro.setText("颜色："+goodsAttributeBean.getCommodityFormat().getGoodsFormatName() + " " + " 尺码："+goodsAttributeBean.getCommoditySizeJson().getSizeNumberName() );
            }cholder.tvGoodsName.setText(goods.getGoodsName());
            //设置打折价格
            SpannableString spanString = new SpannableString("￥" + String.valueOf(goods.getDiscountPrice()));
            StrikethroughSpan span = new StrikethroughSpan();
            spanString.setSpan(span, 0, String.valueOf(goods.getDiscountPrice()).length() + 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            //避免无限次的appand
            if (cholder.tvDiscountPrice.getText().toString().length() > 0) {
                cholder.tvDiscountPrice.setText("");
            }
            cholder.tvDiscountPrice.append(spanString);

            cholder.checkBox.setChecked(goods.isChoosed());


            /*
            * */
            //判断状态
            if (groups.get(groupPosition).isEdtor()){
                cholder.llEdtor.setVisibility(View.VISIBLE);
                cholder.rlNoEdtor.setVisibility(View.GONE);
            }else {
                cholder.llEdtor.setVisibility(View.GONE);
                cholder.rlNoEdtor.setVisibility(View.VISIBLE);
            }
            cholder.checkBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goods.setChoosed(((CheckBox) v).isChecked());
                    cholder.checkBox.setChecked(((CheckBox) v).isChecked());
                    checkInterface.checkChild(groupPosition, childPosition, ((CheckBox) v).isChecked());// 暴露子选接口
                }
            });
            cholder.btAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    modifyCountInterface.doIncrease(groupPosition, childPosition, cholder.etNum, cholder.checkBox.isChecked());// 暴露增加接口
                }
            });
            cholder.btReduce.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    modifyCountInterface.doDecrease(groupPosition, childPosition, cholder.etNum, cholder.checkBox.isChecked());// 暴露删减接口
                }
            });

                    notifyDataSetChanged();
        }

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }



    /**
     * 组元素绑定器
     */
    static class GroupViewHolder {
        @BindView(R.id.s_adapter_group_cbCheckGroup)
        CheckBox determineChekbox;
        @BindView(R.id.s_adapter_group_tvShopNameGroup)
        TextView tvSourceName;
//        @BindView(R.id.s_adapter_group_tvEdit)
//        TextView tvStoreEdtor;

        GroupViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    /**
     * 子元素绑定器
     */
    static class ChildViewHolder {

        @BindView(R.id.s_adapter_cb_CheckChild)
        CheckBox checkBox;
        @BindView(R.id.s_adapter_iv_Goods)
        ImageView ivAdapterListPic;
        @BindView(R.id.s_adapter_tv_GoodsParam)
        TextView tvIntro;
        //        @BindView(R.id.tv_color_size)
//        TextView tvColorSize;
        @BindView(R.id.s_adapter_tv_GoodsPrice)
        TextView tvPrice;
        @BindView(R.id.s_adapter_tv_discount_price)
        TextView tvDiscountPrice;
        @BindView(R.id.s_adapter_tv_GoodsNum)
        TextView tvBuyNum;
        @BindView(R.id.s_adapter_rl_GoodInfo)
        RelativeLayout rlNoEdtor;

        @BindView(R.id.s_adapter_iv_Reduce)
        TextView btReduce;
        @BindView(R.id.s_adapter_tv_GoodsNum2)
        TextView etNum;
        @BindView(R.id.s_adapter_iv_Add)
        TextView btAdd;
//                @BindView(R.id.ll_change_num)
//        RelativeLayout llChangeNum;
//        @BindView(R.id.tv_colorsize)
//        TextView tvColorsize;
        @BindView(R.id.s_adapter_tv_GoodsName)
        TextView tvGoodsName;
        @BindView(R.id.s_adapter_ll_EditStatus)
        LinearLayout llEdtor;

        //@BindView(R.id.stub)
//        ViewStub stub;
        ChildViewHolder(View view) {
            ButterKnife.bind(this, view);

        }

    }


    /**
     * 复选框接口
     */
    public interface CheckInterface {
        /**
         * 组选框状态改变触发的事件
         *
         * @param groupPosition 组元素位置
         * @param isChecked     组元素选中与否
         */
        void checkGroup(int groupPosition, boolean isChecked);

        /**
         * 子选框状态改变时触发的事件
         *
         * @param groupPosition 组元素位置
         * @param childPosition 子元素位置
         * @param isChecked     子元素选中与否
         */
        void checkChild(int groupPosition, int childPosition, boolean isChecked);
    }

    /**
     * 改变数量的接口
     */
    public interface ModifyCountInterface {
        /**
         * 增加操作
         *
         * @param groupPosition 组元素位置
         * @param childPosition 子元素位置
         * @param showCountView 用于展示变化后数量的View
         * @param isChecked     子元素选中与否
         */
        void doIncrease(int groupPosition, int childPosition, View showCountView, boolean isChecked);

        /**
         * 删减操作
         *
         * @param groupPosition 组元素位置
         * @param childPosition 子元素位置
         * @param showCountView 用于展示变化后数量的View
         * @param isChecked     子元素选中与否
         */
        void doDecrease(int groupPosition, int childPosition, View showCountView, boolean isChecked);

        /**
         * 删除子item
         *
         * @param groupPosition
         * @param childPosition
         */
        void childDelete(int groupPosition, int childPosition);
    }

    /**
     * 监听编辑状态
     */
    public interface GroupEdtorListener {
        void groupEdit(int groupPosition);
    }

    /**
     * 使某个组处于编辑状态
     * <p/>
     * groupPosition组的位置
     */
    class GroupViewClick implements View.OnClickListener {
        private int groupPosition;
        private TextView edtor;
        private TestShopsBean group;

        public GroupViewClick(int groupPosition, TextView edtor, TestShopsBean group) {
            this.groupPosition = groupPosition;
            this.edtor = edtor;
            this.group = group;
        }

        @Override
        public void onClick(View v) {
            int groupId = v.getId();
            if (groupId == edtor.getId()) {
                if (group.isEdtor()) {
                    group.setEdtor(false);
                    //更新购物车

                } else {
                    group.setEdtor(true);
                }
                notifyDataSetChanged();
            }
        }


    }


}
