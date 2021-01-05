import java.util.ArrayList;
    
    public class Bus
    {
       private ArrayList<Penumpang> penumpangBiasa = new ArrayList<Penumpang>(16); 
        private ArrayList<Penumpang> penumpangPrioritas = new ArrayList<Penumpang>(4);
        private ArrayList<Penumpang> penumpangBerdiri = new ArrayList<Penumpang>(20);
        private int ongkos_bus = 2000;
        private int totalPendapatan = 0;
    
       public Bus()
        {
        }
        
       public ArrayList<Penumpang> getPenumpangBiasa()
        {
            return penumpangBiasa;
        }
        
       public ArrayList<Penumpang> getPenumpangPrioritas()
        {
            return penumpangPrioritas;
        }
        
       public ArrayList<Penumpang> getPenumpangBerdiri()
        {
            return penumpangBerdiri;
        }
        
       public int getJumlahPenumpangBiasa()
        {
            return penumpangBiasa.size();
        }
        
       public int getJumlahPenumpangPrioritas()
        {
            return penumpangPrioritas.size();
        }
        
       public int getJumlahPenumpangBerdiri()
        {
           return penumpangBerdiri.size();
        }
    
     public Boolean naikkanPenumpang(Penumpang penumpang)
        {
            int totalPenumpang = getJumlahPenumpangBiasa() + getJumlahPenumpangPrioritas() + getJumlahPenumpangBerdiri();
            
          if(totalPenumpang > 40 || penumpang.getSaldo() < ongkos_bus)
            {
                return false;
            }
            
            int umur = penumpang.getUmur();
            boolean hamil = penumpang.getHamil();
            
          if(umur > 60 || umur < 10 || hamil)
           {
               if(getJumlahPenumpangPrioritas() < 4)
               {
                  penumpangPrioritas.add(penumpang); 
               }
               else if(getJumlahPenumpangBiasa() < 16)
               {
                  penumpangBiasa.add(penumpang);
               }
               else
               {
                   return false;
               }
           }
           else
           {
               if(getJumlahPenumpangBiasa() < 16)
               {
                   penumpangBiasa.add(penumpang);
               }
               else if(getJumlahPenumpangBerdiri() < 20)
               {
                   penumpangBerdiri.add(penumpang);
               }
               else
               {
                   return false;
               }
           }
           
           penumpang.kurangiSaldo(ongkos_bus);
           totalPendapatan = totalPendapatan + ongkos_bus;
           return true;
        
     }
     
      public boolean turunkanPenumpang(String nama)
    {
        for(Penumpang penumpang : penumpangBiasa){
            String x = penumpang.getNama();
            
            if(x.equalsIgnoreCase(nama))
            {
                penumpangBiasa.remove(penumpang);
                return true;
            }
        }
        
        for(Penumpang penumpang : penumpangPrioritas){
            String x = penumpang.getNama();
            
            if(x.equalsIgnoreCase(nama))
            {
                penumpangPrioritas.remove(penumpang);
                return true;
            }
        }
        
        for(Penumpang penumpang : penumpangBerdiri){
            String x = penumpang.getNama();
            
            if(x.equalsIgnoreCase(nama)){
                penumpangBerdiri.remove(penumpang);
                return true;
            }
        }
        return false;
    }
    
     
     public String toString()
     {
       String penBiasa     = " ";
        String penPrioritas = " ";
        String penBerdiri = " ";
        
        for(Penumpang penumpang : penumpangBiasa)
        {
            penBiasa +=penumpang.getNama();
        }
        
        for(Penumpang penumpang : penumpangPrioritas)
        {
            penPrioritas +=penumpang.getNama();
        }
        
        for(Penumpang penumpang : penumpangBerdiri)
        {
            penBerdiri +=penumpang.getNama();
        }
        
        
        if(penumpangBiasa.isEmpty()==true)
        {
          penBiasa ="<kosong>";  
        }
        else
        {
            System.out.println("penumpang biasa = "+penBiasa);
        }
        
        if(penumpangPrioritas.isEmpty()==true)
        {
          penPrioritas = "<kosong>";  
        }
        else
        {
            System.out.println("penumpang prioritas = "+penPrioritas);
        }
        
        if(penumpangBerdiri.isEmpty()==true)
        {
          penBerdiri = "<kosong>"; 
        }
        else
        {
            System.out.println("penumpang berdiri = "+penPrioritas);
        }
        
        
        int jumlahPenumpang = getJumlahPenumpangBiasa() + getJumlahPenumpangPrioritas() + getJumlahPenumpangBerdiri();
        
        
        return "Penumpang Biasa : " + penBiasa + "\n" +
               "Penumpang Prioritas : " + penPrioritas + "\n" +
               "Penumpang Berdiri : " + penBerdiri + "\n" +
               "Jumlah Penumpang : " + jumlahPenumpang + "\n" +
               "Total Pendapatan : Rp." + totalPendapatan + "\n";
    
     }
}
