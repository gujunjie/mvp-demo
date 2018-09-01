package model;

public interface IModel {

    void getUrl(GetUrlListener listener);//model获取数据逻辑，比如获取url

    interface GetUrlListener
    {
        void onSuccess(String data);//获取数据成功回调
        void onFailure(String error);//获取数据失败回调
    }//回调接口

}
