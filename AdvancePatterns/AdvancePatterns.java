public class AdvancePatterns {
    // Hollow Square 
    // * * * * * 
    // *       *
    // *       *
    // * * * * *
    public static void hollowSquare(int toatlRows, int totalCols){
        for (int i = 1; i <= toatlRows; i++) {
            for (int j = 1; j <= totalCols; j++) {
                if (i == 1 || i == toatlRows || j == 1 || j == totalCols) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    // Inverted & Rotated Half Pyramid
    //         * 
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    public static void RotatedHalfPyramid(int totalrows){
        // outer loop
        for (int i = 1; i <= totalrows; i++) {
            // spaces 
            for (int j = 1; j <= totalrows - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Next line
            System.out.println();
        }
    }


    // Inverted Half Pyramid with numbers 
    // 1 2 3 4 5 
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void Half_Pyramid_With_Numbers(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.err.print(j + " ");
            }
            System.out.println();
        }
    }


    // Floyd's Triangle
    // 1 
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    public static void FloydsTriangle(int n){
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }


    // Zero - One Triangle
    // 1 
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    public static void zero_oneTriangel(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0 ) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        } 
    }


    // Butterfly Pattern
    // *             * 
    // * *         * * 
    // * * *     * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * *     * * *
    // * *         * *
    // *             *
    public static void Butterfly(int n){
        // first set 
        for (int i = 1; i <= n; i++) {
            // stars -> i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces ->  2*(n-i)
            for (int j = 1; j <= 2*(n-i); j++) {
               System.out.print("  "); 
            }

            // stars -> i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } 
            
            System.out.println();
        }

        // second set
        for (int i = n; i >= 1; i--) {
            // stars -> i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces ->  2*(n-1)
            for (int j = 1; j <= 2*(n-i); j++) {
               System.out.print("  "); 
            }

            // stars -> i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } 
            System.out.println();
        }
    }


    // Solid Rhombus
    //         * * * * * 
    //       * * * * *   
    //     * * * * *     
    //   * * * * *       
    // * * * * * 
    public static void Solid_Rhombus(int n){
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }
    }


    // Hollow Rhombus
    //         * * * * * 
    //       *       * 
    //     *       * 
    //   *       * 
    // * * * * *
    public static void hollowRhombus(int n){
        for (int i = 1; i <= n; i++) {
            // spaces 
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            // rhombus stars
            for (int j = 1; j <= n; j++) {
              if (i == 1 || i == n || j == 1 || j == n) {
                System.out.print("* ");
              } 
              else{
                System.out.print("  ");
              } 
            }
            System.out.println();

        }
    }


    // Diamond Pattern
    //       * 
    //     * * *
    //   * * * * *
    // * * * * * * *
    // * * * * * * *
    //   * * * * *
    //     * * *
    //       *
    public static void Diamond(int n){
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // Numbers Pyramid
    //         1   
    //       2   2
    //     3   3   3
    //   4   4   4   4
    // 5   5   5   5   5
    public static void numbesPyramid(int n){
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "   ");
            }

            // next line
            System.out.println();
        }
    }


    // Palindromic pattern with Numbers
    //     1
    //    212
    //   32123
    //  4321234
    // 543212345
    public static void PalindromicPattern_Numbers(int n){
        for (int i = 1; i <= n; i++) {
            // space 
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j2 = i; j2 >= 1; j2--) {
                System.out.print(j2);
            }
            for (int j2 = 2; j2 <= i; j2++) {
                System.out.print(j2);
            }
            System.out.println();
            
        }
    }


    public static void main(String[] args) {
        // Hollow Square 
        // hollowSquare(4, 5);

        // Inverted & Rotated Half Pyramid
        // RotatedHalfPyramid(5);

        // Inverted Half Pyramid with numbers 
        // Half_Pyramid_With_Numbers(5);

        // FloydsTriangle(5);

        // zero_oneTriangel(5);

        // Butterfly(4);

        // Solid_Rhombus(5);

        // hollowRhombus(3);

        // Diamond(4);

        // numbesPyramid(5);

        PalindromicPattern_Numbers(5);
    }
}
