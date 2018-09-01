package model;

public class Model implements IModel {

   //获取数据操作,本地数据，数据库操作，网络加载，比如获取url
    @Override
    public void getUrl(GetUrlListener listener) {
        String url="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1535726878048&di=cd52d6b80af6e538b137836f294d98c2&imgtype=0&src=http%3A%2F%2Fattach.zhiyoo.com%2Fforum%2F201303%2F30%2F16392363kvt13er39xk1k3.jpg";

        listener.onSuccess(url);
        listener.onFailure(url);
    }
}
