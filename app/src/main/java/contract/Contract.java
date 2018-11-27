package contract;

public interface Contract {


    //契约接口存放model view presenter三个层的接口，方便管理，业务逻辑一目了然


    interface Model {
        void getImageUrl(onGetImageUrlListener listener);
    }

    interface onGetImageUrlListener
    {
        void getImageUrlSuccess(String url);
        void getImageUrlFailure(String message);
    }


    interface View {

        void showImage(String imageUrl);

        void showError(String message);


    }

    interface Presenter {

        void getImageUrl();
    }
}
