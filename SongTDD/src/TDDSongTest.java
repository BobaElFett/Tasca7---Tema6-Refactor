import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {

    @org.junit.jupiter.api.Test
    void TestFly() {
        TDDSong tddSong = new TDDSong();
        String[] cadena = {"fly"};
        String result = tddSong.generateSong(cadena);
        String esp = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    void TestSpider() {
        TDDSong tddSong = new TDDSong();
        String[] cadena = {"spider"};
        String result = tddSong.generateSong(cadena);
        String esp = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n";
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    void TestFlySpider() {
        TDDSong tddSong = new TDDSong();
        String[] cadena = {"fly", "spider"};
        String result = tddSong.generateSong(cadena);
        String esp = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    void TestSpiderFly() {
        TDDSong tddSong = new TDDSong();
        String[] cadena = {"spider", "fly"};
        String result = tddSong.generateSong(cadena);
        String esp = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the spider;\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n";
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    void TestFlySpiderBird() {
        TDDSong tddSong = new TDDSong();
        String[] cadena = {"fly", "spider", "bird"};
        String result = tddSong.generateSong(cadena);
        String esp = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.\n" +
                "She swallowed the bird to catch the spider,\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n";
        assertEquals(esp, result);
    }

    @org.junit.jupiter.api.Test
    void TestBirdFlySpider() throws InterruptedException {
        TDDSong tddSong = new TDDSong();
        String[] cadena = {"bird", "fly", "spider"};
        String result = tddSong.generateSong(cadena);
        String esp = "There was an old lady who swallowed a bird.\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "How absurd to swallow a spider.\n" +
                "She swallowed the spider to catch the fly,\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n";
        assertEquals(esp, result);
    }

}