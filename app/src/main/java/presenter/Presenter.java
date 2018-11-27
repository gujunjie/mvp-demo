package presenter;

import base.BasePresenter;
import contract.Contract;
import model.Model;

public class Presenter extends BasePresenter<Contract.View>implements Contract.Presenter,Contract.onGetImageUrlListener {

    private Contract.View iView;

    private Contract.Model iModel;

    public Presenter(Contract.View iView)
    {
        this.iView=iView;
        iModel=new Model();
    }


    @Override
    public void getImageUrl() {
        iModel.getImageUrl(this);
    }

    @Override
    public void getImageUrlSuccess(String url) {
           iView.showImage(url);
    }

    @Override
    public void getImageUrlFailure(String message) {
           iView.showError(message);
    }
}
