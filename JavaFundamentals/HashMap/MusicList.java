import java.util.HashMap;
import java.util.Set;

public class MusicList{
    public static void main(String[] args){
        musicList();
    }
    public static void musicList(){
        HashMap<String, String> musicHM = new HashMap<String, String>();
        musicHM.put("Pistol in my Truck", "Tattoos on my skin, Shine in my Veins");
        musicHM.put("Ice, Ice, Baby", "Light up a stage like a candle");
        musicHM.put("The Real Slim Shady", "Will the Real Slim Shady please stand up");
        musicHM.put("Superman","Let's let our love unfurl");
        String song = musicHM.get("Superman");
        System.out.println("Pulling out one song by title': " + song);
        Set<String> keys = musicHM.keySet();
        for(String key: keys){
            System.out.println("Key: " + key + "; Value: " + musicHM.get(key));
        }
    }
}