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

    protected BBall cueBall;
    protected BBall solid1,solid2,solid3,solid4,solid5,solid6,solid7;
    protected BBall striped9,striped10,striped11,striped12,striped13,striped14,striped15;
    protected BBall black8;

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

}