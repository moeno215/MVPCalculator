package com.example.maulana.quiz11octhbd.Base;

import com.example.maulana.quiz11octhbd.Calculate.view.CalculateView;

public interface BasePresenter <T extends CalculateView> extends CalculateView {
    void onAttach(T v);
    void onDetach();
}
