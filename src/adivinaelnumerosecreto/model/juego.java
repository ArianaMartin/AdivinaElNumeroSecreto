/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumerosecreto.model;

/**
 *
 * @author Andres
 */
public class juego {
    private NumeroSecreto numeroSecreto;
    private int limiteInferior;
    private int limiteSuperior;
    private int numeroDeIntentos;
    private int intentosRealizados;
    
   public void setRangoDelNumeroSecreto(int limiteInferior, int limiteSuperior) {
this.limiteInferior = limiteInferior;
this.limiteSuperior = limiteSuperior;
numeroSecreto.setRango(this.limiteInferior, this.limiteSuperior);
}
   public juego(int limiteInferior, limiteSuperior, int intentos){
       this.limiteInferior = limiteInferior;
this.limiteSuperior = limiteSuperior;
this.numeroDeIntentos = intentos;
this.numeroSecreto = new NumeroSecreto(this.limiteInferior, this.limiteSuperior);
this.intentosRealizados = 0;
   }
   public void setNumeroDeIntentos(int intentos){
       this.numeroDeIntentos = intentos;
   }
   public boolean esElNumeroSecreto(int numero){
       this.intentosRealizados++;
       return numeroSecreto.esIgual(numero);
   }
   public boolean puedeIntentarloDeNuevo(){
       boolean hayMasOportunidades = this.intentosRestantes () >0;
       return hayMasOportunidades;
   }
   public int intentosRestantes(){
       int numeroDeIntentosRestantes =this.numeroDeIntentos - this.intentosRealizados;
       return (numeroDeIntentosRestantes);
   }
   public String getTextoDeAyuda(int numero) {
String texto = null;
if (this.numeroSecreto.esMayor(numero) == true) {
texto = "mayor";
}
else if (this.numeroSecreto.esMenor(numero) == true) {
texto = "menor";
}
return texto;
}

    public boolean puedeIntentarDeNuevo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
