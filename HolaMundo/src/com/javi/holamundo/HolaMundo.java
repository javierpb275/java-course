//API, Clases = Conjunto de ordenes. Scanner = Recoje lo que introducimos por teclado 
//y mete el valor en un atributo



package com.javi.holamundo;

import java.util.Scanner;

//Upper Camel Case nombre de clase

public class HolaMundo {
  public static void main(String[] args) {
	  
	  //Una clase puede tener abuelos, es decir, existen varios niveles de herencia.
	  //Polimorfismo se puede aplicar a cualquier capa.
	  //Super() constructor del padre y super. metodo/atributo del padre.
	  //Podemos implementar y heredar en una misma clase
	  // Las implementaciones tambien se heredan
	  //Una clase puede implementar varias interfaces (implements InterA, InterD)
	  //Las interfaces pueden heredar de otras interfaces (extends). Al implementar la interfaz hijo, tendria que implementar los metodos de ambos interfaz padre e hijo.
	  //Las interfaces SI que pueden tener herencia multiple (puede heredar de varias interfaces)
	  
	  //Excepciones son las que se encargan de manejar errores (try catch).
	  
	  //Interfaces: Muy parecido a las clases abstractas. Una Interfaz NO es una clase. Una Interfaz NO puede contener atributos. NO pueden contener metodos implementados. Todos los metodos que contiene una interfaz son metodos abstractos. Cuando una clase hija extienda de la interfaz, tendra que implementar esos metodos abstractos.
	  // Las interfaces NO tienen constructores. Una interfaz, lo unico que tiene son metodos los cuales despues se van a implementar en la clase hija. De las interfaces NO se hereda, se implementa (implements). De las interfaces NO podemos instanciar objetos. Pero podemos usar el polimorfismo de referencias (Interfaz i = new Hijo()).
	  // 
	  
	  //Una clase Abstracta es una clase de la cual no se pueden instanciar objetos.
	  
	  //public abstract int loquesea(); Los metodos abstractos, no los implementamos pero estamos obligando a aquellos hijos que tengamos en el futuro tengan que implementar forzosamente estos metodos
	  
	  
	//final: Sirve para crear constantes. Una vez que inicializamos su valor, no se van a poder cambiar nunca
	  
	  final int constant = 0;
	  
	  //final static int constant = 0; (Con static se vuelve un atributo de clase. Todos los objetos de una clase van a compartir el mismo atributo
	  
	  
	  //setConstant(1); No puedes hacer esto.
	  
	  //Otra forma de declarar matrices:
	  
	  Scanner S = new Scanner(System.in);
	  
	  int a, b, contador = 2;
	  boolean iguales = true;
	  
	  System.out.print("Introduce un valor para a: ");
	  a = S.nextInt();
	  
	  System.out.print("Introduce un valor para b: ");
	  b = S.nextInt();
	  
	  int[][] m1 = {
			  {1,2,3},
			  {4,5,6},
			  {7,8,9}
	  };
	  
	  int[][] m2 = new int[a][b];
	  
	  for (int i = 0; i < m2.length; i++) { 
		  for(int j = 0; j < m2[0].length; j++) {
			  m2[i][j] = contador++;
			  //contador++;
		  }
	  }
	  
	  if (m1.length == m2.length) {
		  
		 if(m1[0].length == m2[0].length) {
			 
			 for (int i = 0; i < m1.length && iguales; i++) { 
				 
				 for(int j = 0; j < m1[0].length && iguales; j++) {
					 
					 if (m1[i][j] != m2[i][j]) {
						 iguales = false;
					 }
				  }
			 } 
		}
		 
		 else {
			 iguales = false;
		 }
	  }
	  
	  else {
			 iguales = false;
		 }
	  
	  if(iguales) {
		  System.out.println("Ambas matrices son iguales");
	  }
	  
	  else {
		  System.out.println("Ambas matrices NO son iguales");
		 }
	  
	  /*
	  //Matrices: Vectores dentro de otros vectores
	  
	  Scanner S = new Scanner(System.in);
	  
	  int[][] matriz = new int [2][2];//matriz de 2x2
	  
	  for (int i = 0; i < matriz.length; i++) { // matriz.length = numero filas
		  for(int j = 0; j < matriz[0].length; j++) {// matriz[0].length = numero de columnas // matriz[0] = primera fila
			  System.out.print("Introduce un numero para el elemento matriz["+i+"]["+j+"]");
			  matriz[i][j] = S.nextInt();
		  }
	  }
	  
	  for (int i = 0; i < matriz.length; i++) { 
		  for(int j = 0; j < matriz[0].length; j++) {
			  System.out.print(matriz[i][j]+" ");
			  
		  }
		  System.out.println();
	  }
	  
	  */
	  /*
	  //Algoritmo de encriptacion cifrado cesar
	  Scanner S = new Scanner(System.in);
	  
	  String frase1, frase2;
	  
	  int desplazamiento;
	  
	  frase2 = "";
	  
	  String min = "abcdefghijklmnopqrstuvwxyz";
	  String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  
	  System.out.print("Introduce una frase: ");
	  frase1 = S.nextLine();
	  
	  System.out.print("Introduce la clave de desplazamiento: ");
	  desplazamiento = S.nextInt();
	  
	  for(int i = 0; i < frase1.length(); i++) {
		  for(int j = 0; j < min.length(); j++) {
			  if(frase1.charAt(i) == min.charAt(j)) {
				  if(j + desplazamiento >= min.length()) {
					  frase2 += min.charAt((j + desplazamiento) % min.length());
				  }
				  else {
					  frase2 += min.charAt(j + desplazamiento);
				  }
			  }
			  else if (frase1.charAt(i) == may.charAt(j)) {
				  if(j + desplazamiento >= may.length()) {
					  frase2 += may.charAt((j + desplazamiento) % may.length());
				  }
				  else {
					  frase2 += may.charAt(j + desplazamiento);
				  }
			  }
		  }
		  
	  }
	  
	  System.out.println(frase1);
	  System.out.println(frase2);
	  */
	  
	  /*
	  //Comparar vectores:
	  
	  int[] v1 = {4, 5, 7, 8, 6};
	  int[] v2 = {4, 5, 7, 8};
	  
	  boolean iguales = true;
	  
	  if (v1.length != v2.length) {
		  iguales = false;
	  }
	  
	  for (int i = 0; i < v1.length && iguales; i++) {
		  if(v1[i] != v2[i]) {
			  
			  iguales = false;
			  
		  }  
	  }
	  
	  if(iguales) {
		  System.out.println("Ambos vectores son iguales");
	  }
	  
	  else {
		  System.out.println("Ambos vectores NO son iguales");
	  }
	  
	  */
	  /*
	  //Otras maneras de crear un vector/array:
	  int sum = 10;
	  int[] vector = new int[sum];
	  
	  //ordenar un vector de menor a mayor mediante el metodo de la burbuja
	  
	  int[] vec = {5,4,3,2,1};
	  int aux;
	  
	  for (int i = 0; i < vec.length; i++) {
		  System.out.print(vec[i] + " ");
	  }
	  
	  System.out.println();
	  
	  for (int i = 0; i < vec.length; i++) {// 
		  for (int j = i + 1; j < vec.length; j++) {//
			  if(vec[j] < vec[i]) {
				  aux = vec[j];
				  vec[j] = vec[i];
				  vec[j] = vec[i];
				  vec[i] = aux;
				  
			  }
		  }
	  }
	  
	  for (int i = 0; i < vec.length; i++) {
		  System.out.print(vec[i] + " ");
	  }
	  */
	  
	  //Calcular la media de los elementos de un vector:
	  /*
	  int num;
	  Scanner S = new Scanner(System.in);
	  
	  System.out.print("Introduce longitud vector: ");
	  num = S.nextInt();
	  
	  double[] vec = new double[num];
	  double total = 0;
	  
	  for (int i = 0; i < num; i++) {// i = 1
		  System.out.print("Introduce valores al vector: ");
		  vec[i] = S.nextDouble();//[i] para acceder a la posicion.
	  }
	  
	  for (int i = 0; i < num; i++) {
		  total += vec[i];
	  }
	  
	  total /= num; //total = total / num
	  
	  System.out.println("La media es: " + total);
	  */
	  //Vector o Array
	  /*
	  int[] vec = new int [5];//(Longitud de 5)
	  Scanner S = new Scanner(System.in);
	  
	  for (int i = 0; i < 5; i++) {// i = 1
		  System.out.print("Introduce numero entero: ");
		  vec[i] = S.nextInt();//[i] para acceder a la posicion.
	  }
	  
	  for (int i = 0; i < 5; i++) {
		  System.out.print(vec[i] + ", ");//El valor de la posicion del vector
	  }
	  */
	  
	  //Encontrar cuantos numeros primos hay entre 1 y 200
	  /*
	  boolean resultado = true;
	  
	  for (int i = 100; i < 200; i++) {
		  
		  resultado = true;
		  
		  for (int j = 2; j < i && resultado; j++) {
			  if(i % j == 0) {
				  resultado = false;
			  }
		  }
		  
		  if (resultado) {
			  System.out.print(i + ", ");
		  }
	  }
	  */
	  //Comprobar si un numero es primo
	  // Un numero es primo cuando NO se puede dividir por ningun numero (excepto 1 y si mismo).
	  //Ejemplo: 7
	  
	  /*
	  int num;
	  boolean resultado = true;
	  
	  Scanner S = new Scanner(System.in);
	  
	  System.out.print("Introduce un numero para comprobar si es primo: ");
	  num = S.nextInt();
	  
	  for (int i = 2; i < num; i++) {
		  
		  if(num % i == 0) {// 5 % 2 = 1
			  resultado = false; 
		  }
		  
	  }
	  
	  if(resultado) {// true
		  System.out.println("El numero es primo");
	  }
	  else {
		  System.out.println("El numero no es primo");
	  }
	  */
/*	  
	  //Bucles Anidados:  
	  //Mostrar por pantalla las tablas de multiplicar del 1 al 10
	  
	  int mult;
	  
	  for (int i = 1; i <= 10; i++) {
		  for (int j = 1; j <= 10; j++) {
			  mult = i * j;
			  System.out.println(i + " * " + j + " = " + mult);
		  }
		  
		  System.out.println();
		  
	  }
	*/
	  
	  
	  
	  /*
	  double whatever;
	  
	  Scanner S = new Scanner(System.in);
	  
	  whatever = S.nextDouble();
	  
	  System.out.println("El valor de whatever es: " + whatever);
	  
	  //Puedes crear varios atributos del mismo tipo de esta manera:
	  int pepe, paco, manolo;
	  
	  pepe = 23;
	  paco = 10;
	  
	  manolo = pepe % paco; // El % nos da el resto. En este caso es 3.
	  
	  pepe += paco; //pepe = pepe + paco (33)
	  */
	  
	  //Comprobar si un numero dado por teclado es par
	  //Un numero es par si cuando se divide entre 2 su resto es 0
	  /*
	  int a, b, suma = 0;
	  Scanner S = new Scanner(System.in);
	  
	  System.out.print("Introduce numero menor:");
	  a = S.nextInt();
	  
	  System.out.print("Introduce numero mayor:");
	  b = S.nextInt();
	  
	  for (int i = a; i < b; i++) {
		  suma += i;
	  }
	  
	  System.out.println("Valor total de suma: " + suma);
	  */
	 
	  
	  /*
	  int x,y;
	  
	  Scanner S = new Scanner(System.in);
	  
	  System.out.println("Introduce un numero por teclado: " );
	  
	  x = S.nextInt();
	  
	  y = x % 2;
	  
	  if (y == 0) {
		  System.out.println("El numero " + x + " es par");
	  }
	  else {
		  System.out.println("El numero " + x + " es impar");
	  }
	  
	  */
	  
	  /*
	  
      System.out.println("Hola Mundo :)");

      //Enteros: Números que no tienen decimales

      byte edad = 127;
      short year = -32768;
      int id_user = 1001;
      long id_twitter = 123456789123456789L;

      //Punto Flotante: Números con decimales

      float diametro = 34.25F;
      double precio = 123123.31231231241241314;

      //Texto: Solo almacena una letra o un número. Tienen qu estar entre ''.

      char genero = 'M';

      //Logico:

      boolean isVisible = true;
      boolean funciona = false;

      //--------

      int variable = 2;
      int _variable = 3;
      int $variable = 4;
      int variable1 = 5;


      //Constantes

      int VALOR = 0;
      int VALOR_MAXIMO = 1;

      //Lower Camel Case para metodos y declaracion de variables

      int minValor = 4;

      //Cast

      byte b = 6;
      short s = b;

      b = (byte) s;

      int i = 1;
      double d = 2.8;

      i = (int) d;

      int codigo = 97;
      char codigoASCII = (char) codigo;

      
      short numero = 300;
      byte numeroByte = (byte) numero;

      //Arrays:
      //Declaración de array

      int[] arregloInt = new int[2];

      double arregloDouble[];

      int[][] array2D = new int[2][3];// caben 6 cupcakes

      int [][][] array3D = new int[3][3][2];// Renglon, columna y altura

      //int [][][][] array4D = new int[1][2][3][4];

      char[][] days = { { 'M', 'T', 'W' }, { 'M', 'T', 'W' } };

      char[][][] letters = { { { 'a', 'b' }, { 'a', 'b' }, { 'a', 'b' } }, { { 'a', 'b' }, { 'a', 'b' }, { 'a', 'b' } } };

      char[] names = new char[4];

      names[0] = 'h';
      names[1] = 'o';
      names[2] = 'l';
      names[3] = 'a';


      System.out.println(names[0]);
      System.out.println(names[1]);
      System.out.println(names[2]);
      System.out.println(names[3]);

      char[][][][] monkey = new char[2][3][2][2];
      monkey[1][0][0][1] = 'm';

      //System.out.println(monkey[1][0][0][1]);

      //Operadores Aritméticos

      int a = 1;
      int aa = a + a;

      //System.out.println("el valor de aa es: " + aa);

      double x = 2.56;
      int y = 9;
      float w = (float)x + y;

      //System.out.println(w);

      //System.out.println(w*2);

      double k = 4/0.00002;

      //System.out.println(k);

      //System.out.println(7%2);

      double f = 2;
      int g = 3;
      //f = f + g;
      f %= g;
      
      //System.out.println(f);


      int l = 3;
    //  l++;
    //  ++l;
     // System.out.println(l);

      

       Prefijo ++l
      1. Incrementar el valor (l+1)
      2. Asignar el valor a l (l=l)
      

        Postfijo l++
      1. Asignar el valor a l (l=l)
      2. Incrementar el valor (l+1)
      

       //System.out.println(++l);
       //System.out.println(l++);
       //System.out.println(l);//4


       //Operadores de equidad:

       int q = 8;
       int p = 5;
      
       System.out.println(q == p);//false
       System.out.println(q != p);//true
       


       //Operadores relacionales:

        System.out.println("q > p -> " + (q > p));//true
        System.out.println("q < p -> " + (q < p));//false

        System.out.println("q >= p -> " + (q >= p));//true
        System.out.println("q <= p -> " + (q <= p));//false

      //Operadores lógicos 

      boolean n = false;
      boolean m = true;

      //&& (AND):

      System.out.println("n && m -> " + (n && m ));//false

      //|| (OR):

      System.out.println("n || m -> " + (n || m ));//true

      //!a (NOT) (negar el valor de un dato):

      System.out.println("!n -> " + (!n));//true
      System.out.println("!m -> " + (!m));//false


      //Controlo de flujo
      // If/else

      if (q > p) {
      //true

      System.out.println("Sí es mayor" );

      } else if(q == p) {
      //false

      System.out.println("Es igual" );

      } else {

      System.out.println("No es mayor y no es igual" );

      }


      //Switch

      int mes = 8;

      switch (mes) {
           case 1:
              System.out.println("Enero" );
              break;
           case 2:
              System.out.println("Febrero" );
              break;
           case 3:
              System.out.println("Marzo" );
              break;
           case 4:
              System.out.println("Abril" );
              break;
           case 5:
              System.out.println("Mayo" );
              break;
           case 6:
              System.out.println("Junio" );
              break;
           case 7:
              System.out.println("Julio" );
              break;
           case 8:
              System.out.println("Agosto" );
              break;
           default:
              System.out.println("Mes Incorrecto!" );
              break;

      }

      //Bucle while
      int e = 1;

      while (e <= 5) {
              System.out.println("e es menor o igual a 5" );
              e++;
      }

      //Bucle for

      System.out.println();

      int[] numeros = new int[5];

      for(int c = 0; c < 5; c++) {
         numeros[c] = c;
         System.out.println("numeros["+c+"]: " + numeros[c]);
      }

       //Bucle forEach

       for(int j : numeros) {
         System.out.println(j);
      }

      
      Además de manejar bucles for sencillos como en el ejemplo anterior,
      podemos manejarlos también anidados como es el caso que 
      quisiéramos iterar un array de 2 o 3 dimensiones.
      La mejor forma de verlo en práctica es utilizando un arreglo de 
      2 dimensiones haríamos lo siguiente:
      
    

      //Definimos un array de 3 filas x 5 columnas
      int array[][]={{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};

      //Recorremos el array multidimensional
      for (int i=0;i<array.length;i++){
          for(int j=0;j<array[0].length;j++){
              System.out.println(array[i][j]);
          }
      }

      // Ahora si lo hiciéramos con un foreach tendríamos lo siguiente:

      //Definimos un array de 3 filas x 5 columnas
      int array[][]={{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};

      //Recorremos el array multidimensional
      for (int[] arrayInterno : array){
          for(int numero: arrayInterno){
              System.out.println(numero);
          }
      }

      


      System.out.println("Continuamos con el flujo" );

     // System.out.println(numeroByte);
      
      */
  }
}

