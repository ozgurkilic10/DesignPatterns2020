package week10;

import java.util.LinkedList;

public class HomeTheaterClient {

    public static void main(String... args){

        HomeTheaterFacade hmf = new HomeTheaterFacade();


        //Watch movie
        hmf.watchMovie("Black Swan");


        //End Movie
        hmf.endMovie();


        //Start Lounge Music
        hmf.LoungeMusicMood();


    }
}
