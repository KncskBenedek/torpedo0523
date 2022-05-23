
package main;

public class Hajo {
    private int[] poz;

    public Hajo() {
        this(new int[]{2,3,4});
    }


    public Hajo(int[] poz) {
        this.poz = new int[3];
        this.poz = poz;
    }
    
    
    
    
    public String talalat(int poz){
        int i = 0;
        while (i < this.poz.length && !(poz == this.poz[i])) {
            i++;
        }
        
        return i<this.poz.length ? "talált":"mellé";
    }
}
