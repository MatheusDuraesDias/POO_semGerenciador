public class Alimento {
    protected double preco;

    protected double calorias;

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public Data getValidade() {
        return validade;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    protected Data validade;

    public Alimento(double preco, double calorias, Data validade) {
        this.preco = preco;
        this.calorias = calorias;
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "preco=" + preco +
                ", calorias=" + calorias +
                ", validade=" + validade +
                '}';
    }

    public Alimento(double preco, double calorias) {
        this.preco = preco;
        this.calorias = calorias;
        this.validade = new Data(31, 12, 2023);
    }

    public double calcularPreco(){
        return preco;
    }

    public void aumentarPreco(){
        this.preco*=1.1;
    }

    public void aumentarPreco(double aumento){
        this.preco += this.preco*aumento/100;
    }
}
