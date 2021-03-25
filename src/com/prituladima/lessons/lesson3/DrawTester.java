package com.prituladima.lessons.lesson3;

import static com.prituladima.lessons.lesson3.ImageUtil.getImageFromPixels;
import static com.prituladima.lessons.lesson3.ImageUtil.getPixelsFromImage;

public class DrawTester {

    public static void main(String[] args) {

        final int width = 1024;
        final int height = 768;
        if (false) {
            //2. Ukrainian flag
            int[][] pixels = new int[width][height];
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (j < height / 2) {
                        pixels[i][j] = 0x0000FF;
                    } else {
                        pixels[i][j] = 0xFFFF00;
                    }
                }
            }
            String imageFromPixels = getImageFromPixels(pixels);
        }

        if (false) {
            //2. Italian flag
            int[][] pixels = new int[width][height];
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (i < width / 3) {
                        pixels[i][j] = 0x0b6623;
                    } else if (i < width * 2 / 3) {
                        pixels[i][j] = 0xFFFFFF;
                    } else {
                        pixels[i][j] = 0x0000FF;
                    }
                }
            }
            String imageFromPixels = getImageFromPixels(pixels);
        }

        if (false) {
            //3. Main diagonal
            int width_ = 600;
            int height_ = 600;

            int[][] pixels = new int[width_][height_];
            for (int i = 0; i < width_; i++) {
                for (int j = 0; j < height_; j++) {
                    if (i < j) {
                        pixels[i][j] = 0x0b6623;
                    } else {
                        pixels[i][j] = 0x0000FF;
                    }
                }
            }
            String imageFromPixels = getImageFromPixels(pixels);
        }

        if (false) {
            //3. Not main diagonal
            int width_ = 600;
            int height_ = 600;

            int[][] pixels = new int[width_][height_];
            for (int i = 0; i < width_; i++) {
                for (int j = 0; j < height_; j++) {
                    if (i < height_ - j) {
                        pixels[i][j] = 0x0b6623;
                    } else {
                        pixels[i][j] = 0x0000FF;
                    }
                }
            }
            String imageFromPixels = getImageFromPixels(pixels);
        }

        if (false) {
            //3. Czech flag
            int width_ = width;
            int height_ = height;

            int[][] pixels = new int[width_][height_];
            for (int i = 0; i < width_; i++) {
                for (int j = 0; j < height_; j++) {
                    if (i < height_ - j && i < j) {
                        pixels[i][j] = 0x0b6623;
                    } else if (j < height_ / 2) {
                        pixels[i][j] = 0x0000FF;
                    } else {
                        pixels[i][j] = 0xFFFF00;
                    }

                }
            }
            String imageFromPixels = getImageFromPixels(pixels);
        }

        if (false) {

            //3.
            int width_ = width;
            int height_ = height;

            int[][] pixels = new int[width_][height_];
            for (int i = 0; i < width_; i++) {
                for (int j = 0; j < height_; j++) {
                    if (height_ * i < width_ * (height_ - j)
                            && height_ * i < width_ * j) {
                        pixels[i][j] = 0x0b6623;
                    } else if (height_ * (width_ - i) < width_ * (height_ - j)
                            && height_ * (width_ - i) < width_ * j) {
                        pixels[i][j] = 0xabd662;
                    } else if (j < height_ / 2) {
                        pixels[i][j] = 0x0000FF;
                    } else {
                        pixels[i][j] = 0xFFFF00;
                    }

                }
            }
            String imageFromPixels = getImageFromPixels(pixels);

        }

        if (false) {

            //3. Japan
            int width_ = width;
            int height_ = height;
            int r = 200;
            int[][] pixels = new int[width_][height_];
            for (int i = 0; i < width_; i++) {
                for (int j = 0; j < height_; j++) {
                    if ((i - width_ / 2) * (i - width_ / 2) + (j - height_ / 2) * (j - height_ / 2) < r * r) {
                        pixels[i][j] = 0xFF0000;
                    } else {
                        pixels[i][j] = 0xFFFFFF;
                    }

                }
            }
            String imageFromPixels = getImageFromPixels(pixels);

        }


        if (false) {

            //3. Gradient
            int width_ = width;
            int height_ = height;
            int r = 200;
            int[][] pixels = new int[width_][height_];
            for (int i = 0; i < width_; i++) {
                for (int j = 0; j < height_; j++) {

                    pixels[i][j] = i * 0xFF0000 / width;

                }
            }
            String imageFromPixels = getImageFromPixels(pixels);

        }

        if (false) {

            int[][] pixels = getPixelsFromImage("harry-potter-and-the-sorcerers-stone-700x380.jpg");
            int width_ = pixels.length;
            int height_ = pixels[0].length;
            for (int i = 0; i < width_; i++) {

                for (int l = 0, r = height_ - 1; l < r; l++, r--) {
                    //swap
                    int temp = pixels[i][l];
                    pixels[i][l] = pixels[i][r];
                    pixels[i][r] = temp;
                }

            }
            String imageFromPixels = getImageFromPixels(pixels);
        }

        if (false) {


            int width_ = width;
            int height_ = height;

            int[][] pixels = new int[width_][height_];
            for (int i = 0; i < width_; i++) {
                for (int j = 0; j < height_; j++) {
                    double y = (-i + height_ / 2) * 1.2;
                    int x = j - width_ / 2;
                    double exp = y - Math.pow(Math.abs(x), 1.0);
                    if (x * x + exp * exp < height_ / 2) {
                        pixels[i][j] = 0xFF0000;
                    } else {
                        pixels[i][j] = 0xFFFFFF;
                    }

                }
            }
            String imageFromPixels = getImageFromPixels(pixels);

        }

        if (false) {
            int[][] pix = getPixelsFromImage("7ef3d90ffe90465f8c9b16448382185286-02-simpsons-couch.rsquare.w700.jpg");

            for (int i = 0; i < pix.length; i++) {
                for (int j = 0; j < pix[i].length; j++) {
                    int r = pix[i][j] - pix[i][j] % 0x10000;
                    int g = pix[i][j] % 0x10000 - pix[i][j] % 0x100;
                    int b = pix[i][j] % 0x100;

                    pix[i][j] = b;
                }
            }

            System.out.println(getImageFromPixels(pix));

        }

        if (false) {
            String name = "harry-potter-and-the-sorcerers-stone-700x380.jpg";
            int[][] pixelsFromImage = getPixelsFromImage(name);
            System.out.printf("pixels w=%d, h=%d\n", pixelsFromImage[0].length, pixelsFromImage.length);
            getImageFromPixels(pixelsFromImage);
        }

        if (false) {
            int u = 2000;
            int q = 3000;

            int count = 0;
            for (int i = 0; i < u; i++) {
                for (int j = 0; j < q; j++) {
                    count++;
                }
            }

            for (int j = 0; j < q; j++) {
                for (int i = 0; i < u; i++) {
                    count--;
                }
            }
            //Что выведет?
            System.out.println(count);


        }

        if (false) {
            int u = 5;
            int q = 3;
            StringBuilder output1 = new StringBuilder();
            StringBuilder output2 = new StringBuilder();

            for (int i = 0; i < u; i++) {
                for (int j = 0; j < q; j++) {
                    output1.append(i + " " + j).append("\n");
                }
            }

            for (int j = 0; j < q; j++) {
                for (int i = 0; i < u; i++) {
                    output2.append(i + " " + j).append("\n");
                }
            }
            //Что выведет?
            boolean same = output1.toString().equals(output2.toString());
            System.out.println(same ? "Одинаково" : "По разному");


        }

        if (false) {
            int u = 5;
            int q = 3;
            int[][] mtx1 = new int[u][q];
            int[][] mtx2 = new int[u][q];

            for (int i = 0; i < u; i++) {
                for (int j = 0; j < q; j++) {
                    mtx1[i][j] = i + j;
                }
            }

            for (int j = 0; j < q; j++) {
                for (int i = 0; i < u; i++) {
                    mtx2[i][j] = i + j;
                }
            }

            //Что выведет?
            boolean same = true;
            for (int i = 0; i < u; i++) {
                for (int j = 0; j < q; j++) {
                    same &= mtx1[i][j] == mtx2[i][j];
                }
            }

            System.out.println(same ? "Одинаково" : "По разному");


        }

        if (false) {

            int[][] mtx = new int[height][width];

            int color1 = 0xFF0000;//Left j == 0
            int color2 = 0x00FF00;//Right j == height - 1

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int resRed =
                            average(red(color1), red(color2), width - j, j);
                    int resGreen =
                            average(green(color1), green(color2), width - j, j);
                    int resBlue =
                            average(blue(color1), blue(color2), width - j, j);
                    mtx[i][j] = color(resRed, resGreen, resBlue);

                }
            }

            ImageUtil.getImageFromPixels(mtx);
        }

        if (true) {

            int[][] mtx = new int[height][width];

            int color1 = 0xFF0000;//Left top i == 0, j == 0
            int color2 = 0x00FF00;//Right top i == 0, j == height - 1
            int color3 = 0x0000FF;//Right bottom i == width - 1, j == height - 1
            int color4 = 0x0FFFF0;//Left bottom i == width - 1, j == 0

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int resRedJTop =
                            average(red(color1), red(color2), width - j, j);
                    int resGreenJTop =
                            average(green(color1), green(color2), width - j, j);
                    int resBlueJTop =
                            average(blue(color1), blue(color2), width - j, j);

                    int resRedJBottom =
                            average(red(color4), red(color3), width - j, j);
                    int resGreenJBottom =
                            average(green(color4), green(color3), width - j, j);
                    int resBlueJBottom =
                            average(blue(color4), blue(color3), width - j, j);

                    int resRed =
                            average(resRedJTop, resRedJBottom, height - i, i);
                    int resGreen =
                            average(resGreenJTop, resGreenJBottom, height - i, i);
                    int resBlue =
                            average(resBlueJTop, resBlueJBottom, height - i, i);


                    mtx[i][j] = color(resRed, resGreen, resBlue);

                }
            }

            ImageUtil.getImageFromPixels(mtx);
        }

        if (false) {

            //Rounded gradient
            int width_ = width;
            int height_ = height;
            int r = 200;
            int[][] pixels = new int[width_][height_];
            for (int i = 0; i < width_; i++) {
                for (int j = 0; j < height_; j++) {
                    double distFromCenter = (i - width_ / 2.0) * (i - width_ / 2.0) + (j - height_ / 2.0) * (j - height_ / 2.0);
                    if (distFromCenter < r * r) {
                        pixels[i][j] = averageRGB(0xFF0000, 0xFFFFFF, r - Math.sqrt(distFromCenter), Math.sqrt(distFromCenter));
                    } else {
                        pixels[i][j] = 0xFFFFFF;
                    }

                }
            }
            String imageFromPixels = getImageFromPixels(pixels);

        }
    }

    private static int averageRGB(int color1, int color2, double weight1, double weight2) {
        int resRed =
                average(red(color1), red(color2), weight1, weight2);
        int resGreen =
                average(green(color1), green(color2), weight1, weight2);
        int resBlue =
                average(blue(color1), blue(color2), weight1, weight2);
        return color(resRed, resGreen, resBlue);

    }

    private static int average(int color1, int color2, double weight1, double weight2) {
        return (int) ((color1 * weight1 + color2 * weight2) / (weight1 + weight2));
    }

    private static int color(int red, int green, int blue) {
        return red * 0x10000 + green * 0x100 + blue;
    }

    private static int red(int color) {
        return color / 0x10000;
    }

    private static int green(int color) {
        return color % 0x10000 / 0x100;
    }

    private static int blue(int color) {
        return color % 0x100;
    }


}
