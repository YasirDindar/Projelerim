package day30_MDA;

public class MDA_HangiYemekHangiMilleteAit {
    public static void main(String[] args) {
        // american
        //----------
        // italian
        //----------
        // asian
        //----------
        // afghani
        //----------
        // indian

        /*
        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};
         */
        String [][] food ={{"steak","hot dog","cheeseburger"},{"pizza","pasta","canoli"},
                            {"sushi","ramen","fried rice","dumplings"},{"kebap","manto"},
                            {"bariyani","masal","curry","chicken tikka masala"}};

        String [] country = {"American","İtalian","Asian","Afghani","İndian"};

        for (int i = 0; i < food.length ; i++) {
            System.out.println("--------------------" + country[i]+ " --------------------");
            for (int j = 0; j <food[i].length ; j++) {
                System.out.println(food[i][j]);
            }
        }
    }
}
