package com.juliocesar.domain.enums;

public enum TipoCliente {

    //AO MAPEAR A JPA ELE SALVA O NOME ABAIXO OU UM NMR INTEIRO PARTINDO DO 0, EM FORMA NMR É FEITO AUTOMÁTICAMENTE MAS N É IDICADO, DEVE FAZER UM CONTROLE MANUAL
    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    //construtor de tipo enumera é private

    private int cod;
    private String descricao;

    TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (TipoCliente x : TipoCliente.values()) {
            if (cod.equals(x.getCod())) ;
            return x;
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }

//    public static TipoCliente toEnum(Integer cod) throws IllegalAccessException {
//        if (cod == null){
//            return null;
//        }
//
//        for (TipoCliente x : TipoCliente.values()){
//            if (cod.equals(x.getCod())){
//                return x;
//            }
//        }
//        throw new IllegalAccessException("Id inválido: " + cod);
//    }
}
