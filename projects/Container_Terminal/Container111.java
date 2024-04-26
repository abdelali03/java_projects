package com;

public class Container111 {
	Kran[] q;
	Kran k=new Kran();
	Container[][] con;
	public Container111(int tiefe, int breite,int kranpos) {
		this.q = new Kran[breite];
		this.k.setPosition(kranpos);
		this.q[kranpos]=k;
		this.con = new Container[tiefe][breite];
	}
	
	public void create(int posx, int posy) {
		con[posx][posy]= new Container();
	}
	
	public void aufnehmen() {
		
		for(int i=0;i<con.length;i++) {
			if(!(con[i][k.getPosition()]==null)) {
				con[0][k.getPosition()]=con[i][k.getPosition()];
				con[i][k.getPosition()]=null;
				break;
			}
			
		}
	}
	public void links() {
		con[0][k.getPosition()-1]=con[0][k.getPosition()];
		con[0][k.getPosition()]=null;
		
		q[k.getPosition()-1]=k;
		q[k.getPosition()]=null;
		k.setPosition(k.position-1);
		
		}
	public void rechts() {
		con[0][k.getPosition()+1]=con[0][k.getPosition()];
		con[0][k.getPosition()]=null;
		q[k.getPosition()]=null;
		q[k.getPosition()+1]=k;
		
	
		k.setPosition(k.position+1);
	}
	public void ablegen() {
		for(int i=1;i<con.length;i++) {
			if(!(con[i][k.getPosition()]==null)) {
				con[i-1][k.getPosition()]=con[0][k.getPosition()];
				con[0][k.getPosition()]=null;
				break;
			}
			
		}
		if(con[con.length-1][k.getPosition()]==null) {
			con[con.length
			    -1][k.getPosition()]=con[0][k.getPosition()];
			con[0][k.getPosition()]=null;
		}
	}
	}
