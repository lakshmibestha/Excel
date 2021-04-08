package com.example.ExcelExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ExcelFile file=new ExcelFile();
        file.writeExcelData();
        file.readExcelData();
    }
}
