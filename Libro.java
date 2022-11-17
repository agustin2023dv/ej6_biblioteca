public abstract class Libro {

    String titulo, autor;
    int cantPags, cantCaps, diasMaxPrestamo;

    boolean prestado;

    public Libro(String titulo, String autor, int cantPags, int cantCaps, int diasMaxPrestamo, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantPags = cantPags;
        this.cantCaps = cantCaps;
        this.diasMaxPrestamo = diasMaxPrestamo;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPags() {
        return cantPags;
    }

    public void setCantPags(int cantPags) {
        this.cantPags = cantPags;
    }

    public int getCantCaps() {
        return cantCaps;
    }

    public void setCantCaps(int cantCaps) {
        this.cantCaps = cantCaps;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public int getDiasMaxPrestamo() {
        return diasMaxPrestamo;
    }

    public void setDiasMaxPrestamo(int diasMaxPrestamo) {
        this.diasMaxPrestamo = diasMaxPrestamo;
    }

    abstract void prestar(int cantDias);
}
