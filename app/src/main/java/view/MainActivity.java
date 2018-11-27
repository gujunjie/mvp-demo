package view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.abc.myapplication28.R;

import base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import contract.Contract;
import presenter.Presenter;

public class MainActivity extends BaseActivity<Contract.View,Presenter> implements Contract.View{


    //实现各种ui显示操作，数据的获取一概不理，交给presenter
    @BindView(R.id.iv_image)
    ImageView ivImage;

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @Override
    public Presenter createPresenter() {
        presenter=new Presenter(this);
        return presenter;
    }


    @OnClick(R.id.btn_showImage)
    public void onViewClicked() {
        presenter.getImageUrl();
    }

    @Override
    public void showImage(String imageUrl) {
        Glide.with(this).load(imageUrl).into(ivImage);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
