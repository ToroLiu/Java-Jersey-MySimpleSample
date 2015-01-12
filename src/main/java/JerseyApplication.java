import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by aecho on 2015/1/8.
 */

@ApplicationPath("/myapp")
public class JerseyApplication extends Application {
    public Set<Class<?>> getClasses()
    {
        HashSet<Class<?>> set = new HashSet<Class<?>>();
        set.add(MyResource.class);
        return set;
    }

}
