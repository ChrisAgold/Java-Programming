package interface_notes;

class Main {

    public static void main(String[] args) {
        // create instance of byTwos class
        ByTwos byTwos = new ByTwos();

        // create instance of byThrees class
        //ByThrees byThrees = new ByThrees();
        // for loop to call get next method 5 times
//        for (int i = 0; i < 5; i++) {
//            System.out.println(byTwos.getNext());
//        }

        // create series object
        Series ob;

        System.out.println(Series.MAX);

        for (int i = 0; i < 6; i++) {
            ob = byTwos;
            // System.out.println("ByTwos: " + ob.getNext());

//            ob = byThrees;
//            System.out.println("ByThrees: " + ob.getNext());
//        }
        }


    }
}