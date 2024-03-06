package co.edu.uniquindio.poo;

public class Pedido {
    private String nombre;
    private String celular;
    private String direccionResidencia;
    private TipoPago tipoPago;
    private EnsaladaFrutas ensaladaFrutas;
    private TipoCompra tipoCompra;


    public Pedido(String nombre, String celular, String direccionResidencia, TipoPago tipoPago,
            EnsaladaFrutas ensaladaFrutas, TipoCompra tipoCompra) {
        this.nombre = nombre;
        this.celular = celular;
        this.direccionResidencia = direccionResidencia;
        this.tipoPago = tipoPago;
        this.ensaladaFrutas = ensaladaFrutas;
        this.tipoCompra=tipoCompra;
    }
    public TipoCompra getTipoCompra() {
        return tipoCompra;
    }
    public void setTipoCompra(TipoCompra tipoCompra) {
        this.tipoCompra = tipoCompra;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getDireccionResidencia() {
        return direccionResidencia;
    }
    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }
    public TipoPago getTipoPago() {
        return tipoPago;
    }
    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }
    public EnsaladaFrutas getEnsaladaFrutas() {
        return ensaladaFrutas;
    }
    public void setEnsaladaFrutas(EnsaladaFrutas ensaladaFrutas) {
        this.ensaladaFrutas = ensaladaFrutas;
    }

    public static PedidoBuilder builder(){
        return new PedidoBuilder();
    }

    public static class PedidoBuilder{
        private String nombre;
        private String celular;
        private String direccionResidencia;
        private TipoPago tipoPago;
        private EnsaladaFrutas ensaladaFrutas;
        private TipoCompra tipoCompra;

        private PedidoBuilder(){}

        public PedidoBuilder celular(String celular){
            this.celular=celular;
            return this;
        }
        public PedidoBuilder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }
        public PedidoBuilder direccionResidencia(String direccionResidencia){
            this.direccionResidencia=direccionResidencia;
            return this;
        }
        public PedidoBuilder tipoPago(TipoPago tipoPago){
            this.tipoPago=tipoPago;
            return this;
        }
        public PedidoBuilder ensaladaFrutas(EnsaladaFrutas ensaladaFrutas){
            this.ensaladaFrutas=ensaladaFrutas;
            return this;
        }
        public PedidoBuilder tipoCompra(TipoCompra tipoCompra){
            this.tipoCompra=tipoCompra;
            return this;
        }
        public Pedido build(){
            if(nombre == null || celular == null ){
                throw new IllegalArgumentException("El nombre y el celular deben estar");
            }
            return new Pedido(nombre, celular, direccionResidencia, tipoPago, ensaladaFrutas, tipoCompra);
        }   
     }
}
