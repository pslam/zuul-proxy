package pslam.tools.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class BaseController
{
    @Value("${zuul.routes.api.url}")
    private String targetUrl;


    @RequestMapping({"/", "/status"})
    public String ping()
    {
        return "Wallet requests will be proxy to " + targetUrl;
    }
    
}
