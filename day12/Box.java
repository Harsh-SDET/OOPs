package day12;

public class Box {
    //Constructor over laoding concept 

    int height, width, length;

    Box(){
        height = width = length = 0;
    }

    Box(int l, int w, int h) {
        length=l;
        width=w;
        height=h;
    }

    Box(int x){
        length = width = height = x;
    }

    int area(){
        return length*width*height;
    }
}
