
public class DeleteBallon implements BallonCommand{
	
	private BallonDevice fd;

	public DeleteBallon(BallonDevice fd) {
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
		 fd.delete();
		
	}

}
