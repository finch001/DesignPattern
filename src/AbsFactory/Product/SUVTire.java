package AbsFactory.Product;

import AbsFactory.Product.part.ITire;

/**
 * Created by finch on 2016/12/12.
 */
public class SUVTire implements ITire {

    @Override
    public void tire() {
        System.out.println("SUVTire");
    }
}
