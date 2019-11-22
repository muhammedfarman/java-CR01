
import java.lang.*;

public class main {



    public static String cRectangle(int width, int height) {
        int result = width * height;
        return "The Area of the Rectangle  " + width+"cm" + "  ,  " + height+"cm" + "  // is: " + result +"cm²";
    }
    public static String cSquarearea(int width) {
        int result = width * width;
        return "the square area  "+" // is: "  + result+ "cm²";
    }
    public static String cSquarePerimeter(int width) {
        int result = width * 4;
        return "the squarePerimeter"+" // is: " + result+"cm²";
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("    __   ___   ___      ___      ____     ___  __ __  ____    ___  __    __ \n" +
                "   /  ] /   \\ |   \\    /  _]    |    \\   /  _]|  |  ||    |  /  _]|  |__|  |\n" +
                "  /  / |     ||    \\  /  [_     |  D  ) /  [_ |  |  | |  |  /  [_ |  |  |  |\n" +
                " /  /  |  O  ||  D  ||    _]    |    / |    _]|  |  | |  | |    _]|  |  |  |\n" +
                "/   \\_ |     ||     ||   [_     |    \\ |   [_ |  :  | |  | |   [_ |  `  '  |\n" +
                "\\     ||     ||     ||     |    |  .  \\|     | \\   /  |  | |     | \\      / \n" +
                " \\____| \\___/ |_____||_____| ___|__|\\_||_____|_ \\_/  |____||_____|  \\_/\\_/  \n" +
                "                     |    | /    ||  |  | /    |                            \n" +
                "                     |__  ||  o  ||  |  ||  o  |                            \n" +
                "                     __|  ||     ||  |  ||     |                            \n" +
                "                    /  |  ||  _  ||  :  ||  _  |                            \n" +
                "                    \\  `  ||  |  | \\   / |  |  |                            \n" +
                "                     \\____j|__|__|  \\_/  |__|__|                            \n" +
                "                                                                          ");

       String newline="\n";
        int w1 = 20;
        int h1 = 30;
        int w2 = 40;
        int h2 = 50;
        int w3 = 60;
        int h3 = 80;
        int w4 = 15;
        int h4 = 37;
        int w5 = 88;
        int h5 = 50;
        int w6 = 80;
        int h6 = 90;
        System.out.println(cRectangle(w1, h1) + newline
                + cRectangle(w2, h2) + newline
                + cRectangle(w3, h3) + newline
                + cRectangle(w4, h4)+ newline
                + cRectangle(w5, h5) + newline
                + cRectangle(w6, h6));


//Square area
        int wp1 = 7;
        int wp2 = 5;
        int wp3 = 25;
        int wp4 = 20;
        System.out.println(cSquarearea(wp1) + newline
                + cSquarearea(wp2) + newline
                + cSquarearea(wp3) + newline
                + cSquarearea(wp4));


// SquarePerimeter
        int ws = 4;
        int ws1 = 2;
        int ws2 = 12;
        int ws3 = 5;
        int ws4 = 20;
        int ws5 = 75;
        System.out.println(cSquarePerimeter(ws) + newline
                           + cSquarePerimeter(ws1)+ newline
                           + cSquarePerimeter(ws2)+ newline
                           + cSquarePerimeter(ws3) +newline
                           + cSquarePerimeter(ws4) +newline
                           + cSquarePerimeter(ws5)+newline);


// BONUS 1:
        int[] widths = {4, 5, 6, 10};
        int[] heights = {2, 3, 4, 8};
        for(int i = 0; i < widths.length; i++) {
            System.out.println("the loop result : "+cRectangle(widths[i], heights[i]));
        }

// Bonus 2 : arguments !!
        if(args.length == 2){
            int argWidth = Integer.parseInt(args[0]);
            int argHeight = Integer.parseInt(args[1]);
            String argResult = cRectangle(argWidth, argHeight);
            System.out.println("Bonus 2: "+argResult);
        }
        System.out.println("                                                                               ___  ____   ___       \n" +
                "                                                                              /  _]|    \\ |   \\      \n" +
                "                                                                             /  [_ |  _  ||    \\     \n" +
                "                                                                            |    _]|  |  ||  D  |    \n" +
                "                                                                            |   [_ |  |  ||     |    \n" +
                "                                                                            |     ||  |  ||     |    \n" +
                "                                                                            |_____||__|__||_____|    \n" +
                "                                                                                                    ");
        System.out.println("             ,                                                                                             \n" +
                "                                 Et                                                                                            \n" +
                "                                 E#t                                                                             L.            \n" +
                "                                 E##t                 j.                                                         EW:        ,ft\n" +
                "           ..       :            E#W#t             .. EW,                   ..           ..       :           .. E##;       t#E\n" +
                "          ,W,     .Et            E#tfL.           ;W, E##j                 ;W,          ,W,     .Et          ;W, E###t      t#E\n" +
                "         t##,    ,W#t            E#t             j##, E###D.              j##,         t##,    ,W#t         j##, E#fE#f     t#E\n" +
                "        L###,   j###t         ,ffW#Dffj.        G###, E#jG#W;            G###,        L###,   j###t        G###, E#t D#G    t#E\n" +
                "      .E#j##,  G#fE#t          ;LW#ELLLf.     :E####, E#t t##f         :E####,      .E#j##,  G#fE#t      :E####, E#t  f#E.  t#E\n" +
                "     ;WW; ##,:K#i E#t            E#t         ;W#DG##, E#t  :K#E:      ;W#DG##,     ;WW; ##,:K#i E#t     ;W#DG##, E#t   t#K: t#E\n" +
                "    j#E.  ##f#W,  E#t            E#t        j###DW##, E#KDDDD###i    j###DW##,    j#E.  ##f#W,  E#t    j###DW##, E#t    ;#W,t#E\n" +
                "  .D#L    ###K:   E#t            E#t       G##i,,G##, E#f,t#Wi,,,   G##i,,G##,  .D#L    ###K:   E#t   G##i,,G##, E#t     :K#D#E\n" +
                " :K#t     ##D.    E#t            E#t     :K#K:   L##, E#t  ;#W:   :K#K:   L##, :K#t     ##D.    E#t :K#K:   L##, E#t      .E##E\n" +
                " ...      #G      ..    .j       E#t    ;##D.    L##, DWi   ,KK: ;##D.    L##, ...      #G      .. ;##D.    L##, ..         G#E\n" +
                "          j             ;f.      ;#t    ,,,      .,,             ,,,      .,,           j          ,,,      .,,              fE\n" +
                "                                  :;                                                                                          ,\n ");
    }

}