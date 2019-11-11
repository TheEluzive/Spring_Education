import java.util.ArrayList;
import java.util.List;

//import lombok.Getter;


public class MusicPlayer {
	private List<IMusic> music = new ArrayList<IMusic>();
	private int volume;
	private String name;
	
	
	public MusicPlayer(List<IMusic> music ) {
		this.music = music;
	}
	public MusicPlayer() {}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setMusic(List<IMusic> music ) {
		this.music = music;
	}
	
	public int getVolume() {
		return volume;
	}
	public String getName() {
		return name;
	}
	
	public void playMusic(){
	for (int i = 0; i<music.size(); i++)
	System.out.println("Playing: " + music.get(i).getSong());	
	}


}
