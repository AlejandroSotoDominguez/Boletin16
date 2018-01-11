
package boletin16;

import com.alex.persoal.Persoal;
import javax.swing.JOptionPane;

public class Academica {
    private static int numReferencia = 2018;
    private String nome;
    private double nota;
    private Persoal persoalAlum;
    private double boletines = 0;
    private double boletinesTotales=17;
    private int puntuacionBoletines;

    public Academica() {  
    }

    public Academica(String nome, int nota, Persoal persoalAlum) {
        this.numReferencia = numReferencia;
        this.nome = nome;
        this.nota = nota;
        this.persoalAlum = persoalAlum;
    }
    
    public double calcular(){
        
        double escrita1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la primera prueba escrita"));
        double escrita2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la segunda prueba escrita"));
        
        double media = (escrita1+escrita2)/2;
        double totalEscrita = (media*40)/100;
        
        double practica = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la prueba práctica"));
        practica = (practica*40)/100;     
        
        for(int i=0;i<=17;i++){
            
            int ax = JOptionPane.showConfirmDialog(null,"¿Boletín "+i+" entregado?");
                if(ax == JOptionPane.YES_OPTION){
                    ++boletines;
                }
                
        }
        if(boletines > ((boletinesTotales*90)/100)){
                    puntuacionBoletines = 2;
                }else if(boletines <= ((boletinesTotales*90)/100) && boletines >= ((boletinesTotales*70)/100)){
                    puntuacionBoletines = 1;
                }else{
                    puntuacionBoletines = 0;
                }

        return totalEscrita+practica+puntuacionBoletines;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "numReferencia = " + numReferencia++ + ", nome = " + nome + ", nota = " + nota + ", persoalAlum = " + persoalAlum;
    }
}
