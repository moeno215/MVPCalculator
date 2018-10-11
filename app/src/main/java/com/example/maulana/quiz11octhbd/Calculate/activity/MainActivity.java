package com.example.maulana.quiz11octhbd.Calculate.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.maulana.quiz11octhbd.Calculate.presenter.CalculatePresenter;
import com.example.maulana.quiz11octhbd.Calculate.view.CalculateView;
import com.example.maulana.quiz11octhbd.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements CalculateView {

    @BindView(R.id.et2)
    EditText et2;
    @BindView(R.id.et1)
    EditText et1;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.btnbagi)
    Button btnbagi;
    @BindView(R.id.btnkali)
    Button btnkali;
    @BindView(R.id.btnkurang)
    Button btnkurang;
    @BindView(R.id.btntambah)
    Button btntambah;
    private CalculatePresenter presenter;
    String num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new CalculatePresenter();
        onAttachView();
    }


    @OnClick({R.id.button, R.id.btnbagi, R.id.btnkali, R.id.btnkurang, R.id.btntambah})
    public void onViewClicked(View view) {

        num1 = et1.getText().toString();
        num2 = et2.getText().toString();
        switch (view.getId()) {
            case R.id.button:

                et1.setText("");
                et2.setText("");
                et1.requestFocus();
                break;
            case R.id.btnbagi:
                presenter.divides(num1, num2);

                break;
            case R.id.btnkali:

                presenter.times(num1, num2);

                break;
            case R.id.btnkurang:
                presenter.minus(num1, num2);


                break;
            case R.id.btntambah:
                presenter.plus(num1, num2);


                break;
        }
    }

    public void onAttachView() {
        presenter.onAttach(this); }

    @Override
    public void onDetachView() {

    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        Log.e("Result: ", msg);
    }

    @Override
    public void onSuccess(String result) {

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        Log.e("Result: ", result);

    }
}
