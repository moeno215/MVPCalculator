package com.example.maulana.quiz11octhbd.Calculate.view;

import com.example.maulana.quiz11octhbd.Base.BaseView;

public interface CalculateView extends BaseView {

        void onError(String msg);

        void onSuccess(String result);
}
