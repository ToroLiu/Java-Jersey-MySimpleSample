package model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aecho on 2015/1/12.
 */
@XmlRootElement
public class MyResult {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
