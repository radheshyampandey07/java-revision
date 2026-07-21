package filehandling;

import java.io.*;
//import java.io.FileReader;
//import java.io.IOException;

public class ReadLargeFileLineByLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "sample_large_file.txt";

		long lineCount = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;

			while ((line = br.readLine()) != null) {
				// Process each line
				if (lineCount < 5) { // print only first 5 lines
					System.out.println(line);
				}
				lineCount++;
			}

			System.out.println("Total lines: " + lineCount);

		} catch (IOException e) {
			e.printStackTrace();
		}

		//
		byte[] buffer = new byte[1024 * 1024]; // 1 MB chunk
		int bytesRead;
		int chunkCount = 0;

		try (FileInputStream fis = new FileInputStream(filePath)) {

			while ((bytesRead = fis.read(buffer)) != -1) {

				// Process chunk
				String chunkData = new String(buffer, 0, bytesRead);

				if (chunkCount < 2) { // print first 2 chunks partially
					System.out.println("Chunk " + chunkCount + ":");
					System.out.println(chunkData.substring(0, Math.min(200, chunkData.length())));
				}

				chunkCount++;
			}

			System.out.println("Total chunks processed: " + chunkCount);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
