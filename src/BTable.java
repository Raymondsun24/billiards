import java.awt.*;

public class BTable{

    // Some constants
    // all in millimeters
    public static final int OUTERLENGTH = 2820;
    public static final int OUTERWIDTH = 1550;
    public static final int INNERLENGTH = 2540;
    public static final int INNERWIDTH = 1270;
    public static final int POCKETRAD = 40;

    /* P1 ------------------ P2
        |                    |
        |                    |
        |                    |
        |                    |
        |                    |
        |                    |
        P3                   P4
        |                    |
        |                    |
        |                    |
        |                    |
        |                    |
        |                    |
        P5 ----------------- P6
        Let P5 be origin and set up a cartesian corrdinate system
    */
	public static final Point P5 = new Point(0,0);
	public static final Point P1 = new Point(0,2540);
	public static final Point P2 = new Point(1270,2540);
	public static final Point P3 = new Point(0,1270);
	public static final Point P4 = new Point(1270,1270);
	public static final Point P6 = new Point(1270,0);

    private BBall cueBall;
    private BBall solid1,solid2,solid3,solid4,solid5,solid6,solid7;
    private BBall striped9,striped10,striped11,striped12,striped13,striped14,striped15;
    private BBall black8;

    // Constructor
    public BTable(){
	    this.cueBall = new CueBall();
	    this.solid1 = new SolidBall(1);
	    this.solid2 = new SolidBall(2);
        this.solid3 = new SolidBall(3);
        this.solid4 = new SolidBall(4);
        this.solid5 = new SolidBall(5);
        this.solid6 = new SolidBall(6);
        this.solid7 = new SolidBall(7);
        this.black8 = new BlackBall();
        this.striped9 = new StripedBall(9);
        this.striped10 = new StripedBall(10);
        this.striped11 = new StripedBall(11);
        this.striped12 = new StripedBall(12);
        this.striped13 = new StripedBall(13);
        this.striped14 = new StripedBall(14);
        this.striped15 = new StripedBall(15);
    }

    // The following two functions consume a interger ranged from 0 to 15, indicating the number on the ball.
    // CueBall is number 0 within the scope of module.
    private BBall getBall(int n){
        switch(n) {
            case 0: return cueBall;
            case 1: return solid1;
            case 2: return solid2;
            case 3: return solid3;
            case return solid4;
            if (n == 5) return solid5;
            if (n == 6) return solid6;
            if (n == 7) return solid7;
            if (n == 8) return black8;
            if (n == 9) return striped9;
            if (n == 10) return striped10;
            if (n == 11) return striped11;
            if (n == 12) return striped12;
            if (n == 13) return striped13;
            if (n == 14) return striped14;
            if (n == 15) return striped15;
        }
    }

    public getPosition(int n){
        return getBall(n).posn;
    }


}