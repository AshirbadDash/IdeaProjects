package com.kode.company;

public class Main2 {
    public static void main(String[] args) {
//        String str ="Hello";
//        String gtr ="kello";
//        int length =str.length();
//        System.out.println(length);
//        System.out.println(str.length());
//        System.out.println(str.charAt(3));
//        System.out.println(str.indexOf('l'));
//        System.out.println(str.compareTo(gtr));
//        String str ="java program";
//
//         /
//
//
//         System.out.println(str.contains("p"));
//        System.out.println(str.startsWith("java"));
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        String s1="abc";
//
//        String s2 ="def";
////        System.out.println(s1.concat(s2));
//        String s3 = s1.concat(s2);
////        System.out.println(s3);
//        str =str+"def";
//        System.out.println(str);
//        str +=10;
//        System.out.println("abc"+10+20);

        String s1 = "welcometojava";
        String empty = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                if (s1.substring(i, j).length() == 3) {
                    empty = empty + s1.substring(i, j) + " ";

//                System.out.println(s1.substring(i,j));
                }
            }
        }
        String [] split =empty.split(" ");

        String split1[] = {"java", "mt", "python", "c++"};
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length - 1; j++) {
                if (split[j].compareTo(split[j + 1]) > 0) {
                    String temp = split[j];
                    split[j] = split[j + 1];
                    split[j + 1] = temp;
                }
            }


        }
//        for (String string : split) {
//            System.out.println(string);
//        }
        System.out.println(split[0]);
        System.out.println(split[split.length-1]);

    }

}
