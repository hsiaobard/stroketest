package differentiator;

import java.util.ArrayList;
import java.util.List;
/**
 * Symptom set, used to store multiple symptom ID
 */
public class Symptom_Set extends ArrayList<Integer> {

	
	private static final long serialVersionUID = 1L;
	
	public Symptom_Set() {
        super();
    }
	
    public Symptom_Set(List<Integer> elements) {
        super(elements);
    }
    /**
     * Make the intersection of the symptom set and the patient symptom set
     * @param Input_Symptoms_set patient symptom set
     * @return Return the intersection ID of the patient's symptom set and the Syndrome symptom set
     */
    public Symptom_Set intersection(Symptom_Set Input_Symptoms_set){
    	Symptom_Set intersection = new Symptom_Set(Input_Symptoms_set);
    	intersection.retainAll(this);
    	return intersection;
    }
}
