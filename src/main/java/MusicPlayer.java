import lombok.Getter;


public class MusicPlayer {
	private IMusic music;
	private int volume;
	private String name;
	
	
	public MusicPlayer(IMusic music) {
		this.music = music;
	}
	public MusicPlayer() {}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setMusic(IMusic music) {
		this.music = music;
	}
	
	public int getVolume() {
		return volume;
	}
	public String getName() {
		return name;
	}
	
	public void playMusic(){
	System.out.println("Playing: " + music.getSong());	
	}


}
