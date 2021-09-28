package com.vaibhav.leetcode;
//929. Unique Email Addresses
//https://leetcode.com/problems/unique-email-addresses/
/*
Unique Email Addresses

Solution
Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.

For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.

For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.

For example, "m.y+name@email.com" will be forwarded to "my@email.com".
It is possible to use both of these rules at the same time.

Given an array of strings emails where we send one email to each email[i], return the number of different addresses that actually receive mails.



Example 1:

Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
Example 2:

Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3
 */

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int result = numUniqueEmails(emails);
        System.out.println(result);
    }
    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<emails.length;i++){
            emails[i]=filter(emails[i]);
            set.add(emails[i]);
        }
        return set.size();
    }
    public static String filter(String s){
        StringBuffer sb1 = new StringBuffer();
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                continue;
            }if(s.charAt(i)=='+' || s.charAt(i)=='@'){
                break;
            }else{
                sb1.append(s.charAt(i));
            }
        }
        while(s.charAt(i)!='@'){
            i++;
        }
        while(i<s.length()){
            sb1.append(s.charAt(i));
            i++;
        }
        String temp = new String(sb1);
        return temp;
    }
}
