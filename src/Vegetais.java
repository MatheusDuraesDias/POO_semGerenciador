public class Vegetais extends Alimento{
    private double peso;
    private String secao;
    private String tipo;


    public Vegetais(double preco, double calorias, Data validade, double peso, String secao, String tipo) {
        super(preco, calorias, validade);
        this.peso = peso;
        this.secao = secao;
        this.tipo = tipo;
    }

    public Vegetais(double preco, double calorias, Data validade, double peso, String tipo) {
        super(preco, calorias, validade);
        this.peso = peso;
        this.tipo = tipo;
        this.secao = "inorgânico";
    }

    public double calcularPreco(){
        if (this.secao == "orgânicos"){
            return this.preco*1.1;
        }
        else {
            return this.preco;
        }

    }

    public  void alterarSecao(){
        this.secao = "inorgânico";
    }

    public  void alterarSecao(String novaSecao){
        this.secao = novaSecao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Vegetais{" +
                "peso=" + peso +
                ", secao='" + secao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                ", calorias=" + calorias +
                ", validade=" + validade +
                '}';
    }
}
