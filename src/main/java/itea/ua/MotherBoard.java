package itea.ua;

public interface MotherBoard {
	String getName();
	int getSlotCount();
	void setGpu (Gpu gpu);
	Gpu getGpu();
	
}
