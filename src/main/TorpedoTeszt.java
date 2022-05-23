
package main;

public class TorpedoTeszt {
    public static void main(String[] args) {
        System.out.println("");
        //assert 1==0: "nem jó az ellenőrzés";
        new TorpedoTeszt().tesztLoves(4);
    }
    
    public String tesztLoves(int poz){
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
        assert t.equals("talalt"): "nem jó a találat ellenőrzés";
        return "";
    } 
}
