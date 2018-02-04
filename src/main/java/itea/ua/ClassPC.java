package itea.ua;

public class ClassPC implements Pc {
String name;
MotherBoard motherBoard;
Cpu cpu;

public Cpu getCpu() {
	return cpu;
}
public void setCpu(Cpu cpu) {
	this.cpu = cpu;
}
public MotherBoard getMotherBoard() {
	return motherBoard;
}
public void setMotherBoard(MotherBoard motherBoard) {
	this.motherBoard = motherBoard;
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	
	return name;
	
}
@Override
public String toString(){
	return "PC [name: ="+name+"]; MotherBoard [name:= "+motherBoard.getName()+"; "+"slotCount:= "+motherBoard.getSlotCount()+"]; "
			+ "CPU [name:= "+cpu.getName()+"; frequency:= "+cpu.getFrequency()+" GHz]; GPU [name:= "+motherBoard.getGpu()+"]";
	
}

}
