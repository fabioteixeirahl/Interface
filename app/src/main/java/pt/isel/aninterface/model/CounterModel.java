package pt.isel.aninterface.model;

public class CounterModel {
    private int value;

    public CounterModel() {
        value = 0;
    }

    public void inc() {
        value++;
        valueUpdate(value);
    }

    public void dec() {
        value--;
        valueUpdate(value);
    }

    CounterListerner listerner;
    public void addListener(CounterListerner listerner) {
        this.listerner = listerner;
    }

    public void valueUpdate(int value){
        listerner.updateValue(value);
    }


}
