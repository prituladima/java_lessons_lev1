package com.prituladima.lessons.lesson3;

public class DrawLecture {

    public static void main(String[] args) {
        if (false) {
            int yellow = 0xFFFF00;
            int blue = 0x0000FF;

            int h = 800;
            int w = 600;
            int[][] pixels = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (j < w / 2) {
                        pixels[i][j] = blue;
                    } else {
                        pixels[i][j] = yellow;
                    }
                }
            }

            ImageUtil.getImageFromPixels(pixels);
        }

        if (false) {

            int h = 800;
            int w = 600;
            int[][] pixels = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (i < h / 3) {
                        pixels[i][j] = 0x00FF00;
                    } else if (i < 2 * h / 3) {
                        pixels[i][j] = 0xFFFFFF;
                    } else {
                        pixels[i][j] = 0xFF0000;
                    }
                }
            }

            ImageUtil.getImageFromPixels(pixels);
        }

        if (false) {

            int h = 600;
            int w = 600;
            int[][] pixels = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (i > j) {
                        pixels[i][j] = 0x00FF00;
                    } else {
                        pixels[i][j] = 0xFF0000;
                    }
                }
            }

            ImageUtil.getImageFromPixels(pixels);
        }

        if (false) {

            int h = 800;
            int w = 600;
//            int color = 0x000000;

            int[][] pixels = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int x = i * 0xFF / h;
                    pixels[i][j] = x * 0x10;
                }
                //color += 0x00ff00 / h;
            }
            //0 -> 00
            //800 -> FF
            //i -> x
            //FF -> 00FF00
            ImageUtil.getImageFromPixels(pixels);
        }

        if (true) {

            int[][] pixelsFromImage = ImageUtil.getPixelsFromImage("harry-potter-and-the-sorcerers-stone-700x380.jpg");


            ////
            for(int i = 0 ; i < pixelsFromImage.length ; i++){

                //REVERSE

                for(int j = 0 , k = pixelsFromImage[i].length - 1; j < k ; j++, k--){

                    pixelsFromImage[i][j] += pixelsFromImage[i][k];
                    pixelsFromImage[i][k] = pixelsFromImage[i][j] - pixelsFromImage[i][k];
                    pixelsFromImage[i][j] = pixelsFromImage[i][j] - pixelsFromImage[i][k];
                }

            }


            ImageUtil.getImageFromPixels(pixelsFromImage);

        }
    }
}
