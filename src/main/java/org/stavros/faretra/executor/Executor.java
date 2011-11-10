package org.stavros.faretra.executor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Executor {
	public void execute(ProcessDescription pd) throws IOException, InterruptedException {
		String cmd = pd.toString();
		
		System.out.println(cmd);
		
		Runtime run = Runtime.getRuntime() ;
		
		String[] envp = new String[1];
		envp[0] = "PATH=C:/windows/system32";
		Process pr = run.exec(cmd, envp);
		//pr.waitFor();
		BufferedReader buf = new BufferedReader( new InputStreamReader( pr.getInputStream() ) ) ;

		String line = buf.readLine();
		while (line != null) {
			System.out.println(line) ;
			line = buf.readLine();
		}
		System.out.println("----------------");
	}
}
