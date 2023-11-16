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

    public MutableLiveData<Boolean> tongue0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> tongue1024 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue1170 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue826 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue823 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue832 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue848 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue827 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue831 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue838 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue825 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue1042 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue1011 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue829 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue846 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue842 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue1016 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> tongue824 = new MutableLiveData<>(false);

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
