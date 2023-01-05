package javaCollection;

import java.util.ArrayList;
import java.util.Random;

public class NumeroImmuable {
	
	private int numero = 0;
	private final Prefixe prefixe;
	
	public NumeroImmuable(Prefixe prefix) throws Exception {
		this.prefixe = null;
		setValPre(prefix);
	}

	public void setVal() {
		Random random = new Random();
		numero = Bornes.MININUM.getVal()+random.nextInt(Bornes.MAXIMUM.getVal()-Bornes.MININUM.getVal());
	}
	
	public void setValPre(Prefixe prefixe) throws Exception {
		/*if (str.length() != 2)throw new Exception("pas la bonne taille de chaine, la chaine doit être =2");
		if (str.charAt(0) != '0')throw new Exception("pas de 0 au début");
		if (str.charAt(1) != '1' && str.charAt(1) != '2' && str.charAt(1) != '3' && str.charAt(1) != '4' && str.charAt(1) != '5' && str.charAt(1) != '6' && str.charAt(1) != '7' && str.charAt(1) != '8' && str.charAt(1) != '9')
			throw new Exception("2e caractère pas égal a 1,2,3,4,5,6,7,8 ou 9");*/
		int chiffre = Integer.parseInt(prefixe.getValasString());
		Random random = new Random();
		numero = Bornes.MININUM.getVal()/10+random.nextInt(Bornes.MAXIMUM.getVal()/10-Bornes.MININUM.getVal()/10);
		numero += chiffre*Bornes.MININUM.getVal();
	}
	
	public int getVal() {
		return numero;
	}
	
	public String toString() {
		return "0"+numero;
	}
	
	public boolean equals(NumeroImmuable num) {
		if (this.getVal() == num.getVal()) return true;
		return false;
	}

	public static void main (String[] args) throws Exception {
		NumeroImmuable num = new NumeroImmuable(Prefixe._06);
		NumeroImmuable num2 = num;
		//System.out.println(num2.equals(num));
		System.out.println(num);
		//System.out.println(num2);
	}
}
/*
 * fiches de Bloch : fiche 6,7,10,12,29,34,57,68,69 total : 9
 * 
 */
