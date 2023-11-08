package Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Entities.Product;
import Service.CalculationService;

public class ProgramProduct {


	public static void main(String[] args) {

		List <Product> list = new ArrayList<>();
		String path = "C:\\temp\\texttt.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null){
				
				String [] filds = line.split(",");				
				list.add (new Product(filds[0], Double.parseDouble(filds [1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println(" Max: ");
			System.out.println(x.getName() + " , " + x.getPrice());
	
		} catch (IOException e) {
			System.out.println(" Erro " + e.getMessage());
		}
		
	}

}
