package differentiator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/**
 * Differentiators
 */
public class differentiator {
	//用來裝所有證候物件的list
	private Syndrome_List syndrome_list;
	//這個病症辨證器的分群的權重
	private Parameter Parameter;
	/**
	 * Will read the data from the json file according to the file path, 
	 * and instantiate the parameters and Syndromes of the data.
	 * @param Syndrome_Data_path
	 * @param Parameter_Data_path
	 */
	public differentiator(String Syndrome_Data_path, String Parameter_Data_path) {
		//將該病證的所有證候資訊實例化成物件並存入syndrome_list的這個物件
		this.syndrome_list = new Syndrome_List(Syndrome_Data_path);
		//將參數表存成物件
		this.Parameter = new Parameter(Parameter_Data_path);
	}
	/**
	 * It will be called externally to pass in the ID of the standard symptom collection.
	 * @param Input_Symptoms_set A collection of user-entered symptoms
	 * @param Threshold Threshold, the threshold can be input externally, and those below the threshold will be filtered out without being returned.
	 * @return A key-value syndrome diagnosis result with sorted scores will be returned. The key is the name of the symptom and the value is the score.
	 */
	public LinkedHashMap<String, Double> Differentiation_syndrome(Symptom_Set Input_Symptoms_set, double Threshold) {
		Double syndrome_score=0.0;
		// ********************************************************************************
		// 要輸出的症候陣列空間
		HashMap<String, Double> unsorted_map = new HashMap<>();// 拿來排序的
		LinkedHashMap<String, Double> Output_map = new LinkedHashMap<>();// 排序後回傳的
		// ********************************************************************************取出暫存
		// 所有的症候要拿來跟輸入症狀做比對
		Syndrome_List Syndrome_List = this.syndrome_list.get_List();
		// ********************************************************************************辨證
		long startTime = System.currentTimeMillis();// 開始計時
		for (Syndrome syndrome_i : Syndrome_List) {
			syndrome_score = syndrome_i.Syndrome_Score(Input_Symptoms_set, this.Parameter);
			// 當過於閥值才列入輸出
			if (syndrome_score >= Threshold) {
				unsorted_map.put(syndrome_i.get_Name(), syndrome_score);
			}
		}
		long endTime = System.currentTimeMillis();// 結束計時
		System.out.println("辨證計算時間: " + (endTime - startTime) + "(ms)");
		// ********************************************************************************排序
		// 保留key值的方式來轉成List，目的是要進行排序
		List<Map.Entry<String, Double>> entryList = new ArrayList<>(unsorted_map.entrySet());

		// 使用Comparator根據list裡entry的value進行排序
		Collections.sort(entryList, Comparator.comparingDouble(Map.Entry::getValue));

		// 以降序放置輸出回傳
		for (int i = entryList.size() - 1; i >= 0; i--) {
			Map.Entry<String, Double> entry = entryList.get(i);
			Output_map.put(entry.getKey(), entry.getValue());
		}
		// ********************************************************************************
		// 回傳已排序的結果
		return Output_map;
	}

}
