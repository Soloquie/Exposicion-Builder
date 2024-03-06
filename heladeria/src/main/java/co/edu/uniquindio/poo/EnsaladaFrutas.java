package co.edu.uniquindio.poo;

public class EnsaladaFrutas {
    private Boolean banano;
    private Boolean sandia;
    private Boolean mango;
    private Boolean papaya;
    private Boolean manzana;
    private Liquido liquido;
    private int precio;
    private SaborHelado saborHelado;
    public EnsaladaFrutas(Boolean banano, Boolean sandia, Boolean mango, Boolean papaya, Boolean manzana,
            Liquido liquido, SaborHelado saborHelado) {
        this.banano = true;
        this.sandia = true;
        this.mango = mango;
        this.papaya = papaya;
        this.manzana = manzana;
        this.liquido = liquido;
        this.saborHelado=saborHelado;
        this.precio=10000;
    }
    
    public Boolean getBanano() {
        return banano;
    }
    public void setBanano(Boolean banano) {
        this.banano = banano;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Boolean getSandia() {
        return sandia;
    }
    public void setSandia(Boolean sandia) {
        this.sandia = sandia;
    }
    public Boolean getMango() {
        return mango;
    }
    public void setMango(Boolean mango) {
        this.mango = mango;
    }
    public Boolean getPapaya() {
        return papaya;
    }
    public void setPapaya(Boolean papaya) {
        this.papaya = papaya;
    }
    public Boolean getManzana() {
        return manzana;
    }
    public void setManzana(Boolean manzana) {
        this.manzana = manzana;
    }
    public Liquido getLiquido() {
        return liquido;
    }
    public void setLiquido(Liquido liquido) {
        this.liquido = liquido;
    }
    public void setSaborHelado(SaborHelado saborHelado) {
        this.saborHelado = saborHelado;
    }
    public SaborHelado getSaborHelado() {
        return saborHelado;
    }
    
    public static EnsaladaFrutasBuilder builder(){
        return new EnsaladaFrutasBuilder();
    }

    public static class EnsaladaFrutasBuilder{
        private Boolean banano;
        private Boolean sandia;
        private Boolean mango;
        private Boolean papaya;
        private Boolean manzana;
        private Liquido liquido;
        private SaborHelado saborHelado;

        private EnsaladaFrutasBuilder(){}

        public EnsaladaFrutasBuilder banano(Boolean banano){
            this.banano=banano;
            return this;
        }

        public EnsaladaFrutasBuilder sandia(Boolean sandia){
            this.sandia=sandia;
            return this;
        }

        public EnsaladaFrutasBuilder mango(Boolean mango){
            this.mango=mango;
            return this;
        }

        public EnsaladaFrutasBuilder papaya(Boolean papaya){
            this.papaya=papaya;
            return this;
        }

        public EnsaladaFrutasBuilder manzana(Boolean manzana){
            this.manzana=manzana;
            return this;
        }

        public EnsaladaFrutasBuilder liquido(Liquido liquido){
            this.liquido=liquido;
            return this;
        }

        public EnsaladaFrutasBuilder saborHelado(SaborHelado saborHelado){
            this.saborHelado=saborHelado;
            return this;
        }

        public EnsaladaFrutas build(){
            if(banano == false || sandia == false){
                throw new IllegalArgumentException();
            }
            return new EnsaladaFrutas(banano, sandia, mango, papaya, manzana,
         liquido, saborHelado);
    }

}

    @Override
    public String toString() {
        return "EnsaladaFrutas [banano=" + banano + ", sandia=" + sandia + ", mango=" + mango + ", papaya=" + papaya
                + ", manzana=" + manzana + ", liquido=" + liquido + ", precio=" + precio + ", saborHelado="
                + saborHelado + "]";
    }
}
