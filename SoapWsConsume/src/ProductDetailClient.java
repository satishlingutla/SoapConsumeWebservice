import serviceimpl.ProductService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * Date: 6/26/17
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductDetailClient {

    public static void main(String[] args) {

        try {

            URL url = new URL("http://localhost:9876/productDetail?wsdl");
            QName qname = new QName("http://serviceImpl/",
                    "ProductServiceImplService");

            Service service = Service.create(url, qname);

            ProductService server = service.getPort(ProductService.class);

            System.out.println(server.productDetail(2));


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
