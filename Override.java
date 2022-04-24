/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package override;
class Hewan {
    //method overriden
       public void Bernafas() {
            System.out.println("Semua Hewan Bernafas");
            
        }
       
       public void BertahanHidup() {
           System.out.println("Semua Hewan Makan Untuk Bertahan Hidup");
       }
}
            
            class Serangga extends Hewan {
                //method overriding
                @java.lang.Override
                public void Bernafas() {
                    System.out.println("Serangga Bernafas dengan Trakea");
                }
            }

class Unggas extends Hewan { 
    
    @java.lang.Override
    public void Bernafas() {
        System.out.println("Unggas Bernafas dengan Paru Paru");
    } 
}
            
            
public class Override {
    
    public static void main(String[] args) { 
     Serangga Semut = new Serangga();
     Unggas Bebek = new Unggas();
     
     Semut.Bernafas();
     Semut.BertahanHidup();
     
     Bebek.Bernafas();
     Bebek.BertahanHidup();
      
    }
    
}
