package by.erumyantsev.javacourse3.singleton;

/**
 * Created by Yauheni_Rumiantsau on 6/21/2017.
 */
public class SingletonTetrahedron {

    private final static SingletonTetrahedron INSTANCE = new SingletonTetrahedron();
    private SingletonTetrahedron(){};
    public static SingletonTetrahedron getInstance(){
        return INSTANCE;
    }
}
