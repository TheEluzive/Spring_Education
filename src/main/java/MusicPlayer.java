
public class MusicPlayer {
	private IMusic music;
	
	public MusicPlayer(IMusic music) {
		this.music = music;
	}
	
	public void playMusic(){
	System.out.println(music.getSong());
	
	
	}


}
