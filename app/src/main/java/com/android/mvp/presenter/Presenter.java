package com.android.mvp.presenter;

import android.content.Context;

import com.android.mvp.contracts.IPresenterInterface;
import com.android.mvp.contracts.IViewInterface;
import com.android.mvp.models.UserModels;

public class Presenter implements IViewInterface {

    UserModels userModels;
    IPresenterInterface iPresenterInterface;

    public Presenter(Context context) {
        iPresenterInterface = (IPresenterInterface) context;
        userModels = new UserModels();
    }


    @Override
    public void onClick(String firstName, String lastName) {
        userModels.setFirstName(firstName); //Update the Model
        userModels.setLastName(lastName);

        //Retreive the model data and notify the view
        iPresenterInterface.onModelUpdate(userModels.getFirstName(),userModels.getLastName());
    }
}
