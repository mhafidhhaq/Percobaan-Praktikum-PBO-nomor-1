package praktikum2;

public class Buku {
    private String pengarang, judul;
    public static void main(String args[]){
        Buku a,b;
        a= new Buku();
        b= new Buku();
        
        a.pengarang = "Felix Siauw";
        a.judul = "Beyond The Inspiration";
        
        b.pengarang = "Budi Raharjo";
        b.judul = "Mudah Belajar Java";
        
        System.out.println("judul : " + a.judul + " pengarang : " + a.pengarang);
        System.out.println("judul : " + b.judul + " pengarang : " + b.pengarang);
    }
    
}
