package codelab.modul4.perpustakaan;

abstract class Buku {
    protected String judul;
    protected String penulis;

    public Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    abstract void displayInfo();
}
