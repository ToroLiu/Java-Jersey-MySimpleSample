package model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aecho on 2015/1/12.
 */
@XmlRootElement
public class MyParam {
    private int first;
    private int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
