package Funciones;

public class Fn_Eliminacion_ordenada {

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] arreglo = {1, 3, 5, 7, 9};
        int valorAEliminar = 5;
        int[] resultado = eliminacionOrdenada(arreglo, valorAEliminar);
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }

    /**
     * Elimina un elemento de un arreglo ordenado y devuelve un nuevo arreglo.
     * Realiza la búsqueda del elemento y su eliminación en un solo paso.
     * @param arreglo El arreglo ordenado de donde eliminar el elemento.
     * @param valor El valor a eliminar.
     * @return Un nuevo arreglo sin el valor especificado.
     */
    static int[] eliminacionOrdenada(int[] arreglo, int valor) {
        int indice = -1;
        // Búsqueda del índice del valor a eliminar
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            return arreglo; // Si el valor no está, retorna el arreglo original sin cambios.
        }

        int[] nuevoArreglo = new int[arreglo.length - 1];
        // Copia los elementos hasta el índice del valor
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, indice);
        // Omite el valor a eliminar y copia el resto
        System.arraycopy(arreglo, indice + 1, nuevoArreglo, indice, arreglo.length - indice - 1);
        return nuevoArreglo;
    }
}
