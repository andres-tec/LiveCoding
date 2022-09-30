
public class MAngosNaranjas {
int mangos;
int naranjas;

public MAngosNaranjas(int mangos, int naranjas) {
	super();
	this.mangos = mangos;
	this.naranjas = naranjas;
}

public static void imprimir(int cajas,int mangos , int naranjas ) {
	
	System.out.println("El numero de cajas es : " + cajas + " El numero de mangos en una caja es :"+ mangos +" el numero de naranjas en una caja es: "+ naranjas );
}
public static int calcular(int mangos, int naranjas){
	int multiplo=1;
	int lastNaranjas=mangos;
	int lastMangos=naranjas;
	int lastMultiplo =0;
	boolean b1 = true; 
	int i=1;
	for ( ; b1==true; i++) {
		if ((i>1)) {
			if (lastNaranjas%i==0 || lastMangos%i==0) {
				lastMultiplo= multiplo;
				multiplo = i;//3
				//lastNaranjas= naranjas;
				//lastMangos=mangos;
				//System.out.println("el multiplo es: " + multiplo+ "  lastMultiplo es: "+ lastMultiplo);
				if ((lastMangos%i==0) &&(lastNaranjas%i!=0)) {
					lastMangos/= i;
					
					i=1;
				} else if((lastNaranjas%i==0)&&(lastMangos%i==0)){
					lastNaranjas /=i;
					lastMangos /=i;
					i=1;

				}else if((lastNaranjas%i==0)&&(lastMangos%i !=0)){
					lastNaranjas /=i;
					i=1;
				
					
				}//else if de criterio mangos y naranjas
				}
			}//if principal
		if ((lastNaranjas==1)||(lastMangos==1)&&(naranjas%multiplo==0)&&(mangos%multiplo==0)) {
			int cajas=0;
			if ((naranjas%multiplo==0)) {
				cajas =naranjas/multiplo;//5
				lastMangos = mangos/cajas;
				lastNaranjas= naranjas/cajas;
			}else if((mangos%multiplo==0)) {
				cajas =mangos/multiplo;
				lastNaranjas = naranjas/cajas;
				lastMangos= mangos/cajas;
			}
			MAngosNaranjas.imprimir(cajas, lastMangos, lastNaranjas);
			b1=false;
			
		}//if que rompe el ciclo
		}//cierre ciclo for 
	return 0;
}

}
