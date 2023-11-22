package differentiator;

/**
 * Syndrome,include multiple symptom sets
 */
public class Syndrome {

	private Integer Id;// 症候id
	private String Name;// 症候名稱
	private String Chief_Complaint;// 主訴
	// 五群主症狀集合
	private Symptom_Set Primary_Group_1;// 主_病位
	private Symptom_Set Primary_Group_2;// 主_病因
	private Symptom_Set Primary_Group_3;// 主_舌診
	private Symptom_Set Primary_Group_4;// 主_脈診
	private Symptom_Set Primary_Group_5;// 主_特徵
	// 五群次症狀集合
	private Symptom_Set Secondary_Group_1;// 次_病位
	private Symptom_Set Secondary_Group_2;// 次_病因
	private Symptom_Set Secondary_Group_3;// 次_舌診
	private Symptom_Set Secondary_Group_4;// 次_脈診
	private Symptom_Set Secondary_Group_5;// 次_特徵

	/**
	 * symptom constructor
	 * 
	 * @param id                 syndrome's id
	 * @param name               syndrome's name
	 * @param chief_complaint    syndrome's chief complaint
	 * @param Primary_Group_1   primary location symptom set
	 * @param Primary_Group_2      primary cause symptom set
	 * @param Primary_Group_3     primary tongue symptom set
	 * @param Primary_Group_4      primary pulse symptom set
	 * @param Primary_Group_5   primary features symptom set
	 * @param Secondary_Group_1 Secondary location symptom set
	 * @param Secondary_Group_2    Secondary cause symptom set
	 * @param Secondary_Group_3   Secondary tongue symptom set
	 * @param Secondary_Group_4    Secondary pulse symptom set
	 * @param Secondary_Group_5 Secondary features symptom set
	 */
	public Syndrome(Integer id, String name, String chief_complaint, Symptom_Set Primary_Group_1,
			Symptom_Set Primary_Group_2, Symptom_Set Primary_Group_3, Symptom_Set Primary_Group_4,
			Symptom_Set Primary_Group_5, Symptom_Set Secondary_Group_1, Symptom_Set Secondary_Group_2,
			Symptom_Set Secondary_Group_3, Symptom_Set Secondary_Group_4, Symptom_Set Secondary_Group_5) {
		// 儲存外面配置的空間指標，所以不用再new空間
		this.Id = id;// 編號
		this.Name = name;// 症候名
		this.Chief_Complaint = chief_complaint;// 主訴
		this.Primary_Group_1 = Primary_Group_1;// 主_病位
		this.Primary_Group_2 = Primary_Group_2;// 主_病因
		this.Primary_Group_3 = Primary_Group_3;// 主_舌診
		this.Primary_Group_4 = Primary_Group_4;// 主_脈診
		this.Primary_Group_5 = Primary_Group_5;// 主_特徵

		this.Secondary_Group_1 = Secondary_Group_1;// 次_病位
		this.Secondary_Group_2 = Secondary_Group_2;// 次_病因
		this.Secondary_Group_3 = Secondary_Group_3;// 次_舌診
		this.Secondary_Group_4 = Secondary_Group_4;// 次_脈診
		this.Secondary_Group_5 = Secondary_Group_5;// 次_特徵
	}

	/**
	 * Return the number of this syndrome
	 * 
	 * @return syndrome's id
	 */
	public Integer get_Id() {
		return this.Id;
	}

	/**
	 * Return the name of this syndrome
	 * 
	 * @return syndrome's name
	 */
	public String get_Name() {
		return this.Name;
	}

	/**
	 * Return the main complaint of this syndrome
	 * 
	 * @return syndrome's Chief Complaint
	 */
	public String get_Chief_Complaint() {
		return this.Chief_Complaint;
	}

	/**
	 * After instantiation, you can put it into the patient symptoms and parameter
	 * table to calculate the score of this syndrome.
	 * 
	 * @param Input_Symptoms_set patient symptom set
	 * @param parameter          Weight parameters of each group
	 * @return Return the score of this syndrome
	 */
	public Double Syndrome_Score(Symptom_Set Input_Symptoms_set, Parameter parameter) {
		// 各群集合數量
		// 主
		int P_G1_SIZE = this.Primary_Group_1.size();
		int P_G2_SIZE = this.Primary_Group_2.size();
		int P_G3_SIZE = this.Primary_Group_3.size();
		int P_G4_SIZE = this.Primary_Group_4.size();
		int P_G5_SIZE = this.Primary_Group_5.size();
		// 次
		int S_G1_SIZE = this.Secondary_Group_1.size();
		int S_G2_SIZE = this.Secondary_Group_2.size();
		int S_G3_SIZE = this.Secondary_Group_3.size();
		int S_G4_SIZE = this.Secondary_Group_4.size();
		int S_G5_SIZE = this.Secondary_Group_5.size();
		// 病人症狀集合與各群集合的交集數量
		// 主
		int P_G1_I_SIZE = this.Primary_Group_1.intersection(Input_Symptoms_set).size();
		int P_G2_I_SIZE = this.Primary_Group_2.intersection(Input_Symptoms_set).size();
		int P_G3_I_SIZE = this.Primary_Group_3.intersection(Input_Symptoms_set).size();
		int P_G4_I_SIZE = this.Primary_Group_4.intersection(Input_Symptoms_set).size();
		int P_G5_I_SIZE = this.Primary_Group_5.intersection(Input_Symptoms_set).size();
		// 次
		int S_G1_I_SIZE = this.Secondary_Group_1.intersection(Input_Symptoms_set).size();
		int S_G2_I_SIZE = this.Secondary_Group_2.intersection(Input_Symptoms_set).size();
		int S_G3_I_SIZE = this.Secondary_Group_3.intersection(Input_Symptoms_set).size();
		int S_G4_I_SIZE = this.Secondary_Group_4.intersection(Input_Symptoms_set).size();
		int S_G5_I_SIZE = this.Secondary_Group_5.intersection(Input_Symptoms_set).size();
		
		// 主次症狀集合權重
		double P_W = parameter.get_primary_weight(); // 主症狀集合權重
		double S_W = parameter.get_secondary_weight(); // 次症狀集合權重

		double G1_score_all = this.Group_Total_Score(P_G1_SIZE, S_G1_SIZE, P_G1_I_SIZE, S_G1_I_SIZE,P_W, S_W); // 病位群總分
		double G2_score_all = this.Group_Total_Score(P_G2_SIZE, S_G2_SIZE, P_G2_I_SIZE, S_G2_I_SIZE,P_W, S_W); // 病因群總分
		double G3_score_all = this.Group_Total_Score(P_G3_SIZE, S_G3_SIZE, P_G3_I_SIZE, S_G3_I_SIZE,P_W, S_W); // 舌診群總分
		double G4_score_all = this.Group_Total_Score(P_G4_SIZE, S_G4_SIZE, P_G4_I_SIZE, S_G4_I_SIZE,P_W, S_W); // 脈診群總分
		double G5_score_all = this.Group_Total_Score(P_G5_SIZE, S_G5_SIZE, P_G5_I_SIZE, S_G5_I_SIZE,P_W, S_W); // 特徵群總分

//		System.out.println("G1 Score: "+G1_score_all);
//		System.out.println("G2 Score: "+G2_score_all);
//		System.out.println("G3 Score: "+G3_score_all);
//		System.out.println("G4 Score: "+G4_score_all);
//		System.out.println("G5 Score: "+G5_score_all);
		// 每群的總分乘上每群的對應權重做加總
		return G1_score_all * parameter.get_G1_weight() + G2_score_all * parameter.get_G2_weight()
				+ G3_score_all * parameter.get_G3_weight() + G4_score_all * parameter.get_G4_weight()
				+ G5_score_all * parameter.get_G5_weight();
	}

	/**
	 * Calculate the total score of the group = Primary symptom set * Primary
	 * symptom weight + secondary symptom set * secondary symptom weight, If the
	 * secondary symptom set is empty, the Primary symptom set score is the total
	 * score of the group
	 * @param p_size The size of the Primary symptom set
	 * @param s_size The size of the Secondary symptom set
	 * @param p_i_size The size of the intersection between the Primary symptom set and the patient symptom set
	 * @param s_i_size The size of the intersection between the Secondary symptom set and the patient symptom set
	 * @param p_weight The weight of the Primary symptom set
	 * @param s_weight The weight of the Secondary symptom set
	 * @return The total score of the group
	 */
	private Double Group_Total_Score(int p_size, int s_size, int p_i_size, int s_i_size, double p_weight, double s_weight) {
		if (s_size == 0) {
			double p_score = this.Group_Score(p_i_size, p_size);
			return p_score;
		} else {
			double p_score = this.Group_Score(p_i_size, p_size);
			double s_score = this.Group_Score(s_i_size, s_size);
			return p_score * p_weight + s_score * s_weight;
		}
	}

	/**
	 * Decentralized grouping algorithm
	 * 
	 * @param m The number of intersections between the patient symptom set and the
	 *          Syndrome symptom set
	 * @param n The number of Syndrome symptom sets
	 * @return The score of the set
	 */
	private Double Group_Score(int m, int n) {
//		System.out.println("m:"+m);
//		System.out.println("n:"+n);
		// ***************分權分群演算法*****************************
		if (m == 0) {// 當該群為空，則n會等於0，如4群少5群一群，3群少5群兩群
			return 0.0;
		} else if (m != n) {// 若m==n則完全交集
			double temp_A = 1.0 / n;
			double temp_P = Math.pow(2, m);
			double temp_B = (temp_P - 1.0) / temp_P;
			double temp_C = (n - 1.0) / n;
			return temp_A + temp_B * temp_C;
		} else {
			return 1.0;
		}

	}
}
