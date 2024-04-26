package com;



public class Aquarium {
    public int breite,tiefe;
    public Fisch[][] poisson;
   public int x=0,y=0,z=0,x1=-1,x2=-1,x3=-1;
	public Aquarium(int tiefe, int breite) {
		this.breite = breite;
		this.tiefe = tiefe;
		poisson=new Fisch[tiefe][breite];
	}
	
	public void create(int tiefe,int position, String richtung,String type) {
	if(type=="Haifische") {
	
		poisson[tiefe][position]=new Haifische(tiefe,position,richtung);
		}
	else if(type=="Kugelfische") {
		poisson[tiefe][position]=new Kugelfische(tiefe,position,richtung);

		}
	else if(type=="Schwertfische") {
		poisson[tiefe][position]=new Schwertfische(tiefe,position,richtung);
	}
	else if(type=="Fisch") {
		poisson[tiefe][position]=new Fisch(tiefe,position,richtung);	
	}
		 
		}
	public void show() {
		
	/*
		for(int i=0;i<poisson.length;i++) {
			if(!(poisson[i][Fisch.currentposition[i]]==null)) {

			if(poisson[i][Fisch.currentposition[i]].richtung.equals("forwards")) {
			if((Fisch.currentposition[i]+1<poisson[i].length-1)) {
				

			poisson[i][Fisch.currentposition[i]+1]=poisson[i][Fisch.currentposition[i]];

			poisson[i][Fisch.currentposition[i]]=null;
			Fisch.currentposition[i]++;
	
			
			
			}
			else 
				
			poisson[i][Fisch.currentposition[i]].richtung="backwards";
			
			}
			else if(poisson[i][Fisch.currentposition[i]].richtung.equals("backwards")) {
				if(!(Fisch.currentposition[i]-1<0)){
					poisson[i][Fisch.currentposition[i]-1]=poisson[i][Fisch.currentposition[i]];
					poisson[i][Fisch.currentposition[i]]=null;}
				else {
					poisson[i][Fisch.currentposition[i]].richtung="forwards";
				}}
			}
			else
				System.out.println("hello");*/

		for(int i=0;i<poisson.length;i++) {
			for(int j=0;j<poisson[i].length;j++) {
		    if(!(poisson[i][j]==null)) {
		    	if(poisson[i][j] instanceof Haifische && x==4 ) {
		    		x1=x1*(-1);
		    		poisson[i+x1][j]=poisson[i][j];
					poisson[i][j]=null;
					x=0;
					continue;
		    	}
		    	else if(poisson[i][j] instanceof Schwertfische && y==5 ) {
		    		x2=x2*(-1);
		    		poisson[i+x2][j]=poisson[i][j];
					poisson[i][j]=null;
					y=0;
					continue;
		    	}
		    	else if(poisson[i][j] instanceof Kugelfische && z==10 ) {
		    		x3=x3*(-1);
		    		poisson[i+x3][j]=poisson[i][j];
					poisson[i][j]=null;
					z=0;
					continue;
		    	}
		    	
					if(poisson[i][j].richtung=="forwards") {
						
						
						if(!(j+1>poisson[i].length-1)) {
							if(poisson[i][j+1] instanceof Haifische ) {
								poisson[i][j]=null;
							}
							else {
							poisson[i][j+1]=poisson[i][j];
							poisson[i][j]=null;}
							
						}
						else {
							poisson[i][j].richtung="backwards";
						}
					}
					else if(poisson[i][j].richtung=="backwards") {
						if(!(j-1<0)){
							poisson[i][j-1]=poisson[i][j];
							poisson[i][j]=null;}
						else {
							poisson[i][j].richtung="forwards";
						}
					}
					j++;
				}
			}
		}
		
		x++;
		y++;
		z++;
		
		}
	
	
	
    
	}

