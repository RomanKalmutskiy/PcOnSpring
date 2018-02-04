package itea.ua;

import java.net.URL;

public class ClassContextLoader implements ContextLoader  {

	
	String nameContext;
	
	public String getNameContext() {
		return nameContext;
	}

	public void setNameContext(String nameContext) {
		this.nameContext = nameContext;
	}

	public String getUrl() {
	URL	url = this.getClass().getClassLoader().getResource("context.xml");
		
	String context = url.toString();
		return context;
	}

}
