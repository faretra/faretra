package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.stavros.faretra.process.Executor;
import org.stavros.faretra.process.model.ProcessDescription;
import org.stavros.faretra.process.model.ProcessParameter;

public class TestExecutor {
	public static void main(String[] args) {
		ProcessDescription pd = new ProcessDescription();
		pd.setCommand("cmd");
		
		List<ProcessParameter> parameters = new ArrayList<ProcessParameter>();
		ProcessParameter pp = new ProcessParameter();
		pp.setPrefix("/");
		pp.setName("c");
		parameters.add(pp);
		pp = new ProcessParameter();
		pp.setName("dir");
		parameters.add(pp);
		pp = new ProcessParameter();
		pp.setName("*.*");
		parameters.add(pp);
		
		pd.setParameters(parameters);
		
		pd.toString();
		
		Executor e = new Executor();
		try {
			e.execute(pd);
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
