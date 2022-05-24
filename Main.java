
/**
 * Esta clase es aquella que contiene todo lo que se va a imprimir con consola y es lo que verá el usuario
 * 
 * @author Felipe Martinez, Kristian Restrepo y Luisa Álvarez 
 * @version 1.0
 */
import java.util.Scanner;
import java.lang.Thread;

public class Main {
	/**
	 * Es el método principal que invocará el menú
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		mostrarMenu();
	}

	/**
	 * Este es el método de clase que contiene todo el menu del usuario El método
	 * crea un objeto de tipo MarcoDeDatos El método tiene un ciclo infinito que
	 * será cerrado por el 0 y siempre muestra las opciones del programa Si el
	 * número es diferente a los predeterminados por el sistema el ciclo se repetirá
	 * hasta que se marque una opcion válida Una vez el usuario marque una opción el
	 * menú lo rediccionará a otra con opciones más especificas Si el usuario
	 * ingresa números validos el sistema invocará métodos de la clase MarcoDeDatos
   *Todo lo impreso como 5.0E-5 o 0.00005 significa que el dato es igual a ""
	 */
	public static void mostrarMenu() {
		boolean VF = true;
		Scanner scan = new Scanner(System.in);
		int opcion;
		MarcoDeDatos MD = new MarcoDeDatos();
		MD.lecturaCSV("Medellin (1).csv");

		while (VF) {
			System.out.println("\033[0;1m°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("°|                  ----------------                 |°");
			System.out.println("°|                  MENÚ DE OPCIONES                 |°");
			System.out.println("°|                  ----------------                 |°");
			System.out.println("°°°°°°°°°°°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 1. PROMEDIOS                   |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 2. MAXIMOS                     |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 3. MINIMOS                     |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 4. MENOR IGUAL QUE             |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 5. MAYOR IGUAL QUE             |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 6. MODA                        |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 7. CONTAR                      |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 8. INFO LUGAR CSV              |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 9. MUESTRA DATOS Y ESCRIBE CSV |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 0. SALIR                       |°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

			System.out.println("Ingrese alguna opcion");
			opcion = scan.nextInt();
			int a = 0;
			switch (opcion) {
			case 0:
				VF = false;
				break;
			case 1:
				System.out.println("Has seleccionado la opcion 1");
				System.out.println("");
				System.out.println("Seleccione a que dato sacar promedio: ");
				System.out.println("");
				a = mostrarMenuGeneral();
				System.out.println("El promedio del dato es: "+MD.promedio(a));
				Sleep();
				break;
			case 2:
				System.out.println("Has seleccionado la opcion 2");
				System.out.println("");
				System.out.println("Seleccione el dato del que desea saber su maximo valor");
				System.out.println("");
				a = mostrarMenuGeneral();
				System.out.println(MD.mayorTotal(a));
				Sleep();
				break;
			case 3:
				System.out.println("Has seleccionado la opcion 3");
				System.out.println("");
				System.out.println("Seleccione el dato del que desea saber su minimo valor");
				System.out.println("");
				a = mostrarMenuGeneral();
				System.out.println(MD.menorTotal(a));
				Sleep();
				break;
			case 4:
				System.out.println("Has seleccionado la opcion 4");
				System.out.println("");
				System.out.println(
						"Ingrese el dato del que desea saber si contiene valores menores o iguales a uno ingresado por usted posteriormente");
				System.out.println("");
				a = mostrarMenuGeneral();
				System.out.println("Ingrese valor a comparar");
				double b = scan.nextDouble();
				System.out.println(MD.MenorigualQue(b, a));
				Sleep();
				break;
			case 5:
				System.out.println("Has seleccionado la opcion 5");
				System.out.println("");
				System.out.println(
						"Ingrese el dato del que desea saber si contiene valores mayores o iguales a uno ingresado por usted posteriormente");
				System.out.println("");
				a = mostrarMenuGeneral();
				System.out.println("Ingrese valor a comparar");
				double d = scan.nextDouble();
				System.out.println(MD.MayorigualQue(d, a));
				Sleep();
				break;
			case 6:
				System.out.println("Has seleccionado la opcion 6");
				System.out.println("");
				System.out.println("Seleccione el dato del que desea saber su moda");
				System.out.println("");
				a = mostrarMenuGeneral();
				System.out.println(MD.moda(a));
				Sleep();
				break;
			case 7:
				System.out.println("Has seleccionado la opcion 7");
				System.out.println("");
				System.out.println("Seleccione el dato del que desea saber la cantidad de valores que este contiene");
				System.out.println("");
				a = mostrarMenuGeneral();
				System.out.println("El total del conteo es "+MD.contar(a));
				Sleep();
				break;
			case 8:
				System.out.println("Has seleccionado la opcion 8");
				System.out.println(MD.infoLugarCsv());
				Sleep();
				break;
			case 9:
				System.out.println("Has seleccionado la opcion 9");
				System.out.println();
				MD.InsertarDatos(escribirCSV());
				System.out.println();
				System.out.print(MD.mostrarCSV("Imprimir.csv"));
				Sleep();
				break;
			default:
				System.out.println("Solo números entre 0 y 5");
				break;
			}
		}
	}

	/**
	 * El método de clase es mostrado por mostrarMenu para que el usuario tome
	 * acciones más especificas a partir de unas generales El método crea un objeto
	 * de tipo MarcoDeDatos El método pide un número válido una vez que el usuario
	 * haya ingresado uno diferente a los predeterminados por el sistema
	 * 
	 * @return es un numero que luego servirá como parámetro a algunas acciones de
	 *         la clase MarcoDeDatos
	 */
	public static int mostrarMenuGeneral() {
		boolean VF = true;
		Scanner scan = new Scanner(System.in);
		int opcion2;
		MarcoDeDatos MD = new MarcoDeDatos();
		int resultado = 0;
		while (VF == true) {
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("°|            ---------------------------            |°");
			System.out.println("°|            INGRESE LA OPCION QUE DESEA            |°");
			System.out.println("°|            ---------------------------            |°");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 1. PRCP                       |°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 2. TAVG                       |°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 3. TMAX                       |°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°| 4. TMIN                       |°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°-°°°°°°°°°°°");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("Ingrese alguna opcion");
			System.out.println();

			opcion2 = scan.nextInt();

			switch (opcion2) {
			case 1:
				resultado = 4;
				VF = false;
				break;
			case 2:
				resultado = 5;
				VF = false;
				break;
			case 3:
				resultado = 6;
				VF = false;
				break;
			case 4:
				resultado = 7;
				VF = false;
				break;
			default:
				System.out.println("escribe un numero valido");
			}
		}
		return resultado;
	}

	/**
	 * El método de clase detiene el programa por 1000 milisegundos para que el
	 * usuario pueda visualizar con mayor detenimiento las acciones realizadas por
	 * el sistema
	 * 
	 * @param Unhandled exception type InterruptedException
	 */
	public static void Sleep() {
		try {
			for (int i = 0; i < 4; i++) {
				Thread.sleep(1000);
				System.out.print(".");
			}
		} catch (InterruptedException e) {
		}
		System.out.println("");
	}

	/**
	 * El método de clase pide un texto por el Scanner
	 * 
	 * @return es un texto que luego será ingresado como parámetro para escribir en
	 *         el csv
	 */
	public static String escribirCSV() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese por favor el texto que desea ingresar al CSV");
		String text = scan.nextLine();
		return text;
	}

}
