package com.prituladima.lessons.lesson10;

public class Main {

    public static void main(String[] args) {

        //Correct
        //open 1
        //open 2
        //open 5
        //close 5
        //close 2
        //close 1


        //open 1
        //close 5
        //open 1

        //open 1
        //open 2
        //close 2
        //open 3
        //close 3
        //close 1
        //open 4
        //close 4

        //1 2 3 3 2 1

        //open 4
        //open 7
        //close 7
        //open 13
        //close 17


        //open 1
        //open 1
        //open 1
        //open 1
        //open 1
        //open 1
        //open 1
        //open 1

        String[] logs = {
                "open 1",
                "open 2", "close 2",
                "open 3", "close 3",
                "open 5", "close 5",
                "open 7", "close 7",
                "open 9", "close 9", "close 8",
                "open 10000", "close 10000",
                "close 1"
        };
        boolean correct = correct(logs);
        //expected true
        System.out.println("Is avatar was sober!");
        System.out.println(correct);


        //last in, first out Stack  (LIFO)
        //First in - First out Queue [Qu] (FIFO)

        if (false) {
            int[] arr = {1, 2, 4, 6, 7, 3, 4, 5, 6, 6, 7, 8, 9, 9, 0};
            IStack stack = new Stack();
            for (int i = 0; i < arr.length; i++) {
                stack.add(arr[i]);
            }

            while (!stack.isEmpty()) {
                System.out.println(stack.remove());
            }
        }

    }

    private static boolean correct(String[] arr) {
        //arr[0]
        IStack stack = new Stack();
        for (int i = 0; i < arr.length; i++) {
            String[] split = arr[i].split(" ");
            String action = split[0];
            int numb = Integer.parseInt(split[1]);

            //open -> stack add(arr[i])
            if ("open".equals(action)) {
                stack.add(numb);
            }
            //closed -> stack.get() -> stack.remove()
            else if (!stack.isEmpty() && numb == stack.get()) {
                //??????
                int removed = stack.remove();

            }
            //closed -> notMatch return false;
            else {
                return false;
            }

        }

//        return stack.isEmpty() ? true : false;
        return stack.isEmpty();
    }

}
