package javaCollection;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author w21203479
 *
 */
public class NumeroImmuableUnique {
	private static ArrayList<NumeroImmuable> numeroLibre = new ArrayList<NumeroImmuable>();  
	private static ArrayList<NumeroImmuable> numeroActif = new ArrayList<NumeroImmuable>(); 
	
	public NumeroImmuableUnique(NumeroImmuable ... nums) throws Exception {
		ajouterNumero(nums);
	}
	
	public void supprimmeNumero(NumeroImmuable ... nums) throws Exception {
		for (NumeroImmuable num : nums) {
			if (numeroActif.contains(num)) {
				numeroActif.remove(num);
				numeroLibre.add(num);
			}		
			else {
				System.out.println(num + " pas enregistré");
			}
		}
	}
	
	public void ajouterNumero(NumeroImmuable ... nums) {
		for (NumeroImmuable num : nums) {
			if (numeroLibre.contains(num)) {
				numeroActif.add(num);
				numeroLibre.remove(num);
			}
				
			else if (!numeroActif.contains(num))
				numeroActif.add(num);
			
			else {
				System.out.println(num + " deja enregistré");
			}
		}
	}
	
	public String toString() {
		String strActif = "Numéros actif :\n";
		for (NumeroImmuable num : numeroActif) {
			strActif += num + "\n";
		}
		String strLibre = "Numéros libre :\n";
		for (NumeroImmuable num : numeroLibre) {
			strLibre += num + "\n";
		}
		String str = strActif + strLibre;
		return str;
	}

	public static void main (String[] args) throws Exception {
		NumeroImmuable num = new NumeroImmuable(Prefixe._06);	
		NumeroImmuable num2 = num;	
		NumeroImmuable num3 = new NumeroImmuable(Prefixe._06);	
		NumeroImmuableUnique numUnique = new NumeroImmuableUnique(num,num2,num3);
		System.out.println(numUnique);
		numUnique.supprimmeNumero(num3);	
		System.out.println(numUnique);
		numUnique.ajouterNumero(num3);
		System.out.println(numUnique);
	}
}