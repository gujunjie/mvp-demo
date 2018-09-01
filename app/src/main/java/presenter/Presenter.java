package presenter;

import com.example.abc.myapplication28.BasePresenter;

import model.IModel;
import model.Model;
import view.IView;

public class Presenter extends BasePresenter<IView> implements IModel.GetUrlListener {
    //用户交互时通知model获取数据并返回，然后通过回调让view显示数据

    IView iView;
    IModel iModel;//model和view的引用

    public Presenter(IView iView)
    {
        this.iView=iView;
        iModel=new Model();
    }
    public void getUrl()
    {
        iModel.getUrl(this);
    }
    @Override
    public void onSuccess(String data) {
        iView.showImage(data);
    }
    @Override
    public void onFailure(String error) {

    }
}
