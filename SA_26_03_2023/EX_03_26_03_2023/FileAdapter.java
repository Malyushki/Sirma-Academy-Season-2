package EX_03_26_03_2023;

public class FileAdapter implements FileOpener {
    AdvancedFileOpener advancedFileOpener;

    public FileAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("txt")) {
            advancedFileOpener = new TXTOpener();
        }
    }

    public String open(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("txt")) {
            return advancedFileOpener.openTXT(fileName);
        }
        return null;

    }
}