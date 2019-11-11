import lombok.Setter;
import lombok.NoArgsConstructor;
//@Setter 
public class MusicPlayer {
	private IMusic music;
	
	
	
	/*public void setMusic(IMusic music) {
		this.music = music;
	}*/
	public MusicPlayer(IMusic music) {
		this.music = music;
	}
	public MusicPlayer() {}
	
	public void playMusic(){
	System.out.println(music.getSong());
	
	}


}
