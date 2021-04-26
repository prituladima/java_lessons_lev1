package com.prituladima.lessons.lesson15.lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class HeapMemoryTester {
    static final String WORKING_FOLDER = System.getProperty("user.home") + "/IdeaProjects/big_file/";

    //-Xmx64M -Xmx64m
    public static void main(String[] args) throws Exception {

        Random random = new Random();//O(1)

        int n = 2_000_000;

        int[] arr = new int[n];//O(n)
        //OutOfMemoryError

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt() % n;//O(1)
        }//O(n)
//
////        System.out.println(Arrays.toString(arr));
//
        int sum = 0;
        for (int cur : arr) {
            sum += cur;
        } //O(n)
//
//        System.out.println(sum / n);
//
//        //Random access O(1)
//        for(int i = 0; i < n ; i++){
//            //arr[i]
//        }

//        Iterator<String> iterator = null;
//        while (iterator.hasNext()){
////            iterator.next()
//        }

//        try (PrintWriter printWriter = new PrintWriter(WORKING_FOLDER + "bigFile.txt")) {
//            long m = (2_000L * 1_000_000) / 9; //2GB
//            for (long i = 0; i < m; i++) {
//                printWriter.println(i + "");
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        //2_000 = 9KB
        //m = 2GB (2 000 000 KB)

        //m = (2_000 * 2_000_000) / 9

        //long -> 64bit -> 4 * 16char -> k*8byte
        //byte -> char


        //File
        // next byte[] len = 1024 OK
        // next byte[] len = 1024 OK
        // ...
        // next byte[] len = 1024 OK
        // next byte[] len = 1024 -> 0
        // -> nextLong ->

//        long sum = 0;
//        long cnt = 0;
        // -> nextLong ->
        //while(has more data)
        //sum += nextLong;
        //cnt ++;

        //Random access - in-memory - data size < RAM limitation
        //Sequential reading - streaming - iterator


        //File.txt -> Str byte[] -> Str nextLong; (nextLine, nextToken)
        //File.mp4 -> Str byte[1024] -> Str nextSecond(1) (nextMinute(2))

        //case 1. ---
        //case 2. 1 second video -> 4.5 buffer byte[]
        //case 3. 1 buffer byte[] -> 3.200 second video Second???

        InputStream inputStream = new FileInputStream("name");

        //File - 7000 byte
        byte[] buffer = new byte[1024];
        int read = inputStream.read(buffer);//1024 byte
        read = inputStream.read(buffer);//1024 byte
        read = inputStream.read(buffer);//1024 byte
        read = inputStream.read(buffer);//1024 byte
        read = inputStream.read(buffer);//1024 byte
        read = inputStream.read(buffer);//1024 byte
        read = inputStream.read(buffer);//856 byte  7000 - (1024 * 6) -> buffer[1024]
        read = inputStream.read(buffer);//0

        //[ , , , , , , , ,,,, ] - 1024
        //[0, 856) [856 , 1024)


        //File - 7000 byte
        buffer = new byte[8192];
        read = inputStream.read(buffer);//7000
        read = inputStream.read(buffer);//0

        Iterator<Long> iterator = new LongIterator(inputStream);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //coding / encoding
        //codec

        //avi mp4 mp3 -> codec ->

        //nextLine nextNumber nextToken
        //"fdjkdfbdf dfkjdfjkd       \n\n\n\n sdlksdlk\n          dsjkdsjkb"


        //nextLine -> numberIterator -> encoder -> buffering -> next byte[] -> file 1024
        //Kate - 2
        //Dima - 10
        //Polina - 2
        //Sergey - 6
        //Anna - 5


    }

    private static class LongIterator implements Iterator<Long> {

        InputStream inputStream;

        public LongIterator(InputStream inputStream) {
            this.inputStream = inputStream;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Long next() {
            return null;
        }
    }


    private class Second {
        int[][][] video = new int[24][][];
        byte[] audio = null;
    }


}
