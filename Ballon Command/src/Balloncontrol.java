
public class balloncontrol {
	
	private BallonCommand fcmd;

	public BallonControl(BallonCommand Balloncmd) {
		fcmd = Balloncmd;
	}

	public BallonCommand getFcmd() {
		return fcmd;
	}

	public void setFcmd(BallonCommand fcmd) {
		this.fcmd = fcmd;
	}

	
	public void onclick() {
		fcmd.execute();
	}
	
	
}
