package com.example.stroketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String resultNumber = intent.getStringExtra("resultNumber");
        TextView resultTextView = findViewById(R.id.resultPageText);
        resultTextView.setText(resultNumber);


        TextView selectedSyndrome = findViewById(R.id.selectedSyndrome);
        TextView acupuncturePrescription = findViewById(R.id.AcupuncturePrescription);
        TextView medicinePrescription = findViewById(R.id.MedicinePrescription);
        Button syndromesButton1 = findViewById(R.id.SyndromesButton1);
        Button syndromesButton2 = findViewById(R.id.SyndromesButton2);
        Button syndromesButton3 = findViewById(R.id.SyndromesButton3);
        Button syndromesButton4 = findViewById(R.id.SyndromesButton4);
        Button syndromesButton5 = findViewById(R.id.SyndromesButton5);
        Button syndromesButton6 = findViewById(R.id.SyndromesButton6);
        Button syndromesButton7 = findViewById(R.id.SyndromesButton7);
        Button syndromesButton8 = findViewById(R.id.SyndromesButton8);
        Button syndromesButton9 = findViewById(R.id.SyndromesButton9);

        //處理 從activity_differ過來的資訊(選擇的按鈕)
        switch (resultNumber){
            case "肝陽暴亢":
                selectedSyndrome.setText("肝陽暴亢");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：翳風、地倉、頰車、四神聰、風池");
                medicinePrescription.setText("天麻5錢、鉤藤5錢、生石決明1兩、川牛膝6錢、黃芩4錢、山梔4錢、夏枯草4錢、益母草6錢、海藻5錢、全蠍2錢");
                break;
            case "風痰阻絡":
                selectedSyndrome.setText("風痰阻絡");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：翳風、地倉、頰車、四神聰、風池、水溝、內關");
                medicinePrescription.setText("白附子3錢、石菖蒲3錢、遠志2錢、天麻4錢、全蠍2錢、木香2錢、甘草2錢、丹參5錢、赤芍3錢、當歸4錢、地龍3錢。");
                break;
            case "痰熱腑實":
                selectedSyndrome.setText("痰熱腑實");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：百會、陽陵泉、行間、豐隆");
                medicinePrescription.setText("大黃3-5錢、芒硝3錢、全瓜蔞5-10錢、膽南星2-3錢");
                break;
            case "氣虛血瘀":
                selectedSyndrome.setText("氣虛血瘀");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：內關、神門、風池、下關、四白、攢竹");
                medicinePrescription.setText("黃耆1-4兩、當歸4錢、赤芍5錢、川芎5錢、桃仁4錢、紅花3錢、地龍4錢");
                break;
            case "陰虛風動":
                selectedSyndrome.setText("陰虛風動");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：內關、神門、勞宮、三陰交、百會、湧泉");
                medicinePrescription.setText("龍骨1兩(先煎)、牡蠣1兩(先煎)、代赭石1兩(先煎)、龜甲6錢(先煎)、白芍5錢、玄參5錢、天冬4錢、川牛膝1兩、川棟子4錢、茵陳6錢、麥芽5錢、鉤藤5錢、菊花4錢");
                break;
            case "風火蔽竅":
                selectedSyndrome.setText("風火蔽竅");
                acupuncturePrescription.setText("主要：內關、人中、三陰交。副穴：極泉、尺澤、委中\n隨證：地倉、頰車、下關、迎香、四白、陽白、翳風");
                medicinePrescription.setText("羚羊角粉、石决明、代赭石、菊花、黄芩、夏枯草、鉤藤、龟板、白芍、丹皮、天竺黄");
                break;
            case "痰火閉竅":
                selectedSyndrome.setText("痰火閉竅");
                acupuncturePrescription.setText("主要：內關、人中、三陰交。副穴：極泉、尺澤、委中\n隨證：印堂、曲差、本神、八邪、曲池、合谷、足三里、外關、關元、太溪、廉泉");
                medicinePrescription.setText("羚羊角1兩 、 珍珠母1兩，竹茹4錢、天竺黃5錢、石菖蒲3錢、遠志2錢、夏枯草4錢、丹皮5錢");
                break;
            case "痰濕蒙竅":
                selectedSyndrome.setText("痰濕蒙竅");
                acupuncturePrescription.setText("主要：內關、人中、三陰交。副穴：極泉、尺澤、委中\n隨證：承漿、地倉、太溪、曲池、外關、合谷、極泉、陽輔、風池、廉泉");
                medicinePrescription.setText("半夏4錢、陳皮3錢、茯苓5錢、膽南星4錢、竹茹4錢、石菖蒲3錢。");
                break;
            case "元氣衰敗":
                selectedSyndrome.setText("元氣衰敗");
                acupuncturePrescription.setText("主要：內關、人中、三陰交。副穴：極泉、尺澤、委中\n隨證：中極、曲骨、關元、秩邊、陰陵泉、關元、三陰交、太溪、四神聰、廉泉、合谷、極泉、外關、陽輔、地倉、風池");
                medicinePrescription.setText("人參2-3錢、制附子3-5錢");
                break;
            default:
                acupuncturePrescription.setText("Error");
                medicinePrescription.setText("Error");
        }


        syndromesButton1.setOnClickListener(new View.OnClickListener() {    //肝陽暴亢
            @Override
            public void onClick(View v) {
                selectedSyndrome.setText("肝陽暴亢");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：翳風、地倉、頰車、四神聰、風池");
                medicinePrescription.setText("天麻5錢、鉤藤5錢、生石決明1兩、川牛膝6錢、黃芩4錢、山梔4錢、夏枯草4錢、益母草6錢、海藻5錢、全蠍2錢");
            }
        });
        syndromesButton2.setOnClickListener(new View.OnClickListener() {    //風痰阻絡
            @Override
            public void onClick(View v) {
                selectedSyndrome.setText("風痰阻絡");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：翳風、地倉、頰車、四神聰、風池、水溝、內關");
                medicinePrescription.setText("白附子3錢、石菖蒲3錢、遠志2錢、天麻4錢、全蠍2錢、木香2錢、甘草2錢、丹參5錢、赤芍3錢、當歸4錢、地龍3錢。");
            }
        });
        syndromesButton3.setOnClickListener(new View.OnClickListener() {    //痰熱腑實
            @Override
            public void onClick(View v) {
                selectedSyndrome.setText("痰熱腑實");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：百會、陽陵泉、行間、豐隆");
                medicinePrescription.setText("大黃3-5錢、芒硝3錢、全瓜蔞5-10錢、膽南星2-3錢");
            }
        });
        syndromesButton4.setOnClickListener(new View.OnClickListener() {    //氣虛血瘀
            @Override
            public void onClick(View v) {
                selectedSyndrome.setText("氣虛血瘀");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：內關、神門、風池、下關、四白、攢竹");
                medicinePrescription.setText("黃耆1-4兩、當歸4錢、赤芍5錢、川芎5錢、桃仁4錢、紅花3錢、地龍4錢");
            }
        });
        syndromesButton5.setOnClickListener(new View.OnClickListener() {    //陰虛風動
            @Override
            public void onClick(View v) {
                selectedSyndrome.setText("陰虛風動");
                acupuncturePrescription.setText("主要：極泉、曲池、外關、合谷、後溪、環跳、足三里、陽輔、俠溪、太衝\n隨證：內關、神門、勞宮、三陰交、百會、湧泉");
                medicinePrescription.setText("龍骨1兩(先煎)、牡蠣1兩(先煎)、代赭石1兩(先煎)、龜甲6錢(先煎)、白芍5錢、玄參5錢、天冬4錢、川牛膝1兩、川棟子4錢、茵陳6錢、麥芽5錢、鉤藤5錢、菊花4錢");
            }
        });
        syndromesButton6.setOnClickListener(new View.OnClickListener() {    //風火蔽竅
            @Override
            public void onClick(View v) {
                selectedSyndrome.setText("風火蔽竅");
                acupuncturePrescription.setText("主要：內關、人中、三陰交。副穴：極泉、尺澤、委中\n隨證：地倉、頰車、下關、迎香、四白、陽白、翳風");
                medicinePrescription.setText("羚羊角粉、石决明、代赭石、菊花、黄芩、夏枯草、鉤藤、龟板、白芍、丹皮、天竺黄");
            }
        });
        syndromesButton7.setOnClickListener(new View.OnClickListener() {    // 痰火閉竅
            @Override
            public void onClick(View v) {
                selectedSyndrome.setText("痰火閉竅");
                acupuncturePrescription.setText("主要：內關、人中、三陰交。副穴：極泉、尺澤、委中\n隨證：印堂、曲差、本神、八邪、曲池、合谷、足三里、外關、關元、太溪、廉泉");
                medicinePrescription.setText("羚羊角1兩 、 珍珠母1兩，竹茹4錢、天竺黃5錢、石菖蒲3錢、遠志2錢、夏枯草4錢、丹皮5錢");
            }
        });
        syndromesButton8.setOnClickListener(new View.OnClickListener() {    //痰濕蒙竅
            @Override
            public void onClick(View v) {
                selectedSyndrome.setText("痰濕蒙竅");
                acupuncturePrescription.setText("主要：內關、人中、三陰交。副穴：極泉、尺澤、委中\n隨證：承漿、地倉、太溪、曲池、外關、合谷、極泉、陽輔、風池、廉泉");
                medicinePrescription.setText("半夏4錢、陳皮3錢、茯苓5錢、膽南星4錢、竹茹4錢、石菖蒲3錢。");
            }
        });
        syndromesButton9.setOnClickListener(new View.OnClickListener() {    //元氣衰敗
            @Override
            public void onClick(View v) {
                selectedSyndrome.setText("元氣衰敗");
                acupuncturePrescription.setText("主要：內關、人中、三陰交。副穴：極泉、尺澤、委中\n隨證：中極、曲骨、關元、秩邊、陰陵泉、關元、三陰交、太溪、四神聰、廉泉、合谷、極泉、外關、陽輔、地倉、風池");
                medicinePrescription.setText("人參2-3錢、制附子3-5錢");
            }
        });
    }
}