public class TDDSong {

    public String TDDSong(String[] cadena) {
        if (cadena.length == 0) {
            return "";
        } else if (cadena.length == 1) {
            return "There was an old lady who swallowed a " + cadena[0] + ".\n" +
            "I don't know why she swallowed a " + cadena[0] + " - perhaps she'll die!\n";
        } else if ((cadena.length == 2)) {
            return "There was an old lady who swallowed a " + cadena[0] + ".\n" +
                    "I don't know why she swallowed a " + cadena[0] + " - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a " + cadena[1] + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + cadena[1] + " to catch the " + cadena[0] + ";\n" +
                    "I don't know why she swallowed a " + cadena[0] + " - perhaps she'll die!\n";
        } if (cadena.length == 3) {
            return "There was an old lady who swallowed a " + cadena[0] + ".\n" +
                    "I don't know why she swallowed a " + cadena[0] + " - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a " + cadena[1] + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + cadena[1] + " to catch the " + cadena[0] + ";\n" +
                    "I don't know why she swallowed a " + cadena[0] + " - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a " + cadena[2] + ";\n" +
                    "How absurd to swallow a " + cadena[2] + ".\n" +
                    "She swallowed the " + cadena[2] + " to catch the " + cadena[1] + ",\n" +
                    "She swallowed the " + cadena[1] + " to catch the " + cadena[0] + ";\n" +
                    "I don't know why she swallowed a " + cadena[0] + " - perhaps she'll die!\n" +
                    "\n";
        }
        return "";
    }

    public static void mainProva(String[] args) {
        TDDSong tddSong = new TDDSong();
        String[] cadena = {"fly", "spider", "bird"};
        String result = tddSong.TDDSong(cadena);
        System.out.println(result);
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
        if (result.equals(esp)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test KO");
        }
        
    }
}
