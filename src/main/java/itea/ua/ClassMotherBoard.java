package itea.ua;

public class ClassMotherBoard implements MotherBoard{

	String name;
	int slotCount;
	Gpu gpu;
	
	public String getName() {
		return name;
	}
	public int getSlotCount() {
		return slotCount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSlotCount(int slotCount) {
		this.slotCount = slotCount;
	}
	
	@Override
	public String toString(){
		return "MotherBoard [name: = "+name+"]; [slotCoutn:= "+slotCount+"]";
		
	}
	public void setGpu(Gpu gpu) {
		this.gpu=gpu;
		
	}
	public Gpu getGpu() {
		return gpu;
		
	}
	
	

}
