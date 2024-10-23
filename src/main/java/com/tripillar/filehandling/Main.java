package com.tripillar.filehandling;

import com.tripillar.filehandling.text.ReadTextFile;
import com.tripillar.filehandling.text.WriteTextFile;
import com.tripillar.filehandling.excel.ReadExcelFile;
import com.tripillar.filehandling.excel.WriteExcelFile;

public class Main {
    public static void main(String[] args) {
        // File paths
        String textFilePath = "example.txt";
        String excelFilePath = "example.xlsx";

        // Test writing to a text file
        WriteTextFile writeText = new WriteTextFile();
        writeText.writeToFile(textFilePath, "This is a sample text file.");

        // Test reading from a text file
        ReadTextFile readText = new ReadTextFile();
        readText.readFromFile(textFilePath);

        // Test writing to an Excel file
        WriteExcelFile writeExcel = new WriteExcelFile();
        writeExcel.writeToExcel(excelFilePath);

        // Test reading from an Excel file
        ReadExcelFile readExcel = new ReadExcelFile();
        readExcel.readFromExcel(excelFilePath);
    }
}

