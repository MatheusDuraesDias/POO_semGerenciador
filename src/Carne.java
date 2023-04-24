public class Carne extends Alimento{
    private String animal;

    private String corte;

    private String linha;

    public Carne(double preco, double calorias, Data validade, String animal, String corte, String linha) {
        super(preco, calorias, validade);
        this.animal = animal;
        this.corte = corte;
        this.linha = linha;
    }
    public Carne(double preco, double calorias, Data validade, String animal, String corte) {
        super(preco, calorias, validade);
        this.animal = animal;
        this.corte = corte;
    }

    @Override
    public String toString() {
        return "Carne{" +
                "animal='" + animal + '\'' +
                ", corte='" + corte + '\'' +
                ", linha='" + linha + '\'' +
                ", preco=" + preco +
                ", calorias=" + calorias +
                ", validade=" + validade +
                '}';
    }

    public double calcularPreco(){
        if (this.linha == "premium"){
            return  this.preco*1.15;
        } else if (this.linha == "Maturatta") {
            return  this.preco*1.05;
        }
        else {
            return this.preco;
        }
    }

    public void alterarLinha(){
        this.linha = "comum";
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public void alterarLinha(String novaLinha){
        this.linha = novaLinha;
    }
}
