package differentiator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * Syndrome list, used to store multiple Syndrome objects.
 */

public class Syndrome_List extends ArrayList<Syndrome> {
	String syndromes = "{\n" +
			"  \"1\": {\n" +
			"    \"name\": \"肝陽暴亢\",\n" +
			"    \"Chief_Complaint\":\"\",\n" +
			"        \n" +
			"      \"Primary_Group_1\": [148],\n" +
			"      \"Primary_Group_2\": [202,299,325,686,619],\n" +
			"      \"Primary_Group_3\": [826,831,848,1024,1170],\n" +
			"      \"Primary_Group_4\": [992],\n" +
			"      \"Primary_Group_5\": [12,32,54,68,70,348,618,144],\n" +
			"      \"Secondary_Group_1\": [],\n" +
			"      \"Secondary_Group_2\": [],\n" +
			"      \"Secondary_Group_3\": [],\n" +
			"      \"Secondary_Group_4\": [],\n" +
			"      \"Secondary_Group_5\": []\n" +
			"  },\n" +
			"  \"2\": {\n" +
			"    \"name\": \"風痰阻絡\",\n" +
			"    \"Chief_Complaint\":\"\",\n" +
			"        \n" +
			"      \"Primary_Group_1\": [348],\n" +
			"      \"Primary_Group_2\": [202,619,1274],\n" +
			"      \"Primary_Group_3\": [823,826,1024,1170],\n" +
			"      \"Primary_Group_4\": [799,806,809],\n" +
			"      \"Primary_Group_5\": [68,569],\n" +
			"      \"Secondary_Group_1\": [],\n" +
			"      \"Secondary_Group_2\": [],\n" +
			"      \"Secondary_Group_3\": [],\n" +
			"      \"Secondary_Group_4\": [],\n" +
			"      \"Secondary_Group_5\": []\n" +
			"  },\n" +
			"  \"3\": {\n" +
			"    \"name\": \"痰熱腑實\",\n" +
			"    \"Chief_Complaint\":\"\",\n" +
			"        \n" +
			"      \"Primary_Group_1\": [511],\n" +
			"      \"Primary_Group_2\": [202,425],\n" +
			"      \"Primary_Group_3\": [826,827,832,1011,1024,1042,1170],\n" +
			"      \"Primary_Group_4\": [799,806,992],\n" +
			"      \"Primary_Group_5\": [32,54,68,81,144,161,325],\n" +
			"      \"Secondary_Group_1\": [],\n" +
			"      \"Secondary_Group_2\": [],\n" +
			"      \"Secondary_Group_3\": [],\n" +
			"      \"Secondary_Group_4\": [],\n" +
			"      \"Secondary_Group_5\": []\n" +
			"  },\n" +
			"  \"4\": {\n" +
			"    \"name\": \"氣虛血瘀\",\n" +
			"    \"Chief_Complaint\":\"\",\n" +
			"        \n" +
			"      \"Primary_Group_1\": [386,63],\n" +
			"      \"Primary_Group_2\": [202],\n" +
			"      \"Primary_Group_3\": [823,832,838,1170],\n" +
			"      \"Primary_Group_4\": [798,801,804,807],\n" +
			"      \"Primary_Group_5\": [323,563,567,890],\n" +
			"      \"Secondary_Group_1\": [],\n" +
			"      \"Secondary_Group_2\": [],\n" +
			"      \"Secondary_Group_3\": [],\n" +
			"      \"Secondary_Group_4\": [],\n" +
			"      \"Secondary_Group_5\": []\n" +
			"  },\n" +
			"  \"5\": {\n" +
			"    \"name\": \"陰虛風動\",\n" +
			"    \"Chief_Complaint\":\"\",\n" +
			"    \n" +
			"      \"Primary_Group_1\": [272],\n" +
			"      \"Primary_Group_2\": [1274,450,348,619,558,975],\n" +
			"      \"Primary_Group_3\": [827,1016,824,1024],\n" +
			"      \"Primary_Group_4\": [798,799,800],\n" +
			"      \"Primary_Group_5\": [135,144],\n" +
			"      \"Secondary_Group_1\": [],\n" +
			"      \"Secondary_Group_2\": [],\n" +
			"      \"Secondary_Group_3\": [],\n" +
			"      \"Secondary_Group_4\": [],\n" +
			"      \"Secondary_Group_5\": []\n" +
			"  },\n" +
			"  \"6\": {\n" +
			"    \"name\": \"風火蔽竅\",\n" +
			"    \"Chief_Complaint\":\"\",\n" +
			"    \n" +
			"      \"Primary_Group_1\": [558],\n" +
			"      \"Primary_Group_2\": [320,569,80,356,557],\n" +
			"      \"Primary_Group_3\": [848,827,826,831,1011],\n" +
			"      \"Primary_Group_4\": [800,799,809],\n" +
			"      \"Primary_Group_5\": [135,325,618],\n" +
			"      \"Secondary_Group_1\": [],\n" +
			"      \"Secondary_Group_2\": [],\n" +
			"      \"Secondary_Group_3\": [],\n" +
			"      \"Secondary_Group_4\": [],\n" +
			"      \"Secondary_Group_5\": []\n" +
			"  },\n" +
			"  \"7\": {\n" +
			"    \"name\": \"痰火閉竅\",\n" +
			"    \"Chief_Complaint\":\"\",\n" +
			"    \n" +
			"      \"Primary_Group_1\": [144,130],\n" +
			"      \"Primary_Group_2\": [425,277,434,160],\n" +
			"      \"Primary_Group_3\": [826,825,832],\n" +
			"      \"Primary_Group_4\": [806,800,811],\n" +
			"      \"Primary_Group_5\": [135,569,1008,32,54],\n" +
			"      \"Secondary_Group_1\": [],\n" +
			"      \"Secondary_Group_2\": [],\n" +
			"      \"Secondary_Group_3\": [],\n" +
			"      \"Secondary_Group_4\": [],\n" +
			"      \"Secondary_Group_5\": []\n" +
			"  },\n" +
			"  \"8\": {\n" +
			"    \"name\": \"痰濕蒙竅\",\n" +
			"      \"Chief_Complaint\":\"\",\n" +
			"    \n" +
			"      \"Primary_Group_1\": [563],\n" +
			"      \"Primary_Group_2\": [327,330,425],\n" +
			"      \"Primary_Group_3\": [829,823,832],\n" +
			"      \"Primary_Group_4\": [799,809,806],\n" +
			"      \"Primary_Group_5\": [135,441,202,402,785],\n" +
			"      \"Secondary_Group_1\": [],\n" +
			"      \"Secondary_Group_2\": [],\n" +
			"      \"Secondary_Group_3\": [],\n" +
			"      \"Secondary_Group_4\": [],\n" +
			"      \"Secondary_Group_5\": []\n" +
			"  },\n" +
			"  \"9\": {\n" +
			"  \t\"name\": \"元氣衰敗\",\n" +
			"      \"Chief_Complaint\":\"\",\n" +
			"    \n" +
			"      \"Primary_Group_1\": [277],\n" +
			"      \"Primary_Group_2\": [5,279,785],\n" +
			"      \"Primary_Group_3\": [842,1042,838,823,832],\n" +
			"      \"Primary_Group_4\": [810,813,798],\n" +
			"      \"Primary_Group_5\": [31,135,323,365,432,563,621],\n" +
			"      \"Secondary_Group_1\": [],\n" +
			"      \"Secondary_Group_2\": [],\n" +
			"      \"Secondary_Group_3\": [],\n" +
			"      \"Secondary_Group_4\": [],\n" +
			"      \"Secondary_Group_5\": []\n" +
			"  }\n" +
			"}";
	private static final long serialVersionUID = 1L;
	/**
	 * Instantiate the Syndrome list and connect the json file according to the file path
	 * @param FilePath Syndrome data mapping table json file path
	 */
	public Syndrome_List(String FilePath) {
		this.conn_data(FilePath);
	}
	/**
	 * Return Syndrome list
	 * @return Retern the entire Syndrome list
	 */
	public Syndrome_List get_List() {
		return this;
	}

	/**
	 * Connect the json file, instantiate the Syndrome data into objects and store them one by one in the Syndrome list
	 * @param FilePath Syndrome data mapping table json file path
	 */
	private void conn_data(String FilePath) {
		try {
			JSONParser parser = new JSONParser();
			//FileReader reader = new FileReader(FilePath, StandardCharsets.UTF_8);
			//BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath), StandardCharsets.UTF_8));
			// 使用JSONParser解析JSON文件
			Object obj = parser.parse(syndromes);

			// 將解析結果轉為JSONObject
			JSONObject jsonObject = (JSONObject) obj;
			for (Object key : jsonObject.keySet()) {//

				JSONObject groups = (JSONObject) jsonObject.get(key);// 第i個症候id

				Integer id = Integer.parseInt(key.toString());
				String name = (String) groups.get("name");
				String Chief_Complaint = (String) groups.get("Chief_Complaint");
				JSONArray G0 = (JSONArray) groups.get("Primary_Group_1");// 第一群症狀集合(主)
				JSONArray G1 = (JSONArray) groups.get("Primary_Group_2");// 第二群症狀集合(主)
				JSONArray G2 = (JSONArray) groups.get("Primary_Group_3");// 第三群症狀集合(主)
				JSONArray G3 = (JSONArray) groups.get("Primary_Group_4");// 第四群症狀集合(主)
				JSONArray G4 = (JSONArray) groups.get("Primary_Group_5");// 第五群症狀集合(主)
				JSONArray G5 = (JSONArray) groups.get("Secondary_Group_1");// 第一群症狀集合(次)
				JSONArray G6 = (JSONArray) groups.get("Secondary_Group_2");// 第二群症狀集合(次)
				JSONArray G7 = (JSONArray) groups.get("Secondary_Group_3");// 第三群症狀集合(次)
				JSONArray G8 = (JSONArray) groups.get("Secondary_Group_4");// 第四群症狀集合(次)
				JSONArray G9 = (JSONArray) groups.get("Secondary_Group_5");// 第五群症狀集合(次)
				// ***************************************************產生集合的空間
				Symptom_Set Symptom_set_0 = new Symptom_Set();
				Symptom_Set Symptom_set_1 = new Symptom_Set();
				Symptom_Set Symptom_set_2 = new Symptom_Set();
				Symptom_Set Symptom_set_3 = new Symptom_Set();
				Symptom_Set Symptom_set_4 = new Symptom_Set();
				Symptom_Set Symptom_set_5 = new Symptom_Set();
				Symptom_Set Symptom_set_6 = new Symptom_Set();
				Symptom_Set Symptom_set_7 = new Symptom_Set();
				Symptom_Set Symptom_set_8 = new Symptom_Set();
				Symptom_Set Symptom_set_9 = new Symptom_Set();

				// ***************************************************將各集合的症狀放入集合空間
				
				for (Object s0 : G0) {
					Symptom_set_0.add(((Long) s0).intValue());
				}

				for (Object s1 : G1) {
					Symptom_set_1.add(((Long) s1).intValue());
				}

				for (Object s2 : G2) {
					Symptom_set_2.add(((Long) s2).intValue());
				}

				for (Object s3 : G3) {
					Symptom_set_3.add(((Long) s3).intValue());
				}

				for (Object s4 : G4) {
					Symptom_set_4.add(((Long) s4).intValue());
				}

				for (Object s5 : G5) {
					Symptom_set_5.add(((Long) s5).intValue());
				}

				for (Object s6 : G6) {
					Symptom_set_6.add(((Long) s6).intValue());
				}

				for (Object s7 : G7) {
					Symptom_set_7.add(((Long) s7).intValue());
				}

				for (Object s8 : G8) {
					Symptom_set_8.add(((Long) s8).intValue());
				}

				for (Object s9 : G9) {
					Symptom_set_9.add(((Long) s9).intValue());
				}
				// ***************************************************將該症候症狀集合存成物件，生成第i個症候的物件
				Syndrome Syndrome_object = new Syndrome(id, name, Chief_Complaint, Symptom_set_0, Symptom_set_1,
						Symptom_set_2, Symptom_set_3, Symptom_set_4, Symptom_set_5, Symptom_set_6, Symptom_set_7,
						Symptom_set_8, Symptom_set_9);
				// ************************將物件放入回傳的陣列
				this.add(Syndrome_object);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
