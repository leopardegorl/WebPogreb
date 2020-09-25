import java.util.*;

public class Test {
    public static void main(String[] args) {
      Pogreb pogreb = new Pogreb();
      List<Vegetable> composition = new ArrayList<Vegetable>();
      composition.add(Vegetable.CABBAGE);
      composition.add(Vegetable.CARROT);
      composition.add(Vegetable.TOMATO);
      Can can = new Can("Rude cucumber", composition);
      pogreb.put(can);
        System.out.println(can);
        pogreb.put(new Can ("Bluck bluck", composition));
        pogreb.get("Bluck bluck");
        System.out.println(pogreb);
       }
    }





