package com.example.chekservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Palindrome_num {

    @GetMapping("/Palindrome/{m}")
    public String Palindrome(@PathVariable int m){

        int org = m;
        int reverse = 0;

        //to find reverse
        while(m != 0){

            int remainder = m % 10;
            reverse = reverse * 10 + remainder;
            m = m/10;

        }

        if(org == reverse){
            System.out.format("%d is a Palindrome number\n",org);
            return "yes, your number is Palindrome number";
        }else{
            System.out.format("%d is not a Palindrome number\n",org);
            return "no, your number s not Palindrome number";
        }

    }

}
