package domain;

import anotacao.TabelaAnnotation;

public class Tabelas {

    @TabelaAnnotation(value = "tabela de valores")
    String tabelaDeValores;

    @TabelaAnnotation(value = "tabela de Contas")
    String tabelaDeContas;

    @TabelaAnnotation(value = "tabela de Lucro")
    String tabelaDeLucro;


}
