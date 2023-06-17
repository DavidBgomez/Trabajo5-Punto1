package Main;

public class Notas {
    double[] listaNotas;
    
    public Notas(){
        listaNotas = new double[5];
    }
    
    double calcularPromedio(){
        double suma = 0;
        for (int i=1; i<listaNotas.length; i++){
            suma=suma+listaNotas[i];
        }
        return (suma/listaNotas.length);
    }
    
    double calcularDesviacion(){
        double prom = calcularPromedio();
        double suma = 0;
        for(int i=0;i<listaNotas.length;i++){
            suma+=Math.pow(listaNotas[i] - prom, 2);
        }
        return Math.sqrt(suma/listaNotas.length);
    }
    
    double calcularMenor(){
        double Menor = listaNotas[0];
        for(int i =0; i<listaNotas.length;i++){
            if(listaNotas[i]<Menor){
                Menor=listaNotas[i];
            }
        }
        
        return Menor;
    }
    
    double calcularMayor(){
        double Mayor = listaNotas[0];
        for (int i=0; i<listaNotas.length;i++){
            if(listaNotas[i]>Mayor){
                Mayor=listaNotas[i];
            }
        }
        
        return Mayor;
    }
    
}
