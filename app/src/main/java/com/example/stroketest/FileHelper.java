package com.example.stroketest;
import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import android.os.Environment;

public class FileHelper {

    private static final String FILE_NAME = "selectedSymptoms.txt";

    // 儲存症狀集合到外部存儲中的文本文件
    public static void saveToFile(Context context, ArrayList<String> symptomList) {
        if (isExternalStorageWritable()) {
            File file = new File(context.getExternalFilesDir(null), FILE_NAME);
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(file, true);
                fos.write(("症狀集合：" + "\n").getBytes());
                for (String symptom : symptomList) {
                    fos.write((symptom + "\n").getBytes());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }



    // 確認外部存儲是否可寫
    public static boolean isExternalStorageWritable() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }



}