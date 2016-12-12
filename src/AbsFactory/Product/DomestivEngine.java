package AbsFactory.Product;

import AbsFactory.Product.part.IEngine;

/**
 * Created by finch on 2016/12/12.
 */
public class DomestivEngine implements IEngine {

    @Override
    public void engine() {
        System.out.println("DomestivEngine");
    }
}
