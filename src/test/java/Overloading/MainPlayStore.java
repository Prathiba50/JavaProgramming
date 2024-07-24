package Overloading;

public class MainPlayStore {

    public void InstalledApp(){
        System.out.println("Install any app");
    }

    public void InstalledApp(String whatsapp){
        System.out.println("Install WhatsApp");
    }

    public void InstalledApp(String Insta, int InstaCount){
        System.out.println("Install Instagram with count");
    }

    static class FaceBook extends  MainPlayStore{
        public void InstalledApp(String app, double FBCount){
            System.out.println("Install app from Facebook with count");
        }

    }

    static class Twiter extends FaceBook{
        public void InstalledApp(String Twitterapp,String title){
           System.out.println("Install app from Twitter with Title");
        }
    }
    public static void main(String[] args) {
        Twiter mp =  new Twiter();
        mp.InstalledApp();
        mp.InstalledApp("Whatapp");
        mp.InstalledApp("Instagram",1);
        mp.InstalledApp("FaceBook",9.0);
        mp.InstalledApp("Twitter","Twitter Title");
    }
}



