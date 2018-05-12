
package entidades;


public class Cliente {
    private int IdCliente;
    private String Nombrecliente;
    private String NIT;

    public Cliente() {
    }

    public Cliente(int IdCliente, String Nombrecliente, String NIT) {
        this.IdCliente = IdCliente;
        this.Nombrecliente = Nombrecliente;
        this.NIT = NIT;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombrecliente() {
        return Nombrecliente;
    }

    public void setNombrecliente(String Nombrecliente) {
        this.Nombrecliente = Nombrecliente;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    
    
    
}
