package ArrayList;

import java.util.ArrayList;

public class WorkWithArrayList {
    public static void main(String args[]){

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add("Pine Apple");
        fruits.add("Cherry");
        fruits.add(2,"Grape");
        //System.out.println(fruits);
        int i=0;
        for(String fruit : fruits){
            System.out.println(i + ". " + fruit);
            i++;
        }

        ArrayList<Object> heterList = new ArrayList<>();
        heterList.add(true);
        heterList.add(3);
        heterList.add("Text");
        heterList.add(4.5);
        System.out.println("HeterList: \n" + heterList);

        System.out.println("Third element type in Heterlist before: " + heterList.get(2).getClass().getName());
//        for (int j=0; j<heterList.size(); j++){
//            System.out.println(heterList.get(j));
//        }

        System.out.println("Before: " + heterList.get(2));
        heterList.set(2,false);
        System.out.println("Third element type in Heterlist after: " + heterList.get(2).getClass().getName());
        System.out.println("After: " + heterList.get(2));

        String input = "pine apple";
        Object[] inputArray = input.split("\\s");
        StringBuffer finalResult = new StringBuffer();
        for (Object info: inputArray) {
            if(!info.toString().isEmpty()){
                finalResult.append(Character.toUpperCase(info.toString().charAt(0)))
                        .append(info.toString().substring(1)).append(" ");
            }
        }

        if(fruits.remove(finalResult.toString().trim())){
            System.out.println(fruits);
        }
        else
            System.out.println("Nothing removed from an arrayList");

    }
}
