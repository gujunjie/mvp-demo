package view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.abc.myapplication28.BaseActivity;
import com.example.abc.myapplication28.BasePresenter;
import com.example.abc.myapplication28.R;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import presenter.Presenter;


public class MainActivity extends BaseActivity<IView,Presenter> implements IView {

    //实现各种ui显示操作，数据的获取一概不理，交给presenter

    @BindView(R.id.btn_showImage)
    Button btnShowImage;
    @BindView(R.id.iv_image)
    ImageView ivImage;

    Presenter presenter;

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


    @Override
    public void showImage(String url) {
        Glide.with(this).load(url).into(ivImage);
    }

    @OnClick(R.id.btn_showImage)
    public void onViewClicked() {
        presenter.getUrl();
    }
}
