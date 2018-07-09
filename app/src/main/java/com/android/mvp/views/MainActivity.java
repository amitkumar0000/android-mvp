package com.android.mvp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.mvp.R;
import com.android.mvp.contracts.IPresenterInterface;
import com.android.mvp.contracts.IViewInterface;
import com.android.mvp.models.UserModels;
import com.android.mvp.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IPresenterInterface {

    EditText firstName, lastName;
    IViewInterface iViewInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = findViewById(R.id.firstnametext);
        lastName = findViewById(R.id.lastnametext);

        iViewInterface = new Presenter(this);
    }

    //Notify the presenter about user input notification
    public void click(View view){
        iViewInterface.onClick(String.valueOf(firstName.getText()),
                String.valueOf(lastName.getText()));
    }


    @Override
    public void onModelUpdate(String firstName, String lastname) {
        Toast.makeText(this,firstName+" "+lastname,Toast.LENGTH_LONG).show();
    }
}
