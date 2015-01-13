import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import model.MyParam;
import model.MyResult;

import javax.ws.rs.*;

/**
 * Created by aecho on 2015/1/8.
 */

@Path("myresource")
@Api(value="myresource", description="My resource document")
public class MyResource {

    @GET
    @Produces("text/plain")
    @ApiOperation(value="Get hello world", httpMethod = "GET", response=String.class)
    @ApiResponse(code=200, message="Success to get the response")
    public String getIt()
    {
        return "Hello World";
    }

    @POST
    @Path("mul")
    @Produces("application/json")
    @Consumes("application/json")
    @ApiOperation(value="Do multiply", httpMethod = "POST", response=MyResult.class)
    @ApiResponse(code=200, message="Success to get the multiply result")
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
    @ApiOperation(value="Do add", httpMethod = "POST", response = MyResult.class)
    @ApiResponse(code=200, message="Success to get the response.")
    public MyResult postAdd(MyParam param) {
        MyResult result = new MyResult();
        int val = param.getFirst() + param.getSecond();
        result.setResult(val);
        return result;
    }
}

