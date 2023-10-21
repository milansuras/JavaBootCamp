package ObjectOriented.Inheritence.Example2;

public class BoxWeight extends Box{
          int weight;

          public BoxWeight(){
              this.weight=1;
          }

          public BoxWeight(int length,int width, int height, int weight){
              super(length,width,height);
              this.weight=weight;
          }
}
