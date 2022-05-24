package com.company.main;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException{
        List<String> listS= new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("File.txt"))){
        String File;
            while ((File = br.readLine()) != null) {
                listS.add(File);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //print size of collection
        System.out.println("The file consists of " + listS.size());

        //standard loops
        System.out.println("***************For loop****************");
         for(int i = 0; i< listS.size(); i++)
         {
            System.out.println(listS.get(i));
         }
         System.out.println("");

        //for each
        System.out.println("***************For each*****************");
         for (String element : listS)
         {
         System.out.println(element);
         }
        System.out.println("");

        //iterator
        System.out.println("*****************Iterator Interface***********");
        Iterator<String> s = listS.iterator();

        while (s.hasNext())
        {
            String element = s.next();
            System.out.println(element);
        }
        System.out.println("");
    }

}