package model;

import contract.Contract;

public class Model implements Contract.Model {


    @Override
    public void getImageUrl(Contract.onGetImageUrlListener listener) {

        String imageUrl="https://tse3-mm.cn.bing.net/th?id=OIP.7zpPIggqqGXPj3bwt43WEQHaEo&w=243&h=160&c=7&o=5&dpr=1.4&pid=1.7";


        if(imageUrl!=null)
        {
            listener.getImageUrlSuccess(imageUrl);
        }else
        {
            listener.getImageUrlFailure("获取数据失败");
        }



    }
}
