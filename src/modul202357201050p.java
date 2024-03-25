import javax.swing.JOptionPane;
public class modul202357201050p {
    public static void main(String[] args) {
        String[][] data = {{"ABDUL", "\t085646668991", "kediri"},
            {"KUSNO", "085646668992", "Trenggalek"},
            {"PONIRAN", "085646668999", "Bojonegoro"}};
        System.out.println("NAMA\t\tALAMAT\t\t\tTELPON");
        for (String[] ke : data) {
            System.out.println(ke[0] + "\t\t" + ke[2] + "\t\t" + ke[1]);
        }
    }
}
