public class CiftYonluDairesel {
   Node ilk=null;
   Node son=null;
   Node temp1=null;
   Node temp2=null;
   public int uzunluk()
   {
       int adet=0;
       if (ilk==null)
           return adet;
       else
       {
           temp1=ilk;
           while (temp1.sonraki!=ilk)
           {
               adet++;
               temp1=temp1.sonraki;

           }
           adet++;
           return adet;
       }

   }
   public CiftYonluDairesel()
   {

   }
   public void basaEkle(int bilgi)
   {
       Node yeni=new Node(bilgi);
       if (ilk==son && ilk==null)
       {
           ilk=son=yeni;
           ilk.sonraki=son.sonraki=null;
           ilk.onceki=son.onceki=null;
       }
       else
       {
           yeni.sonraki=ilk;
           ilk.onceki=yeni;
           ilk=yeni;
           yeni.onceki=son;
           son.sonraki=ilk;
       }

   }
   public void sonaEkle(int bilgi)
   {
       Node yeni =new Node(bilgi);
       if (ilk==son && ilk==null)
       {
           ilk=son=yeni;
           ilk.sonraki=son.sonraki=null;
           ilk.onceki=son.onceki=null;

       }
       else
       {
           son.sonraki=yeni;
           yeni.onceki=son;
           son=yeni;
           ilk.onceki=son;
           son.sonraki=ilk;

       }
   }
   public void posizyonaEkle(int deger,int pos)
   {
       Node yeni=new Node(deger);
       if (ilk==son && ilk==null)
       {
           if (pos==1)
           {
               ilk=son=yeni;
               ilk.sonraki=son.sonraki=null;
               ilk.onceki=son.onceki=null;
           }
           else
           {
               System.out.println("Sinir disi konum");
               return;
           }

       }
       else
       {
           temp1=ilk;
           int i;
           for (i=1;temp1.sonraki!=null;i++)
           {
               temp2=temp1;
               temp1=temp1.sonraki;
               if (i == pos -1)
               {
                   temp2.sonraki=yeni;
                   yeni.onceki=temp2;
                   yeni.sonraki=temp1;
                   temp1.onceki=yeni;
                   break;
               }
           }

       }
   }
   public void bastanSil()
   {
       temp1=ilk;
       if (ilk==null)
       {
           System.out.println("Listede silinecek eleman yok");
       }
       else if (ilk.sonraki==ilk)
       {
           ilk=son=null;
           return;
       }
       ilk=ilk.sonraki;
       ilk.onceki=son;
       son.sonraki=ilk;
   }
   public void sondanSil()
   {

       if (ilk==null)
       {
           System.out.println("Listede silinecek eleman yok");
       }
       else if (ilk.sonraki==ilk)
       {
           ilk=son=null;
           return;
       }
       son=son.onceki;
       son.sonraki=ilk;
       ilk.onceki=son;
   }
   public void pozisyondanSil(int pos)
   {

       temp1=son.sonraki;
       if (pos<1||pos>uzunluk())
           System.out.println("hatali");
       else if (pos==1) {
           bastanSil();
           return;
       }
       while (pos>1)
       {
           temp1=temp1.sonraki;
           pos--;
       }
       temp2=temp1.onceki;
       temp2.sonraki=temp1.sonraki;
       temp2.sonraki.onceki=temp2;
   }
   public void Ara(int aranan)
   {
       temp1=ilk;
       int i=1;
       while (temp1.sonraki!=ilk)
       {
           if (temp1.deger==aranan)
           {
               System.out.println("Aranan "+i+". indekste");
               return;
           }
           else
               i++;
           temp1=temp1.sonraki;
       }
       if (temp1.deger==aranan)
           System.out.println("Aranan"+i+".indekste bulundu");
       else
           System.out.println("Bulunamadi");

   }
   public void Listele()
   {
       temp1=ilk;
       if (ilk==null)
       {
           System.out.println("Liste bos");
       }
       else
       {
           while (temp1!=son)
           {
               System.out.print(" "+temp1.deger);
               temp1=temp1.sonraki;
           }
           System.out.println(" "+temp1.deger);
       }
   }
}
