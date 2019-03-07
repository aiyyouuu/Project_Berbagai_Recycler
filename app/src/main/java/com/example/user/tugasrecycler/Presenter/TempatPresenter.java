package com.example.user.tugasrecycler.Presenter;

import android.content.Context;

import com.example.user.tugasrecycler.View.MainView;
import com.example.user.tugasrecycler.Model.TempatModel;
import com.example.user.tugasrecycler.R;

import java.util.ArrayList;
import java.util.List;

public class TempatPresenter {
    Context context;
    List<TempatModel> tempatModels = new ArrayList<>();
    MainView view;
    public TempatPresenter(MainView view, Context context){
        this.view=view;
        this.context=context;
    }

    public void setData(){
        TempatModel destinasi;
        destinasi= new TempatModel("ALSACE", R.drawable.alsace);
        tempatModels.add(destinasi);
        destinasi= new TempatModel("CENTRAL PARK",R.drawable.centralpark);
        tempatModels.add(destinasi);
        destinasi= new TempatModel("GRAND CANYON",R.drawable.grandcanyon);
        tempatModels.add(destinasi);
        destinasi= new TempatModel("MALDIVES",R.drawable.maldives);
        tempatModels.add(destinasi);
        destinasi= new TempatModel("YANGSHUO",R.drawable.yangshuo);
        tempatModels.add(destinasi);
        destinasi= new TempatModel("BIG BEN",R.drawable.bigben);
        tempatModels.add(destinasi);
        destinasi= new TempatModel("LONDON EYE",R.drawable.londoneye);
        tempatModels.add(destinasi);
        destinasi= new TempatModel("NIAGARA FALLS",R.drawable.niagarafalls);
        tempatModels.add(destinasi);
        view.onSuccess(tempatModels);
    }
}
