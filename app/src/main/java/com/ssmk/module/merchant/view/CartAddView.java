package com.ssmk.module.merchant.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.module.merchant.Presenter.CartMainLink;

/**
 * 类描述：
 * 创建人：lenovo
 * 创建时间：2017/8/10 16:37
 */

public class CartAddView extends LinearLayout implements View.OnClickListener {
    private CartMainLink mainLink;
    private int num = 0;
    private TextView carJian;
    private TextView darNum;
    private TextView carjia;

    public void setMainLink(CartMainLink mainLink) {
        this.mainLink = mainLink;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        darNum.setText(getNum());
    }

    public CartAddView(Context context) {
        this(context,null);
    }

    public CartAddView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CartAddView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = View.inflate(context, R.layout.caraddview,this);
        carJian = (TextView) view.findViewById(R.id.carad_jian);
        darNum = (TextView) view.findViewById(R.id.carad_num);
        carjia = (TextView) view.findViewById(R.id.carad_jia);
        carJian.setOnClickListener(this);
        carjia.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){//View点击事件选择使用
            case R.id.carad_jian:
                if (num>0){
                num--;
                    darNum.setText(num+"");
                }
                mainLink.onCartLink(num);
            break;
            case R.id.carad_jia:
                if (num<20){
                    num++;
                    darNum.setText(num+"");
                }
                mainLink.onCartLink(num);
                break;
            default :
            break;
        }
    }
}
