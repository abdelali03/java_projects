package com;

public class Fisch {
	static int[] currentposition=new int[9];
	static int i=0;

   public int tiefe;
   public int position;
   public String richtung;



public Fisch(int tiefe, int position, String richtung) {
	currentposition[i]=position;
	this.tiefe = tiefe;
	this.position = position;
	this.richtung = richtung;
	i++;
}


public String getRichtung() {
	if(this.richtung=="forwards")
		return "><>";
	else
		return "<><";
}





@Override
public String toString() {
	return this.getRichtung();
}

   
   
}
