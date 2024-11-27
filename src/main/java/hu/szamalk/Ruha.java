package hu.szamalk;

public class Ruha {
    private String tulajdonos;
    private boolean tiszta;

    public Ruha(String tulajdonos, boolean tiszta) {
        this.tulajdonos = tulajdonos;
        this.tiszta = true;

    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    @Override
    public String toString() {
        return "Ruha{" +
                "tulajdonos='" + tulajdonos + '\'' +
                ", tiszta=" + tiszta +
                '}';
    }
}
