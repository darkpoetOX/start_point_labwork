public class Rectangle {
int width;
int height;
    public Rectangle(int inputWidth, int inputHeight){
        this.width = inputWidth;
        this.height = inputHeight;

    }

    public int areaMethod(){
        return this.width * this.height;
    }

    public boolean isRectangleMethod(){
        if(this.width == this.height){
            return false;
        } else {
            return true;
        }
    }
}
