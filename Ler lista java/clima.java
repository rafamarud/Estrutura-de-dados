public class clima {
    public String ano;
    public String mes;
    public String temperatura;
    public String precipitacao;
    
    public clima(String ano, String mes, String temperatura, String precipitacao) {
        this.ano = ano;
        this.mes = mes;
        this.temperatura = temperatura;
        this.precipitacao = precipitacao;
    }

    //reescrevos toString para exibir um objeto completo da classe
    @Override
    public String toString() {
        return "clima [ano=" + ano + ", mes=" + mes + ", temperatura=" + temperatura + ", precipitacao=" + precipitacao + "]";
    }

    
    //reesrevemos equals para definir os atributos identificadores
    @Override
    public boolean equals(Object obj) {
        clima c = (clima)obj;
       return (this.ano.equals(c.ano) && this.mes.equals(c.mes));
    }
}

