package com.aiocen.iconpack.drops.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dm.material.dashboard.candybar.activities.CandyBarMuzeiActivity;
import com.aiocen.iconpack.drops.services.MuzeiService;

public class MuzeiActivity extends CandyBarMuzeiActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initMuzeiActivity(savedInstanceState, MuzeiService.class);
    }
}
