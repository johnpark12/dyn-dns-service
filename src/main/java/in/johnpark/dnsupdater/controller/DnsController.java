package in.johnpark.dnsupdater.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.johnpark.dnsupdater.model.Subdomain;
import in.johnpark.dnsupdater.repository.SubdomainRepository;

@RestController
public class DnsController {
    @Autowired
    private SubdomainRepository subdomainRepository;

    @GetMapping("/test")
    public String test() {
        return "API is working!";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Subdomain> getAllSubdomains() {
        System.out.println("in all");
        // This returns a JSON or XML with the users
        return subdomainRepository.findAll();
    } 

    // Consider swapping to ResponseBody in the future.
    // @PostMapping("/add")
    // public @ResponseBody String addNewSubdomain(@RequestBody Subdomain newSubdomain) {
    //     System.out.println("test");
    //     System.out.println(newSubdomain.getName());
    //     System.out.println(newSubdomain.getIp());

    //     subdomainRepository.save(newSubdomain);
    //     return "Saved";
    // }

    @PostMapping("/add")
    public @ResponseBody String addNewSubdomain(@RequestParam String name
        , @RequestParam String ip) {

        Subdomain n = new Subdomain();
        n.setName(name);
        n.setIp(ip);

        subdomainRepository.save(n);
        return "Saved";
    }
}

