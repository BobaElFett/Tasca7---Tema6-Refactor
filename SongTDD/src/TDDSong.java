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

    public String generateSong(String[] cadena) {
        if (cadena.length == 0) {
            return "";
        }

        StringBuilder song = new StringBuilder();

        song.append("There was an old lady who swallowed a ").append(cadena[0]).append(".\n");
        song.append("I don't know why she swallowed a ").append(cadena[0]).append(" - perhaps she'll die!\n");

        if (cadena.length > 1) {
            song.append("\n");
            song.append("There was an old lady who swallowed a ").append(cadena[1]).append(";\n");
            song.append("That wriggled and wiggled and tickled inside her.\n");
            song.append("She swallowed the ").append(cadena[1]).append(" to catch the ").append(cadena[0]).append(";\n");
            song.append("I don't know why she swallowed a ").append(cadena[0]).append(" - perhaps she'll die!\n");
        }

        if (cadena.length > 2) {
            song.append("\n");
            song.append("There was an old lady who swallowed a ").append(cadena[2]).append(";\n");
            song.append("How absurd to swallow a ").append(cadena[2]).append(".\n");
            song.append("She swallowed the ").append(cadena[2]).append(" to catch the ").append(cadena[1]).append(",\n");
            song.append("She swallowed the ").append(cadena[1]).append(" to catch the ").append(cadena[0]).append(";\n");
            song.append("I don't know why she swallowed a ").append(cadena[0]).append(" - perhaps she'll die!\n");
            song.append("\n");
        }

        return song.toString();
    }

    public static void main(String[] args) {
        TDDSong tddSong = new TDDSong();
        String[] cadena = {"fly", "spider", "bird"};
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

        long inicio = System.currentTimeMillis();
        String result = tddSong.TDDSong(cadena);
        if (result.equals(esp)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test KO");
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        long inicio2 = System.currentTimeMillis();
        String result2 = tddSong.generateSong(cadena);
        if (result2.equals(esp)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test KO");
        }
        long fin2 = System.currentTimeMillis();
        System.out.println(fin2 - inicio2);

    }
}
