

public class AntonLetters {
    public static void main(String[] args) throws Exception {
        int resultado;
       
        char [] arrayCaracteres={'a','e','a','a','e'};
       

        resultado=countingLetters(arrayCaracteres);
        System.out.println("numero diferente de caracteres: "+resultado);


    }

    public static int countingLetters(char [] arrayCaracteres){

        int cantNumdif;
        int contadorCoincidencias = 0;
        
        for (int i = 0; i < arrayCaracteres.length - 1; i++) {
            int contadorParcial=0;
            for (int j = 1; j < arrayCaracteres.length - i; j++) {
                if (arrayCaracteres[i] == arrayCaracteres[j+i] ){
                    if(contadorParcial==0){
                        contadorParcial= contadorParcial + 1;
                        contadorCoincidencias=contadorCoincidencias+contadorParcial;
                    }
                    
                }

            }
        }

       

        if (contadorCoincidencias > 0) {
            cantNumdif = arrayCaracteres.length-(contadorCoincidencias);
        } else {
            cantNumdif = 0;
        }
        return cantNumdif;



    }
}
