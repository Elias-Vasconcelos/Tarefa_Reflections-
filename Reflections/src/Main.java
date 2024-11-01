import anotacao.TabelaAnnotation;
import domain.Tabelas;

import java.lang.reflect.Field;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tabelas tabela = new Tabelas();
        recuperaAnnotations(tabela);

    }

    private static void recuperaAnnotations(Tabelas tabela) {
        Field[] filds = tabela.getClass().getDeclaredFields();


        for (Field f : filds ){

            if(f.isAnnotationPresent(TabelaAnnotation.class)){
                TabelaAnnotation anotacao = f.getAnnotation(TabelaAnnotation.class);
                System.out.println("O nome de tabela é :");
                System.out.println(f.getName());
                System.out.println("Anotaçao :");
                System.out.println(anotacao.value());
                System.out.println("--------------------------------- ");
                System.out.println(" ");
            }

        }
    }
}