package com.leetCodePrograms.mathPrograms;
//Calculate Distance Between Two Points
// d = √(x2 - x1)^2 + (y2-y1)^2
 class distanceBtmTwoPoints {
    public static void main(String[] args) {
        int x1 = 1, x2 = 2;
        int y1 = 3 , y2 = 4;
        double dx = x2 - x1, dy = y2 - y1;
        double dx1 = dx  * dx , dy1 = dy * dy;
        double result = Math.sqrt(dx1 + dy1);
        System.out.println(result);
    }
}
