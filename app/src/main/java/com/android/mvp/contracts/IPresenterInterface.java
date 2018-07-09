package com.android.mvp.contracts;

import com.android.mvp.models.UserModels;

public interface IPresenterInterface {
    void onModelUpdate(String firstName, String lastname);
}
