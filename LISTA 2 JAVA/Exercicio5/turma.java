public class turma {
    private String cod;
    private Integer turno;
    private Integer sala;

    public turma(String cod, Integer turno, Integer sala) {
        this.cod = cod;
        this.turno = turno;
        this.sala = sala;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

}
