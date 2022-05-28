package com.company.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        List<String> listS = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("File.txt"))) {
            String File;
            while ((File = br.readLine()) != null) {
                listS.add(File);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //print size of collection
        System.out.println("The file consists of " + listS.size());

       // For each loop
        System.out.println("********************");
        System.out.println("For each loop: ");
        for(String employee: listS){
            System.out.println(employee);
        }
        //Hash set
        HashSet<String>set = new HashSet<String>(listS);
        //new list without repetition
        List<String> newlist = new ArrayList<>(set);
        System.out.println("**********************");
        System.out.println("List after removing repeted elements: ");
        for(Object uc: newlist)
            System.out.println(uc);
    }
}
