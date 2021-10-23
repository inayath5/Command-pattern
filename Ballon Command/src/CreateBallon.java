
public class CreateBallon implements BallonCommand{
	
	private BallonDevice fd;

	public CreateBallon(BallonDevice fd) {
		super();
		this.fd = fd;
	}

	public BallonDevice getFd() {
		return fd;
	}

	public void setFd(BallonDevice fd) {
		this.fd = fd;
	}

	@Override
	public void execute() {
		 fd.create();
		
	}

}
