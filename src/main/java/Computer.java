public class Computer {
    private int storage;
    private String colour;
    String message;

    public Computer(int inputStorage){
        this.storage = inputStorage;
        this.colour = "red";
        this.message = "";
    }

    public int getStorage(){
        return this.storage;
    }

    public int addStorage(int updatedStorage){
        return this.storage += updatedStorage;
    }

    public void setColour(String updatedColour){
        this.colour = updatedColour;
    }

    public String getColour(){
        return this.colour;
    }

    public String printMessage(String inputMessage){
        return this.message = inputMessage;
    }

}

