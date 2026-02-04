package Abstraction;

public interface InterFaceFirst {
    void call();

}

interface InterFaceSecond {
    void hang();
}

interface InterfaceFusion extends InterFaceFirst, InterFaceSecond {
    void ring();
}

class ClassA implements InterfaceFusion {
    @Override
    public void ring() {

    }

    @Override
    public void call() {

    }

    @Override
    public void hang() {

    }
}

abstract class ClassB implements InterfaceFusion{
    void text(){

    }
}
class classC extends ClassB{
    @Override
    public void ring() {

    }

    @Override
    public void call() {

    }

    @Override
    public void hang() {

    }
}