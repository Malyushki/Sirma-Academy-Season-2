package EX_03_26_03_2023;

import java.io.*;


public class TXTOpener implements AdvancedFileOpener {
    @Override
    public String openTXT(String filename) {

        String path = "SirmaAcademy_2023/SA_26_03_2023/EX_03_26_03_2023/files/";
        File file = new File(path + filename);
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
