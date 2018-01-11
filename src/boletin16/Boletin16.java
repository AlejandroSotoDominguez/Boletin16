
package boletin16;

import com.alex.persoal.Persoal;

public class Boletin16 {

    public static void main(String[] args) {
        Persoal persoa1 = new Persoal("777777777","pedro@gmail.com");
        Persoal persoa2 = new Persoal("666666666","manuel@gmail.com");
        Academica alumno1 = new Academica("pedro",6,persoa1);
        System.out.println(alumno1.toString());
        Academica alumno2 = new Academica("manuel",5,persoa2);
        System.out.println(alumno2.toString());
        alumno1.setNota(alumno1.calcular());
        alumno2.setNota(alumno1.calcular());
        System.out.println("Nota final "+alumno1.getNome()+": "+alumno1.getNota());
        System.out.println("Nota final "+alumno2.getNome()+": "+alumno2.getNota());
    }
}
