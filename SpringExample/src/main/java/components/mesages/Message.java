package components.mesages;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component	//Tells spring that this class is a component
public class Message {
	
	private String content;
	

	public Message() {
		System.out.println("MESSAGE - NO ARGS");
		content="Spring is Amazing";
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	

}
