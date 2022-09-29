public class transporte {
    private Integer id;
    private Integer ano;
    private String modelo;
    private Double cargaMaxima;
    private Double portencia;

    public transporte(Integer id, Integer ano, String modelo, Double cargaMaxima, Double portencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.portencia = portencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Double getPortencia() {
        return portencia;
    }

    public void setPortencia(Double portencia) {
        this.portencia = portencia;
    }

    public Double consumo(){
       double c = this.portencia = this.cargaMaxima * 100;
        return c;
    }

    public String leiaModelo(){
        return "retornando o metodo leiaModelo da clase transporte";
    }
    
    public void gravaModelo(String modelo){
        System.out.println("Retornando o metodo gravaModelo da classe Transporte");
    
    }

}