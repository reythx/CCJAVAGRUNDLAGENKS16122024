package thema3.verzweigungen;

public class DatentypenUndLogischeAusdrücke {

	public static void main(String[] args) {
	//1.1
	boolean b = false;
	if (b = false) {
		System.out.println("Nope");
	}else {
		System.out.println("Yeah"); // Yeah, da b = false eine zuordnung ist, keine condition
	}
	//1.1.1
	//a
	// (y<6)||(x>7), für x = 5 und y = 3,	da y<6 : true
	//b
	// (x==4)^(3==y) für x =4 und y=3, 		da beides wahr und XOR : false
	//c
	// (y > 2)&&(x>6) für x = 5 und y =3,	false, da x=5 und bedingung x>6
	//d
	// (x+y>20)&&(y>2) für x=11 und y=1,	false, da y<2 und x+y <20
	//e
	// (4<6)&&(4>6)		false, da contradictory
	//f
	// (x+y>=10)||(x>8) für x=5 und y=4,	false, da x+y<10 und da x<8
	//g
	//(x<=3)^(y!=1) für x=2 und y=2,	false, da beides true und XOR
	//h
	// (y>1)&&x<=5) für x=4 und y=2, 	true, da beides true
	//i
	//(x*y<=10)&&(y>1) für x=3 und y=4,	false, da y*x > 10
	//j
	//(5<2*y)&&(x+y>7) f+r x=3 und y=2, false, da x+y<7
	
	
	
	
	
	
	
	
		}
	}





