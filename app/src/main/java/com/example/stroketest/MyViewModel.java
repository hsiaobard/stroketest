package com.example.stroketest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MyViewModel extends ViewModel {
    //用來儲存症狀編號的集合
    public  MutableLiveData<ArrayList<String>> selectedSymptoms = new MutableLiveData<>(new ArrayList<>());
    public  MutableLiveData<ArrayList<String>> selectedSymptomsText = new MutableLiveData<>(new ArrayList<>());


    //每個症狀按鈕要創建一個變數,代表是否被選取(ON/OFF)
    public MutableLiveData<Boolean> pulse0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> pulse123 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse456 = new MutableLiveData<>(false);

    public MutableLiveData<Boolean> mouse0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> mouse789 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> mouse81 = new MutableLiveData<>(false);

    public MutableLiveData<Boolean> upperlimb0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> upperlimb1289 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> upperlimb1291 = new MutableLiveData<>(false);

    public void toggle(MutableLiveData<Boolean> symptom, String symptomNumber, String symptomText){ //symptom->症狀是否被選取的變數， symptomNumber->症狀的編號(存在按鈕的text值)
        symptom.setValue(!symptom.getValue());
        if(!symptomNumber.equals("0")){ //0代表正常，不需要記錄編號
            if(symptom.getValue().equals(true)){
                selectedSymptoms.getValue().add(symptomNumber);
                selectedSymptomsText.getValue().add(symptomText);
            }else{
                selectedSymptoms.getValue().remove(symptomNumber);
                selectedSymptomsText.getValue().remove(symptomText);
            }
        }
    }
}
