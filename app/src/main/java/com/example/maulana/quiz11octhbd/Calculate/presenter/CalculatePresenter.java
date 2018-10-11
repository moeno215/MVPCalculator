package com.example.maulana.quiz11octhbd.Calculate.presenter;

import android.widget.Button;
import android.widget.EditText;

import com.example.maulana.quiz11octhbd.Base.BasePresenter;
import com.example.maulana.quiz11octhbd.Calculate.view.CalculateView;

public class CalculatePresenter implements BasePresenter<CalculateView> {

    private CalculateView calculateView;
    private double result;

    public void plus(String bil1, String bil2) {
        if (!bil1.equals("") && !bil2.equals("")) {
            result = Double.parseDouble(bil1) + Double.parseDouble(bil2);
            calculateView.onSuccess("Result is " + result);
        } else {
            calculateView.onError("Number can't be null");
        }
    }

    public void minus(String bil1, String bil2) {
        if (!bil1.equals("") && !bil2.equals("")) {
            result = Double.parseDouble(bil1) - Double.parseDouble(bil2);
            calculateView.onSuccess("Result is " + result);
        } else {
            calculateView.onError("Number can't be null");
        }
    }

    public void times(String bil1, String bil2) {
        if (!bil1.equals("") && !bil2.equals("")) {
            result = Double.parseDouble(bil1) * Double.parseDouble(bil2);
            calculateView.onSuccess("Result is " + result);
        } else {
            calculateView.onError("Number can't be null");
        }
    }

    public void divides(String bil1, String bil2) {
        if (!bil1.equals("") && !bil2.equals("")) {
            result = Double.parseDouble(bil1) / Double.parseDouble(bil2);
            calculateView.onSuccess("Result is " + result);
        } else {
            calculateView.onError("Number can't be null");
        }
    }

    @Override
    public void onAttach(CalculateView v) {
        calculateView = v;
    }

    @Override
    public void onDetach() {

        calculateView = null;
    }

    @Override
    public void onError(String msg) {

    }

    @Override
    public void onSuccess(String result) {

    }

    @Override
    public void onAttachView() {

    }

    @Override
    public void onDetachView() {

    }
}

