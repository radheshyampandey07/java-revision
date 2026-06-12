package streams;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RenameVideos {

    public static void main(String[] args) {

        String folderPath = "D:\\Java Videos\\stream programs";

        File folder = new File(folderPath);

        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("No files found.");
            return;
        }

        Pattern pattern = Pattern.compile("-\\s*(\\d+)\\s*(.*)");
        
        for (File file : files) {

            if (!file.isFile()) {
                continue;
            }

            String oldName = file.getName();

            int dotIndex = oldName.lastIndexOf('.');

            if (dotIndex == -1) {
                continue;
            }

            String extension = oldName.substring(dotIndex);
            String nameWithoutExtension = oldName.substring(0, dotIndex);

            Matcher matcher = pattern.matcher(nameWithoutExtension);

            if (matcher.find()) {

                String number = matcher.group(1);
                String remainingText = matcher.group(2).trim();

                String newName = number + ". " + remainingText + extension;

                File newFile = new File(folder, newName);

                if (file.renameTo(newFile)) {
                    System.out.println("Renamed:");
                    System.out.println(oldName);
                    System.out.println(" -> " + newName);
                    System.out.println();
                } else {
                    System.out.println("Failed: " + oldName);
                }
            }
        }
    }
}