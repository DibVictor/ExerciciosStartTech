package playground;
/* 
* Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior valor.
*/
import java.util.Random;
import java.util.ArrayList; 

public class Matriz10Por10 {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        int linha = 0, coluna = 0;
        
        for(int i = 1; i <= 100; i++){
            numeros.add(i);
        }
        for(int i = 0; i < 10; i++){

            matriz.add(new ArrayList<>());

            for(int j = 0; j < 10; j++){

                int indice = random.nextInt(0, numeros.size());
                matriz.get(i).add(numeros.get(indice));
                numeros.remove(indice);

            }
        }

        System.out.println();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(matriz.get(linha).get(coluna) < matriz.get(i).get(j)){
                    linha = i;
                    coluna = j;
                }
            }
        }
        

    }
}


        // ArrayList<Boolean> repetido;
        // int numero;

        
        // for(int i = 0; i < 10; i++){
        //     for(int j = 0; j < 10; j++){
        //         do{
        //             numero = random.nextInt(1, 100);
        //             repetido = new ArrayList<>();
        //             for(ArrayList<Integer> vetor : matriz){
        //                 repetido.add(vetor.contains(numero));
        //             }
        //         }while(repetido.contains(true));
        //         matriz.get(i).add(numero);
        //     }
        // }