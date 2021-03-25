package com.prituladima.lessons.lesson8;

public class Main {
    public static void main(String[] args) {

        //n = 2000; n = 400000000000000;
        //[1..2000]

        //1. 3 and 5
        //2. 3 or 5
        //3. 3 xor 5

        //O(n)
        int n = 2000;
        //1. 3 and 5
        //O(1)
        {

            int ans = n / (3 * 5);
            System.out.println(ans);
        }

        //2. 3 or 5
        //O(1)
        {

            //inclusion
            //exclusion
            int ans = n / 3 + n / 5 - n / (3 * 5);
            System.out.println(ans);
        }

        //3. 3 xor 5
        {

            int ans = n / 3 + n / 5 - 2 * n / (3 * 5);
            System.out.println(ans);
        }


        // 3 and 5 and 7
        {

            //inclusion
            int ansMy = n / 3 + n / 5 + n / 7;
            //exclusion
            ansMy = ansMy - n / (3 * 5) - n / (5 * 7) - n / (7 * 3);
            //inclusion
            ansMy = ansMy + n / (7 * 5 * 3);

            int ans =
                    n / 3 - n / (3 * 7) + n / (3 * 7 * 5) + n / 7 - n / (7 * 5) + n / 5 - n / (3 * 5);

            System.out.println("my = " + ansMy + " ans = " + ans);
        }

        //Set1 [2, 3, 4, 5, 6]
        //Set2 [4, 5, 7]

        //Set1 and Set2  [4. 5]
        //Set1 or Set2 [2, 3, 4, 5, 6, 7]
        //Set1 xor Set2 [2, 3, 6, 7]

        //Set int len()

        //Set void add(int val)
        //Set void remove(int val)

        System.out.println("Start sets");
        ISet set = new MutableSet();//[0..31]
        //bit mask
        //BitSet long[] 64

        set.add(0);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(2);


        System.out.println(set.len());
        set.remove(0);
        System.out.println(set.len());
        set.remove(2);
        set.remove(3);
        set.remove(4);
        System.out.println(set.len());

        ISet set1 = new MutableSet(new int[]{1, 2, 3, 3, 3, 2});//[1 2 3]
        System.out.println(set1.len());

        set.add(2);
        set.add(4);
        //[2, 4] and [1, 2, 3]
        System.out.println(set.and(set1).len());

        //[2] or [1, 2, 3]
        System.out.println(set.or(set1).len());

        //[1, 2, 3] xor [1, 2, 3]
        System.out.println(set.xor(set1).len());


        ISet setExample = new MutableSet(new int[]{1, 2, 4, 4, 12, 17});

        System.out.println("setExample = " + setExample);
        //Expected
        //4
        //3
        //0
        //3


//
//        System.out.println(toBinaryString(34));
//        System.out.println(toBinaryString(17));
//        System.out.println(toBinaryString(0));
//        System.out.println(toBinaryString(2));


        //String str = str1.concat(str2); str1 + str2;
        //operator overriding


    }

    private static String toBinaryString(int numb) {
        return String.format("%32s", Integer.toBinaryString(numb)).replace(' ', '0');
    }
}
