package e4.g2;

public class Producto implements Comparable<Producto>{
    private String descripcion;
    private int codigo;
    private int stock;
    private double precio;
    private Categoria rubro;

    public Producto(String descripcion, int codigo, int stock, double precio, Categoria rubro) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.rubro = rubro;
    }

    public Producto() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto o){
        if(codigo==o.codigo){
            return 0;
        }else if(codigo>o.codigo){
            return 1;
        }else{
            return -1;
        }
    }
}






