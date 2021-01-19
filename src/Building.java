abstract class Building {
    int _height;
    double _width;
    char _energy_efficiency_class;

    abstract void above (int height);
    abstract void wider (double width);
    abstract void eco (char energy_efficiency_class );

    static void showResult(Object obj,boolean result){
        System.nanoTime();
        System.out.println(obj.getClass().getName() + " : " + result );
    }

}

class House extends Building{

    @Override
    void above(int height) {
        boolean result = height >= 200;
        if (result) _height = height;
        showResult(this,result);

    }

    @Override
    void wider(double width) {
        boolean result = width >= 10.5;
        if (result) _width = width;
        showResult(this,result);

    }

    @Override
    void eco(char energy_efficiency_class) {
        boolean result = _energy_efficiency_class != 'A';
        if (result) _energy_efficiency_class = energy_efficiency_class;
        showResult(this,result);

    }
}

class Skyscraper extends Building{

    @Override
    void above(int height) {
        boolean result = height >= 200;
        if (result) _height = height;
        showResult(this,result);

    }

    @Override
    void wider(double width) {
        boolean result = width >= 10.5;
        if (result) _width = width;
        showResult(this,result);

    }

    @Override
    void eco(char energy_efficiency_class) {
        boolean result = _energy_efficiency_class != 'A';
        if (result) _energy_efficiency_class
                = energy_efficiency_class;
        showResult(this, result);
    }
}




