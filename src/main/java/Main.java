import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
		ClassPathXmlApplicationContext classPathXMLContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//IMusic music=classPathXMLContext.getBean("music", IMusic.class);
		//MusicPlayer musicPlayer = new MusicPlayer(music);
		MusicPlayer musicPlayer = classPathXMLContext.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getVolume());
		classPathXMLContext.close();
		System.in.read();
	}
}
