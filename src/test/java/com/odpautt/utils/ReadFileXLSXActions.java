package com.odpautt.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadFileXLSXActions {
    public ArrayList<ArrayList<String>> excelArray = new ArrayList<>();

    public void readFileExcel(String rutaArchivo, int hoja){
        try {

            FileInputStream f = new FileInputStream(rutaArchivo);

            XSSFWorkbook libro = new XSSFWorkbook(f);
            XSSFSheet sheet = libro.getSheetAt(hoja);
            Iterator<Row> filas = sheet.iterator();
            Iterator<Cell> celdas;
            Row fila;
            Cell celda;
            while (filas.hasNext()){
                fila=filas.next();
                celdas = fila.cellIterator();
                ArrayList<String> temporaryData = new ArrayList<>();
                while (celdas.hasNext()){
                    celda = celdas.next();

                    switch (celda.getCellType()) {
                        case STRING:

                            if(celda.getStringCellValue().getBytes().equals(" ")){

                            }
                            else{
                                temporaryData.add(celda.getStringCellValue());
                            }
                            //System.out.print(celda.getStringCellValue()+"  |  ");
                            break;
                        case NUMERIC:
                            int num = (int) celda.getNumericCellValue();
                            temporaryData.add(String.valueOf(num));
                            //System.out.print(num+"  |  ");
                            break;
                    }
                }
                excelArray.add(temporaryData);
                //System.out.println();
            }
            libro.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(excelArray);
    }

}