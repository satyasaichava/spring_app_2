package pack.base;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CMDRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Command Line Runner executed in CMDRunner");
	}
	
}
