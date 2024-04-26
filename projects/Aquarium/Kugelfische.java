package com;

public class Kugelfische extends Fisch {

	public Kugelfische(int tiefe, int position, String richtung) {
		super(tiefe, position, richtung);
		// TODO Auto-generated constructor stub
	}
	public String getRichtung() {
		if(this.richtung=="forwards")
			return "><>-";
		else
			return "-<><";
	}
	@Override
	public String toString() {
		return this.getRichtung();
	}
}
