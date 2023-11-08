package Service;

import java.util.List;

import Entities.Product;

public class CalculationService {
	
	public static Product max (List <Product> list){
		if(list.isEmpty()){
			throw new IllegalAccessError ("Não pode ser vazio");
		}
		Product max = list.get(0);
		for (Product item : list){
			if (item.compareTo(max) > 0){
				max = item;
			}
			
		}
		
		
		return max;
	}

}

