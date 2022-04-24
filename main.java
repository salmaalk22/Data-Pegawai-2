/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;
class Hewan{
    public void berkembangbiak(){
        System.out.println("Hewan dapat berkembangbiak");
    }
}
/**
 *
 * @author SalmA Alaika
 */
public class main extends Hewan{
    
    @Override
    public void berkembangbiak(){
        System.out.println("Melahirkan...");
    }
    
    public static void main(String[] args) {
        main Kucing = new main();
        Kucing.berkembangbiak();
    }
}


