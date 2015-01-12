import model.MyParam;
import model.MyResult;

import javax.ws.rs.*;

/**
 * Created by aecho on 2015/1/8.
 */

@Path("myresource")
public class MyResource {

    @GET
    @Produces("text/plain")
    public String getIt()
    {
        return "Hello World";
    }

    @POST
    @Path("mul")
    @Produces("application/json")
    @Consumes("application/json")
    public MyResult postMul(MyParam param) {
        MyResult result = new MyResult();
        int val = param.getFirst() * param.getSecond();
        result.setResult(val);
        return result;
    }

    @POST
    @Path("add")
    @Produces("application/json")
    @Consumes("application/json")
    public MyResult postAdd(MyParam param) {
        MyResult result = new MyResult();
        int val = param.getFirst() + param.getSecond();
        result.setResult(val);
        return result;
    }
}

