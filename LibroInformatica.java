public class LibroInformatica extends Libro{

    public LibroInformatica(String titulo, String autor, int cantPags, int cantCaps, int diasMaxPrestamo, boolean prestado) {
        super(titulo, autor, cantPags, cantCaps, diasMaxPrestamo, prestado);
        this.diasMaxPrestamo = 14;
    }



    @Override
    void prestar(int cantDias) {
        if(cantDias> this.diasMaxPrestamo || cantDias <= 0 || this.isPrestado() == true) return;

        this.setPrestado(true);
    }

    @Override
    public String toString() {
        return "LibroInformatica{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantPags=" + cantPags +
                ", cantCaps=" + cantCaps +
                ", diasMaxPrestamo=" + diasMaxPrestamo +
                ", prestado=" + prestado +
                '}';
    }
}
