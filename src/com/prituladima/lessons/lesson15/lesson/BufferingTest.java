package com.prituladima.lessons.lesson15.lesson;

import java.io.*;
import java.math.BigInteger;

public class BufferingTest {

    static final String WORKING_FOLDER = System.getProperty("user.home") + "/IdeaProjects/big_file/";

    public static void main(String[] args) {

        String fileName = WORKING_FOLDER + "bigFile1.txt";

//        try (PrintWriter printWriter = new PrintWriter(fileName)) {
//            long m = (2_000L * 2_000_000) / 9; //2GB
//            for (long i = 0; i < m; i++) {
//                printWriter.println(i + "");
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        //sum = (m) * (m / 2)
        //m = 10 (1 , 2, 3 .. 10) ->

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {

            //next()
            //hasNext()

            BigInteger sum = new BigInteger("0");
            //long sum = 0; //> 2^63 - 1 >>> 2^200

            long cnt = 0;
            while (true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                sum = sum.add(new BigInteger(line));
                cnt++;
            }

            System.out.println(sum);
            System.out.println(sum.divide(BigInteger.valueOf(cnt)));


            //FileInputStream -> byte[]
            //FileReader(encoder) -> char[]
            //BufferedReader(FileReader) -> String nextLine

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
