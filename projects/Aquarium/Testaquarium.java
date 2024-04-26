package com;

public class Testaquarium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Aquarium a=new Aquarium(6,7);

	
		a.create(0, 6, "backwards","Fisch");
		a.create(0, 1, "backwards","Fisch");
		a.create(0, 2, "backwards","Haifische");
		a.create(2, 6, "forwards","Schwertfische");
		a.create(4, 6, "forwards","Kugelfische");
	
		
		 for (int x = 0; x < 100; x++) {
          a.show();
		 for (int i = 0; i < a.poisson.length; i++) {
			 
	            System.out.print("|");
	            for (int j = 0; j < a.poisson[i].length; j++) {
	            	if(a.poisson[i][j]==null) {
	            		System.out.print(""+ "\t");
	            	}else {
	            		if(a.poisson[i][j] instanceof Haifische  ) {
	            			 
	            			if(j+1==a.poisson[i].length-1) {
	            				
	            				
	            				System.out.print(a.poisson[i][j]);
	            				a.poisson[i][j].richtung="backwards";
	            				}
	            			else {
	            				System.out.print(a.poisson[i][j]);
	            			}
	            		}
	            		else {
	            			System.out.print(a.poisson[i][j]+"\t" ); }
	            			}
	            	if(j+1==a.poisson[i].length) {
	            		 System.out.print(" |");
	            	}
	                }
	            System.out.println();
		 		}
		 System.out.print("+");
		 for (int j = 0; j <=a.breite; j++) {
			 System.out.print("-------");
		 }
		 System.out.println("+");
		 System.out.println();
		 Thread.sleep(1000, 500);
		 }
	}

}
