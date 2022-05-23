
package main;

public class Hajo {
    private int[] poz = new int[3];
    
    
    public String talalat(int poz){
        int i = 0;
        while (i < this.poz.length && !(poz == this.poz[i])) {
            i++;
        }
        
        return i<this.poz.length ? "talált":"mellé";
    }
}
