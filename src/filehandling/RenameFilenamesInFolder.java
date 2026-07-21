package filehandling;

import java.io.File;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RenameFilenamesInFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String folderPath = "D:\\Java Videos\\java full course 2026";

        File folder = new File(folderPath);

        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("No files found.");
            return;
        }

        // Matches: Java Full Course _26 or Java Full Course _ 26
        Pattern pattern = Pattern.compile("Java Full Course\\s*_\\s*(\\d+)");

        for (File file : files) {

            if (!file.isFile()) {
                continue;
            }

            String oldName = file.getName();

            Matcher matcher = pattern.matcher(oldName);

            if (matcher.find()) {

                String number = matcher.group(1);

                // Skip if already renamed
                if (oldName.matches("^\\d+\\.\\s.*")) {
                    continue;
                }

                String newName = number + ". " + oldName;

                File newFile = new File(folder, newName);

                if (file.renameTo(newFile)) {
                    System.out.println("Renamed:");
                    System.out.println(oldName);
                    System.out.println(" -> " + newName);
                    System.out.println();
                } else {
                    System.out.println("Failed: " + oldName);
                }
            } else {
                System.out.println("Number not found in: " + oldName);
            }
        }
    }
}
