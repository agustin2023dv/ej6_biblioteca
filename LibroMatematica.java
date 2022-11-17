public class LibroMatematica extends Libro{

    public LibroMatematica(String titulo, String autor, int cantPags, int cantCaps, int diasMaxPrestamo, boolean prestado) {
        super(titulo, autor, cantPags, cantCaps, diasMaxPrestamo, prestado);
        this.diasMaxPrestamo = 10;
    }

    @Override
    void prestar(int cantDias) {
        if(cantCaps == 1 && (cantDias > 7 || cantDias <=0)) return;
        if(cantCaps >= 2 && (cantDias>21 || cantDias <=0)) return;
        this.setPrestado(true);
    }

    @Override
    public String toString() {
        return "LibroMatematica{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantPags=" + cantPags +
                ", cantCaps=" + cantCaps +
                ", diasMaxPrestamo=" + diasMaxPrestamo +
                ", prestado=" + prestado +
                '}';
    }
}
