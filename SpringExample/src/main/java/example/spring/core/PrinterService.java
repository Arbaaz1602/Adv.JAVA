package example.spring.core;

public class PrinterService implements GreetingService {
	
	private String content;
	private Printer currentPrinter;
	

	public PrinterService() {
		
	}

	public String sayGreeting() {
		
		return content+": is printed by"+currentPrinter.toString();
	}

	public PrinterService(String content, Printer currentPrinter) {
		super();
		this.content = content;
		this.currentPrinter = currentPrinter;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Printer getCurrentPrinter() {
		return currentPrinter;
	}

	public void setCurrentPrinter(Printer currentPrinter) {
		this.currentPrinter = currentPrinter;
	}

	@Override
	public String toString() {
		return "PrinterService [content=" + content + ", currentPrinter=" + currentPrinter + "]";
	}
	
	

}
