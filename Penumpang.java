public class Penumpang
{
    private int id;
    private int umur;
    private boolean hamil;
    private int saldo = 10000;
    private String nama;

   
    public Penumpang(int id, int umur, boolean hamil,String nama)
    {
        this.id = id;
        this.umur = umur;
        this.hamil = hamil;
        this.nama = nama;
    }

    public int getID()
    {
        return id;
    }
    
    public int getUmur()
    {
        return umur;
    }
    
    public boolean getHamil()
    {
        return hamil;
    }
    
    public int getSaldo()
    {
        return saldo;
    }
    
    public String getNama()
    {
        return nama;
    }
    
    public void tambahSaldo(int saldobaru)
    {
        saldo = saldobaru + saldo;
    }
    
    public void kurangiSaldo(int ongkos)
    {
        saldo = saldo - ongkos;
    }
}
