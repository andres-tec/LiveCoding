import java.util.Scanner;

public class Coding_3 {
	public static void main(String[] args) {
		MAngosNaranjas fruta= null;
		Scanner scan = new Scanner(System.in);
		System.out.println("favor de ingresar un numero de mangos:");
		int mangos = scan.nextInt();
		System.out.println("favor de ingresar un numero de narajas:");
		int naranjas = scan.nextInt();
		
		fruta=new MAngosNaranjas(mangos, naranjas);//aqui se crea un nuevo objeto
		MAngosNaranjas.calcular(mangos, naranjas);
	}

	
}//dividir/valor imprimido
//comparar si el valor de la div es mayor que el valor de la div con el ant val
