package com.ssmk.module.my.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.utils.FontHelper;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.io.File;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;


public class PersonMessageActivity extends MVPBaseActivity {

    @BindView(R.id.tv_mymessa_tou)
    TextView mTvMymessaTou;
    @BindView(R.id.tv_mymessa_nic)
    TextView mTvMymessaNic;
    @BindView(R.id.img_mymess_title)
    CircleImageView mImgMymessTitle;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.top_iv_back)
    ImageView topIvBack;
    @BindView(R.id.top_tv_other)
    TextView topTvOther;
    @BindView(R.id.ed_name)
    EditText edName;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.rb_girl)
    RadioButton rbGirl;
    @BindView(R.id.rb_boy)
    RadioButton rbBoy;
    @BindView(R.id.ed_email)
    EditText edEmail;
    @BindView(R.id.tv_email)
    TextView tvEmail;
    @BindView(R.id.back_login)
    Button backLogin;
    @BindView(R.id.genter)
    TextView genter;
    @BindView(R.id.email)
    TextView email;
    @BindView(R.id.tv_birth)
    TextView tvBirth;
    private SharedPreferences personInfo;
    Boolean flag = false;
    protected static final int CHOOSE_PICTURE = 0;
    protected static final int TAKE_PICTURE = 1;
    private static final int CROP_SMALL_PICTURE = 2;
    protected static Uri tempUri;
    private UMShareConfig config;
    private UMShareAPI mShareAPI;
    @OnClick({R.id.tv_mymessa_nic, R.id.img_mymess_title, R.id.top_iv_back, R.id.top_tv_other, R.id.back_login})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_mymessa_nic:
                break;
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.back_login:
                if (personInfo.getBoolean("loginState", false)) {
                    personInfo.edit().clear().commit();
                   if (mShareAPI.isAuthorize(this,SHARE_MEDIA.QQ)){
                       mShareAPI.deleteOauth(this,SHARE_MEDIA.QQ,mAuthListener);
                   }else if (mShareAPI.isAuthorize(this,SHARE_MEDIA.WEIXIN)){
                        mShareAPI.deleteOauth(this,SHARE_MEDIA.WEIXIN,mAuthListener);
                    }else {

                    finish();}
                } else {
                    Toast.makeText(this, "当前未登录，操作失败", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.top_tv_other:
                saveData();
                break;
            case R.id.img_mymess_title:
                showChoosePicDialog();
                break;
        }
    }

    private void saveData() {
        flag = !flag;
        changeData(flag);
        personInfo.edit().putString("iconurl", "");
        personInfo.edit().putString("name", edName.getText().toString());
        if (rbGirl.isChecked()) {
            personInfo.edit().putString("gender", "女");
        } else if (rbBoy.isChecked()) {
            personInfo.edit().putString("gender", "男");
        }
        personInfo.edit().putString("email", edEmail.getText().toString());
        personInfo.edit().putString("birth", "");
    }

    private void changeData(Boolean state) {
        if (state) {
            topTvOther.setText("编辑");
            edEmail.setVisibility(View.GONE);
            edName.setVisibility(View.GONE);
        } else {
            topTvOther.setText("保存");
            topTvOther.setVisibility(View.VISIBLE);
            edEmail.setVisibility(View.VISIBLE);
            edName.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void initview() {

        config = new UMShareConfig();
        config.isNeedAuthOnGetUserInfo(true);
        config.isOpenShareEditActivity(true);
        config.setSinaAuthType(UMShareConfig.AUTH_TYPE_SSO);
        config.setFacebookAuthType(UMShareConfig.AUTH_TYPE_SSO);
        config.setShareToLinkedInFriendScope(UMShareConfig.LINKED_IN_FRIEND_SCOPE_ANYONE);

        mShareAPI = UMShareAPI.get(this);
        mShareAPI.setShareConfig(config);

        mTopTvTitle.setText("个人信息");
        topTvOther.setText("保存");
        changeData(flag);
        personInfo = getSharedPreferences("personInfo", MODE_PRIVATE);

        boolean loginState = personInfo.getBoolean("loginState", false);
        String iconurl = personInfo.getString("iconurl", null);
        if (loginState) {
            changeData(loginState);
            tvName.setText(personInfo.getString("name", null));
            if (iconurl == null) {
                mImgMymessTitle.setImageResource(R.mipmap.ic_launcher);
            } else {
                Glide.with(this).load(iconurl).into(mImgMymessTitle);
            }
            String gender = personInfo.getString("gender", null);
            if ("男".equals(gender)) {
                rbBoy.setChecked(true);
            } else {
                rbGirl.setChecked(true);
            }
        }
        setTextWay();
    }

    private void setTextWay() {
        FontHelper.applyFont(this, mTopTvTitle, 5);
        FontHelper.applyFont(this, mTvMymessaTou, 1);
        FontHelper.applyFont(this, mTvMymessaNic, 1);
        FontHelper.applyFont(this, genter, 1);
        FontHelper.applyFont(this, email, 1);
        FontHelper.applyFont(this, tvBirth, 1);
        FontHelper.applyFont(this, edEmail, 1);
        FontHelper.applyFont(this, edName, 1);
        FontHelper.applyFont(this, backLogin, 1);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_my_message;
    }


    /**
     * 显示修改头像的对话框
     */
    protected void showChoosePicDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("设置头像");
        String[] items = {"选择本地照片", "拍照"};
        builder.setNegativeButton("取消", null);
        builder.setItems(items, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case CHOOSE_PICTURE: // 选择本地照片
                        Intent openAlbumIntent = new Intent(
                                Intent.ACTION_GET_CONTENT);
                        openAlbumIntent.setType("image/*");
                        startActivityForResult(openAlbumIntent, CHOOSE_PICTURE);
                        break;
                    case TAKE_PICTURE: // 拍照
                        Intent openCameraIntent = new Intent(
                                MediaStore.ACTION_IMAGE_CAPTURE);
                        tempUri = Uri.fromFile(new File(Environment
                                .getExternalStorageDirectory(), "image.jpg"));
                        // 指定照片保存路径（SD卡），image.jpg为一个临时文件，每次拍照后这个图片都会被替换
                        openCameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, tempUri);
                        startActivityForResult(openCameraIntent, TAKE_PICTURE);
                        break;
                }
            }
        });
        builder.create().show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) { // 如果返回码是可以用的
            switch (requestCode) {
                case TAKE_PICTURE:
                    startPhotoZoom(tempUri); // 开始对图片进行裁剪处理
                    break;
                case CHOOSE_PICTURE:
                    startPhotoZoom(data.getData()); // 开始对图片进行裁剪处理
                    break;
                case CROP_SMALL_PICTURE:
                    if (data != null) {
                        Bundle extras = data.getExtras();
                        Bitmap photo = extras.getParcelable("data");
                        mImgMymessTitle.setImageBitmap(photo);
                    }
                    break;
            }
        }
    }

    /**
     * 裁剪图片方法实现
     *
     * @param uri
     */
    protected void startPhotoZoom(Uri uri) {
        if (uri == null) {
            Log.i("tag", "The uri is not exist.");
        }
        tempUri = uri;
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        // 设置裁剪
        intent.putExtra("crop", "true");
        // aspectX aspectY 是宽高的比例
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        // outputX outputY 是裁剪图片宽高
        intent.putExtra("outputX", 150);
        intent.putExtra("outputY", 150);
        intent.putExtra("return-data", true);
        startActivityForResult(intent, CROP_SMALL_PICTURE);
    }

private UMAuthListener mAuthListener =new UMAuthListener() {
    @Override
    public void onStart(SHARE_MEDIA share_media) {

    }

    @Override
    public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
        finish();
    }

    @Override
    public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
        ToastUtils.showShortToast(throwable.getMessage());
    }

    @Override
    public void onCancel(SHARE_MEDIA share_media, int i) {

    }
};
}
