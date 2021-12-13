import java.util.Scanner;

/**
 * Esta clase comprueba si tres numeros introducidos pueden formar una fecha correcta.
 * @author Andres Ibanez vargas
 * @version 12-2021
 * @since 12-2021
 */


public class MetodosConParametros {

        public static void main(String[] args) {
                // Vamos a hacer una calculadora
                // Pedimos: dos números y una operacion
                // Hacemos la operacion correspondiente
                // Imprimimos el resultado

                // Recoger datos
                Scanner sc = new Scanner(System.in);
                System.out.println("Num:");
                double a = sc.nextDouble();
                System.out.println("Num:");
                double b = sc.nextDouble();
                // llamo al método menu y devuelvo la operacion seleccionada
                int operacion = menu();

                seleccionarOperacion(operacion, a, b);

        }

        /**
         *
         * Metodo suma, realiza la suma de los numeros introducidos
         * @param a primer numero introducido
         * @param b segundo numero introducido
         */
        public static void suma(double a, double b){
                double suma = a + b;
                System.out.println("Suma: " + suma);
        }

        /**
         * Metodo resta, realiza la Resta los numeros introducidos
         * @param num1 primer numero introducido
         * @param num2 segundo numero introducido
         */
        public static void resta(double num1, double num2) {
                double resta = num1 - num2;
                System.out.println("Resta" + resta);
        }

        /**
         * Metodo producto Multiplica los numeros introducidos
         * @param num1 primer numero introducido
         * @param num2 segundo numero introducido
         */
        public static void producto(double num1, double num2) {
                double producto = num1 * num2;
                System.out.println("Producto: " + producto);
        }

        /**
         * metodo cociente es la Division de los numeros introducidos
         * @param num1 primer nummero introducido
         * @param num2 segundo numero introducido
         */
        public static void cociente(double num1, double num2) {
                double cociente = num1 / num2;
                System.out.println("Cociente: " + cociente);
        }


        /**
         * Metodo menu elige la opcion para realizar la operacion
         * int op sirve para escribir la opcion que quiera
         * @return sirve para devolver la opcion escogida y la devuelve a operacion
         */
        public static int menu() { // presenta el menú de opciones, y devuelve el código de operación
                Scanner sc = new Scanner(System.in);
                System.out.println("Operacion: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
                int op = sc.nextInt();
                return op;
        }

        /**
         * Metodo seleccionarOperacion Realiza la operacion elegida y redirige al metodo sleccionado suma, resta, producto, cociente
         * @param op opcion elegida a realizar
         * @param a primer numero introducido
         * @param b segundo numero introducido
         */
        public static void seleccionarOperacion(int op, double a, double b) {
                if (op == 1) {
                        // Suma
                        suma(a, b);
                } else if (op == 2) {
                        // Resta
                        resta(a, b);
                } else if (op == 3) {
                        // Multiplicación
                        producto(a, b);
                } else if (op == 4) {
                        // Cociente
                        cociente(a, b);
                } else {
                        System.out.println("Opción incorrecta");
                }
        }
}
