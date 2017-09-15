package com.ssmk.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.bean.PopowindBean;
import com.ssmk.module.merchant.bean.PopwinTwoBean;
import com.ssmk.module.merchant.bean.PopwindFourBean;
import com.ssmk.module.merchant.bean.PopwindThreeBean;
import com.ssmk.module.merchant.bean.ShoppingInpoBean;
import com.ssmk.module.merchant.view.DetailsActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 20:51
 * 邮箱：17600157003@163.com
 * 商品列表展示页面
 */

public class Shopping_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<ShoppingInpoBean.DataBean> mDataBeanList=new ArrayList<>();
    private List<PopowindBean.DataBean> mPopwindBeanList=new ArrayList<>();
    private List<PopwinTwoBean.DataBean>mpopwinTwoBean=new ArrayList<>();
    private List<PopwindThreeBean.DataBean>mpopWinThreeBean=new ArrayList<>();
    private List<PopwindFourBean.DataBean>mpopWinFourBean=new ArrayList<>();
    private Context context;

    public Shopping_adapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setmDataBeanList(List<ShoppingInpoBean.DataBean> list) {
        if (list!=null){
            this.mDataBeanList=list;
        }


    }
    public void setmPopwindBeanList(List<PopowindBean.DataBean>  mPopwindBeanList){
        if (mPopwindBeanList!=null){
            this.mPopwindBeanList=mPopwindBeanList;
        }


    }
    public void setmPopwindThreeBeanList(List<PopwindThreeBean.DataBean>  mPopwindThreeBeanList){
        if (mPopwindBeanList!=null){
            this.mpopWinThreeBean=mPopwindThreeBeanList;
        }


    }
    public void setmPopwindTwoBeanList(List<PopwinTwoBean.DataBean>  mPopwindTwoBeanList){
        if (mPopwindBeanList!=null){
            this.mpopwinTwoBean=mPopwindTwoBeanList;
        }


    }
    public void setmPopwindFourBeanList(List<PopwindFourBean.DataBean>  mPopwindFourBeanList){
        if (mPopwindBeanList!=null){
            this.mpopWinFourBean=mPopwindFourBeanList;
        }


    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.shopping_adapter_item, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder adapter = (ViewHolder) holder;
        adapter.shoppingAdapterInpo.setText(mDataBeanList.get(position).getMasterType());
        //商品列表条目点击跳转到商品详情
        adapter.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, DetailsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataBeanList!=null?mDataBeanList.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.shopping_adapter_iv)
        ImageView shoppingAdapterIv;
        @BindView(R.id.shopping_adapter_inpo)
        TextView shoppingAdapterInpo;
        @BindView(R.id.shopping_adapter_price)
        TextView shoppingAdapterPrice;
        @BindView(R.id.shopping_adapter_liji)
        Button shoppingAdaoterLiji;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            FontHelper.applyFont(mContext,shoppingAdapterInpo, FontHelper.PFR);
            FontHelper.applyFont(mContext,shoppingAdapterPrice, FontHelper.PFR);
            FontHelper.applyFont(mContext,shoppingAdaoterLiji, FontHelper.PFR);
        }
    }
}
