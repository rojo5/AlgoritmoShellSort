/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoshellshort;

/**
 *
 * @author rojo5
 */
public class AlgoritmoShellShort {
static int[] numeros= {10,7,21,32,4,5,12,45,98,1,20,55,11,22,33};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ordenacionShell(numeros);
//        for(int i =0; i < numeros.length;i++){
//        System.out.print(numeros[i]+ " ");
//        }
        
        ordenaNumeros(numeros);
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        }
    }
    
    
    public static void ordenaNumeros(int[] arrayNum){
        int longitud = arrayNum.length;
        int incremento = longitud;
        
        do{
            incremento=incremento/2;
            for(int i=0;i<incremento;i++){
                for(int u= incremento+i; u< longitud; u+=incremento){
                    int aux = u;
                    while(aux-incremento >=0 && arrayNum[aux] < arrayNum[aux- incremento]){
                        int posicion = arrayNum[aux];
                        arrayNum[aux] = arrayNum[aux- incremento];
                        arrayNum[aux- incremento] = posicion;
                        aux -=incremento;
                    }
                }
            }
        }while(incremento>1);
        
    }
    
    public static void ordenacionShell(int[] v) {
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j] < v[j - incremento]) {
                        int tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    }
    
}
