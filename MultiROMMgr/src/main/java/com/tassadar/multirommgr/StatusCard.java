package com.tassadar.multirommgr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.fima.cardsui.objects.Card;


public class StatusCard extends Card {

    public StatusCard(String title) {
        super(title);
    }

    @Override
    public View getCardContent(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.status_card, null);
        StatusAsyncTask.instance().setStatusCardLayout(view);
        return view;
    }
}
