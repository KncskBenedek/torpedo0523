
package main;

public class TorpedoTeszt {
    public static void main(String[] args) {
        System.out.println("");
        //assert 1==0: "nem jó az ellenőrzés";
        new TorpedoTeszt().tesztLovesTalalt(4);
    }
    
    public String tesztLovesTalalt(int poz){
        Hajo hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált"): "nem jó a találat ellenőrzés";
        return "";
    } 
}
