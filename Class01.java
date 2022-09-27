class CRectangle{
    int width;
    int height;
void CRectangle(int w,int h){
    width=w;height=h;
}
void CRectangle1(int w,int h){
    this.width=w;
    this.height=h;
}

}

public class Class01 {
    public static void main(String[] args) {
        CRectangle nn=new CRectangle();
        nn.CRectangle(10,8);
        nn.out();
        }
    
}


