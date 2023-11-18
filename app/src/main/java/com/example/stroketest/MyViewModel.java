package com.example.stroketest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MyViewModel extends ViewModel {
    //用來儲存症狀編號的集合
    public  MutableLiveData<ArrayList<String>> selectedSymptoms = new MutableLiveData<>(new ArrayList<>());
    public  MutableLiveData<ArrayList<String>> selectedSymptomsText = new MutableLiveData<>(new ArrayList<>());


    //每個症狀按鈕要創建一個變數,代表是否被選取(ON/OFF)
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

    public MutableLiveData<Boolean> pulse0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> pulse992 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse799 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse809 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse806 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse798 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse795 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse807 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse804 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse801 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse810 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> pulse813 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> limb0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> limb202 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> limb1274 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> limb569 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> limb563 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> limb558 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> limb785 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> limb975 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> limb567 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> limb557 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> facial0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> facial68 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> facial348 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> facial325 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> facial323 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> facial327 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> facial330 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> facial356 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> facial272 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> eye0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> eye320 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> eye619 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> eye618 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> eye1008 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> eye621 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> emotional0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> emotional148 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> emotional144 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> emotional130 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> emotional135 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> sleep0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> sleep450 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> sleep441 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> sleep434 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> bowel0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> bowel54 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> bowel32 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> bowel31 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> bowel5 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> digest0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> digest70 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> digest299 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> digest425 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> digest81 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> digest80 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> digest402 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> sweat0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> sweat161 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> sweat386 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> sweat160 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> sweat365 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> sweat432 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> breath0 = new MutableLiveData<>(true);
    public MutableLiveData<Boolean> breath279 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> breath277 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> other511 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> other890 = new MutableLiveData<>(false);
    public MutableLiveData<Boolean> other463 = new MutableLiveData<>(false);



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
