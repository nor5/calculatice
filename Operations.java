package com.pccalcul.beans;

public class Operations {
	
	private double resultat;
	private String operation,message,nombre1,nombre2;
	
	public String getNombre1() {
	return 	nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1=nombre1;
	}
	public String  getNombre2() {
		return nombre2;
	}
	 public void setNombre2(String  nombre2) {
		 this.nombre2=nombre2;
	 }
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation=operation;		
	}
	public String getMessage() {
		return message;
	}
	
	
	//methode de calcul 
	
	public double calculer (String  nombre1,String  nombre2,String operation)
	{
		
		
		
		if (this.operation.equals("Addition")) {
		this.resultat=(Double.parseDouble(nombre1))+(Double.parseDouble(nombre2));
		
		
		}
		else if (operation.equals("Soustraction")) {
			this.resultat=(Double.parseDouble(nombre1))-(Double.parseDouble(nombre2));
			
			}
		else if (operation.equals("Multiplication")) {
			this.resultat=(Double.parseDouble(nombre1))*(Double.parseDouble(nombre2));}
			
			else {
			this.resultat=(Double.parseDouble(nombre1))/(Double.parseDouble(nombre2));
			
		}
			
		return resultat;
		
		
	}
	
	//message pour l'affichage  du resultat finale 
	public String toString() {
		
		 return message ="Le resultat de la  "  +operation+  " de " +nombre1+ " et  " +nombre2+  " est : "+resultat;
	}	
	
	
		
}
	