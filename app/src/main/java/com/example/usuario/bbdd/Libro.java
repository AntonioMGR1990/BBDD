package com.example.usuario.bbdd;

/**
 * Created by Usuario on 28/03/2018.
 */

class Libro {
    private int _id;
    private String titulo;
    private String autor;
    private double precio;

    public Libro() {
    }

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public Libro(int _id, String titulo, String autor, double precio) {
        this._id = _id;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;

        if (_id != libro._id) return false;
        if (Double.compare(libro.precio, precio) != 0) return false;
        if (titulo != null ? !titulo.equals(libro.titulo) : libro.titulo != null) return false;
        return autor != null ? autor.equals(libro.autor) : libro.autor == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = _id;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
