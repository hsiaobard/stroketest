package differentiator;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * Weight parameters of each group
 */
public class Parameter {
	
	String parameter = "{\n" +
			"  \"sd_size\": 9,\n" +
			"  \"g_size\": 5,\n" +
			"  \"G1_weight\": 0.1,\n" +
			"  \"G2_weight\": 0.25,\n" +
			"  \"G3_weight\": 0.25,\n" +
			"  \"G4_weight\": 0.1,\n" +
			"  \"G5_weight\": 0.3,\n" +
			"  \"primary_weight\": 1.0,\n" +
			"  \"secondary_weight\": 0.0\n" +
			"}";
//	private int sd_size;
//	private int g_size; 
	//病位權重
	private double G1_weight;
	//病因權重
	private double G2_weight;
	//舌診權重
	private double G3_weight;
	//脈診權重
	private double G4_weight;
	//特徵權重
	private double G5_weight;
	//主症權重
	private double primary_weight;
	//次症權重
	private double secondary_weight;
//	private double meridian_weight;
//	private double viscera_weight;
	/**
	 * Parameter constructor, pass in the path, and read the json file according to the path.
	 * @param FilePath path string
	 */
	public Parameter(String FilePath) {
		this.conn_data(FilePath);
	}
//	public int get_sd_size(){
//		return this.sd_size;
//	}
//	public int get_g_size(){
//		return this.g_size;
//	}
	/**
	 * 
	 * @return Returned disease location weight
	 */
	public double get_G1_weight(){
		return this.G1_weight;
	}
	/**
	 * 
	 * @return Returned disease cause weight
	 */
	public double get_G2_weight(){
		return this.G2_weight;
	}
	/**
	 * 
	 * @return Returned disease tongue weight
	 */
	public double get_G3_weight(){
		return this.G3_weight;
	}
	/**
	 * 
	 * @return Returned disease pulse weight
	 */
	public double get_G4_weight(){
		return this.G4_weight;
	}
	/**
	 * 
	 * @return Returned disease features weight
	 */
	public double get_G5_weight(){
		return this.G5_weight;
	}
	/**
	 * 
	 * @return Returned disease primary weight
	 */
	public double get_primary_weight(){
		return this.primary_weight;
	}
	/**
	 * 
	 * @return Returned disease secondary weight
	 */
	public double get_secondary_weight(){
		return this.secondary_weight;
	}
//	/**
//	 * 
//	 * @return 回傳經絡權重
//	 */
//	public double get_meridian_weight(){
//		return this.meridian_weight;
//	}
//	/**
//	 * 
//	 * @return 回傳臟腑權重
//	 */
//	public double get_viscera_weight(){
//		return this.viscera_weight;
//	}
	/**
	 * File link to read file data
	 * @param Data file path of the weight table of each symptom group
	 */
	private void conn_data(String FilePath) {
		try {
			JSONParser parser = new JSONParser();
			//FileReader reader = new FileReader(FilePath, StandardCharsets.UTF_8);
			//BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath), StandardCharsets.UTF_8));
			// 使用JSONParser解析JSON文件
			Object obj = parser.parse(parameter);

			// 將解析結果轉為JSONObject
			JSONObject jsonObject = (JSONObject) obj;
			
//			this.sd_size = ((Long) jsonObject.get("sd_size")).intValue();
//			this.g_size = ((Long) jsonObject.get("g_size")).intValue();
			this.G1_weight = ((Double) jsonObject.get("G1_weight")).doubleValue();
			this.G2_weight = ((Double) jsonObject.get("G2_weight")).doubleValue();
			this.G3_weight = ((Double) jsonObject.get("G3_weight")).doubleValue();
			this.G4_weight = ((Double) jsonObject.get("G4_weight")).doubleValue();
			this.G5_weight = ((Double) jsonObject.get("G5_weight")).doubleValue();
			this.primary_weight = ((Double) jsonObject.get("primary_weight")).doubleValue();
			this.secondary_weight = ((Double) jsonObject.get("secondary_weight")).doubleValue();
//			this.meridian_weight = ((Double) jsonObject.get("meridian_weight")).doubleValue();
//			this.viscera_weight = ((Double) jsonObject.get("viscera_weight")).doubleValue();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
