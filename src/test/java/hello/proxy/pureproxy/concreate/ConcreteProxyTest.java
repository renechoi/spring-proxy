package hello.proxy.pureproxy.concreate;

import hello.proxy.pureproxy.concreate.code.ConcreteClient;
import hello.proxy.pureproxy.concreate.code.ConcreteLogic;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.execute();

    }
}
