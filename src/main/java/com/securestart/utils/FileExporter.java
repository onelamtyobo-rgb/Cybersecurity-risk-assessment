package com.securestart.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExporter {

    public static void saveReport(String filename, String reportContent) {
        File outputDir = new File("output");

        // Automatically create the folder if it doesn't exist
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        File outputFile = new File(outputDir, filename);

        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(reportContent);
            System.out.println("\n✅ Success! Report saved to: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("❌ Error saving file: " + e.getMessage());
        }
    }
}