package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;


@EnableAutoConfiguration
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        //TEST for RUN
        SpringApplication.run(Main.class, args);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        int[] arr = {1,2,3,4,5};
        int[] arr1 = {5,6,7,8,9};
        System.arraycopy(arr, 0 , arr1 , 0, 1); // arr的第一個資料複製，貼到arr1的第一個資料。1 replace 5
        System.out.println("new arr1 = " + Arrays.toString(arr1));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}