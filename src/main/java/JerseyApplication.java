import com.wordnik.swagger.config.ConfigFactory;
import com.wordnik.swagger.config.ScannerFactory;
import com.wordnik.swagger.config.SwaggerConfig;
import com.wordnik.swagger.jaxrs.config.DefaultJaxrsScanner;
import com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider;
import com.wordnik.swagger.jaxrs.listing.ApiListingResource;
import com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON;
import com.wordnik.swagger.jaxrs.listing.ResourceListingProvider;
import com.wordnik.swagger.jaxrs.reader.DefaultJaxrsApiReader;
import com.wordnik.swagger.reader.ClassReaders;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by aecho on 2015/1/8.
 */

@ApplicationPath("/myapp")
public class JerseyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses()
    {
        HashSet<Class<?>> set = new HashSet<Class<?>>();
        set.add(ApiListingResource.class);
        set.add(ApiDeclarationProvider.class);
        set.add(ApiListingResourceJSON.class);
        set.add(ResourceListingProvider.class);
        set.add(MyResource.class);

        swaggerConfiguration();
        return set;
    }

    private void swaggerConfiguration() {
        SwaggerConfig config = new SwaggerConfig();
        ConfigFactory.setConfig(config);

        config.setApiVersion("1.0.0");
        config.setApiPath("/myapp");

        ScannerFactory.setScanner(new DefaultJaxrsScanner());
        ClassReaders.setReader(new DefaultJaxrsApiReader());
    }

}
